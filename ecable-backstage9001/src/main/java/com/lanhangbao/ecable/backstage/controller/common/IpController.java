package com.lanhangbao.ecable.backstage.controller.common;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.ecable.entities.api.apiBean.IpObj;
import com.lanhangbao.ecable.entities.api.utils.IpFunction;
import com.lanhangbao.ecable.entities.bean.Ec_admin;
import com.lanhangbao.ecable.entities.bean.Ec_ip;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IpController {
    @Resource
    private RestTemplate restTemplate;
    private MultiValueMap<String, Object> form;//form
    Ec_ip ecIp;
    @Value("${service-url.nacos-user-service}")
    private String serverURL;
    Ec_admin ecAdmin;

    //getAdminPassMineId 通过自身手机号获取Eca_admin
    @PostMapping(value = "/admin/get_ip")
    @ResponseBody
    public String getAdminPassMineId(HttpServletRequest request)
    {
        Map<String, Object> map = new HashMap<>();
        int status = 1;
        String content = "从IP库中直接读取数据";
        long ip = CommonFunction.ipToLong(request);
        ecIp = new Ec_ip();
        ecIp.setIp(CommonFunction.ipToLong(request));
        form = new LinkedMultiValueMap<>();
        form.set("ecIpJson",CommonFunction.getGson().toJson(ecIp));
        String ipObj = restTemplate.postForObject(serverURL + "/ip/get_ip",form,String.class);
        //System.out.println("ipObj + " + ipObj);
        if(ipObj == null){//如果现在ip库中没有对应的ip，就去找api获取，获取完将对应的值存入ip库
            String key = "44f1062d1b4a4cdc82daac42d0aaa2ce";
            String ipStr = CommonFunction.getIp(request);
            JSONObject json = new JSONObject();
            json.put("key", "44f1062d1b4a4cdc82daac42d0aaa2ce");//key
            json.put("ip", CommonFunction.getIp(request));//ip
            String url = "https://apidatav2.chinaz.com/single/ip";
            String result = HttpRequest.post(url)
                    .timeout(60000)
                    .form(json)
                    .execute()
                    .body();
            System.out.println(result);
            System.out.println(CommonFunction.getGson().fromJson(result, IpObj.class));
            IpObj ipObj2 = CommonFunction.getGson().fromJson(result, IpObj.class);
            String ipAddress = IpFunction.getSimpleIpAddress(ipObj2.getResult());
            //插入ip库
            long cartId = 0;
            String cartName = "";
            String ecaId = CommonFunction.getSession(request,"ecaId");
            if(ecaId != null){
                cartId = Integer.valueOf(ecaId);
                ecAdmin = new Ec_admin();
                ecAdmin.setEcaId(Integer.valueOf(ecaId));
                form.set("ecAdminJson",CommonFunction.getGson().toJson(ecAdmin));
                String adminObj = restTemplate.postForObject(serverURL + "/admin/get_ip",form,String.class);
                cartName = CommonFunction.getGson().fromJson(adminObj,Ec_admin.class).getEcaName();
            }
            int platformType = 1;//管理平台
            String obtainIpDesc = request.getParameter("obtainIpDesc");
            ecIp.setCartId(cartId);
            ecIp.setCartName(cartName);
            ecIp.setPlatformType(platformType);
            ecIp.setClientType(1);//PC网页端
            ecIp.setIp(ip);
            ecIp.setIpJson(CommonFunction.getGson().toJson(ipObj2.getResult()));
            ecIp.setObtainIpDesc(obtainIpDesc);//需要给出数值
            form.set("ecIpJson",CommonFunction.getGson().toJson(ecIp));
            int insertIpStatus = Integer.valueOf(restTemplate.postForObject(serverURL + "/ip/insert",form,String.class));
            if(insertIpStatus != 1){
                status = 1;
                content = "没有插入IP库";
            }else{
                map.put("ip_address",ipAddress);
                status = 2;
                content = "插入IP库成功";
            }

        }
        map.put("status",status);
        map.put("content",content);
        return CommonFunction.getGson().toJson(map);
    }
}

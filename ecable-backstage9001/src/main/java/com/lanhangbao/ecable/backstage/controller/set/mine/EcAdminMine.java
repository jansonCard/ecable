package com.lanhangbao.ecable.backstage.controller.set.mine;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.ecable.entities.bean.Ec_admin;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
public class EcAdminMine {
    @Resource
    private RestTemplate restTemplate;
    private MultiValueMap<String, Object> form;//form
    private Ec_admin ecAdmin;//管理员表
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    //getAdminPassMineId 通过自身手机号获取Eca_admin
    @PostMapping(value = "/admin/admin/mine")
    @ResponseBody
    public String getAdminPassMineId(HttpServletRequest request, HttpServletResponse response)
    {
        Map<String, Object> map = new HashMap<>();
        int status = 0;
        String content = "";
        String ecaIdStr = CommonFunction.getSession(request,"ecaId");
        if(ecaIdStr == null){
            status = 0;
            content = "登录已失效";
        }else{
            int ecaId = Integer.parseInt(ecaIdStr);
            ecAdmin = new Ec_admin();
            ecAdmin.setEcaId(ecaId);
            form = new LinkedMultiValueMap<>();
            form.set("ecAdminJson",CommonFunction.getGson().toJson(ecAdmin));
            String adminObj = restTemplate.postForObject(serverURL + "/admin/get_mine_pass_id",form,String.class);
            ecAdmin = CommonFunction.getGson().fromJson(adminObj,Ec_admin.class);
            if(ecAdmin.getStartType() == false){
                status = 1;
                content = "您的用户信息已处于异常状态";
            }else{
                status = 2;
                content = "恭喜您，正确的获取了用户信息";
            }
        }
        map.put("status",status);
        map.put("content",content);
        return CommonFunction.getGson().toJson(map);
    }
}

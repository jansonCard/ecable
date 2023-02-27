package com.lanhangbao.ecable.backstage.controller.common;

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
public class SendCode {
    @Resource
    private RestTemplate restTemplate;
    private MultiValueMap<String, Object> form;//form
    private Ec_admin ecAdmin;//管理员表
    @Value("${service-url.nacos-user-service}")
    private String serverURL;
    //sendLoginCode
    @PostMapping(value = "/admin/login/send_code")
    @ResponseBody
    public String sendLoginCode(HttpServletRequest request)
    {
        Map<String, Object> map = new HashMap<>();
        int status = 0;
        String content = "数据错误";
        String ecaPhone = request.getParameter("ecaPhone");
        //System.out.println("ecaPhone + " + ecaPhone);
        form = new LinkedMultiValueMap<>();
        ecAdmin = new Ec_admin();
        ecAdmin.setEcaPhone(ecaPhone);
        form.add("ecAdminJson",CommonFunction.getGson().toJson(ecAdmin));
        String adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone",form,String.class);
        //System.out.println(adminObj);
        //1.先判断手机号是否已注册
        if(adminObj == null){//手机号不存在
            status = 1;
            content = "该管理员不存在，请核实";
        }else{
            String code = String.valueOf(CommonFunction.getRandom(100000,999999));
            CommonFunction.setSession(request,"codePhone",ecaPhone,600);
            CommonFunction.setSession(request,"code",code,600);
            String ip = CommonFunction.getIp(request);
            System.out.println("ecaPhone + " + ecaPhone + ";code + " + code);
            if(!ip.equals("127.0.0.1")) {
                CommonFunction.send_admin_login(ecaPhone, code);
                status = 2;
                content = "发送验证码成功，测试环境";
            }else{
                CommonFunction.send_admin_login(ecaPhone,code);
                status = 2;
                content = "发送验证码成功，正式环境";
            }
        }
        map.put("status",status);
        map.put("content",content);
        return CommonFunction.getGson().toJson(map);
    }
}

package com.lanhangbao.ecable.backstage.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.ecable.entities.bean.Ec_admin;
import com.lanhangbao.ecable.entities.bean.Eca_login;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@Slf4j
public class EcAdminLoginController {

    @Resource
    private RestTemplate restTemplate;

    private MultiValueMap<String, Object> form = new LinkedMultiValueMap<>();//form
    private  Ec_admin ecAdmin = new Ec_admin();//管理员表
    private Eca_login ecaLogin = new Eca_login();//管理员登录表


    @Value("${service-url.nacos-user-service}")
    private String serverURL;


    //loginCheck 通过手机号密码登录客户端
    @PostMapping(value = "/admin/login/password")
    @ResponseBody
    public String loginPassword(HttpServletRequest request)
    {
        Map<String, Object> map = new HashMap<>();
        int status = 0;
        String ecaPhone = request.getParameter("ecaPhone");
        String ecaPwd = CommonFunction.md5(CommonFunction.md5(request.getParameter("ecaPwd")));
        int loginType = Integer.parseInt(request.getParameter("loginType"));
        ecAdmin.setEcaPhone(ecaPhone);
        ecAdmin.setEcaPwd(CommonFunction.md5(CommonFunction.md5(ecaPwd)));
        form.add("ecAdminJson", CommonFunction.getGson().toJson(ecAdmin));
        String adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone",form,String.class);
        //1.先判断手机号是否已注册
        if(adminObj == null){//手机号不存在
            status = 1;
        }else{
            adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone_and_password",form,String.class);
            //2.判断输入的密码是否正确
            if(adminObj == null){//密码错误
                status = 2;
            }else{
                ecAdmin = CommonFunction.getGson().fromJson(adminObj,Ec_admin.class);
                //密码正确以后判断是否是第一次登录 验证他的登录信息表中是否有信息
                ecaLogin.setEcaId(ecAdmin.getEcaId());
                ecaLogin.setClientType(1);//PC端网页
                form.add("ecaLoginJson",CommonFunction.getGson().toJson(ecaLogin));
                String loginObj = restTemplate.postForObject(serverURL + "/admin/get_login_pass_ecaid",form,String.class);
                if(loginObj == null){//没有登录信息
                   status = 3; //开启短信验证
                }else{//有登录信息
                    //系统管理员和超级管理员
                }
            }
        }
        map.put("status",status);
        return CommonFunction.getGson().toJson(map);
    }
    //二次验证时发送短信验证码
    @PostMapping(value = "/admin/login/send_code")
    @ResponseBody
    public String loginSendCode(HttpServletRequest request)
    {
        Map<String, Object> map = new HashMap<>();
        String code = String.valueOf((new Random()).nextInt(9999));
        String ecaPhone = request.getParameter("ecaPhone");
        System.out.println(code);
        System.out.println(ecaPhone);
        CommonFunction.setSession(request, "code", code, 1200);
        String ip = CommonFunction.getIp(request);
        if(!ip.equals("127.0.0.1")) {
            CommonFunction.send_admin_login(ecaPhone, code);
        }
        map.put("status", 1);
        map.put("code",200);
        return CommonFunction.getGson().toJson(map);
    }
    //二次验证码登录时验证
    @PostMapping(value = "/admin/login/send_code")
    @ResponseBody
    public int login_send_check(HttpServletRequest request, HttpServletResponse response) {
        int status = 0;
        String ecaPhone = request.getParameter("ecaPhone");
        String code = request.getParameter("code");
        int loginType = Integer.parseInt(request.getParameter("loginType"));
        if (CommonFunction.getSession(request, "code") == null) {//验证码已失效
            status = 1;
        } else if (!code.equals(CommonFunction.getSession(request, "code"))) {//验证码错误
            status = 2;
        } else {//登录成功 1 插入token 2 插入登录日志
            long nowTime = System.currentTimeMillis();
            String token_name = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
            String token_string = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
            ecAdmin.setEcaPhone(ecaPhone);
            form.add("ecAdminJson", CommonFunction.getGson().toJson(ecAdmin));
            String adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone",form,String.class);
            ecAdmin = CommonFunction.getGson().fromJson(adminObj,Ec_admin.class);
            ecaLogin.setEcalId(ecAdmin.getEcaId());
            ecaLogin.setClientType(1);//PC端网页
            ecaLogin.setLoginType(loginType);
            ecaLogin.setTokenName(token_name);
            ecaLogin.setTokenString(token_string);
            ecaLogin.setPhoneStr("");
            ecaLogin.setEffectTime(nowTime);
            /*int da_id = dAdminService.getAdminPassPhone(da_phone).getDaId();
            String token = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
            String token_name = CommonFunction.md5(CommonFunction.md5(String.valueOf(da_id)));
            int session_time = CommonFunction.getCookieTime(1);
            Da_login_time login_time = daLoginTimeService.getLoginTime(da_id);
            if (login_time.getLoginTime() != null) {
                session_time = login_time.getLoginTime().intValue();
            }
            CommonFunction.setCookie(response, token_name, token, CommonFunction.getCookieTime(1));
            CommonFunction.setSession(request, "da_id", String.valueOf(da_id), session_time);
            daTokenService.deal(da_id, token_name, token);
            D_admin admin = dAdminService.getAdminPassPhone(da_phone);
            Da_login_log log = new Da_login_log();
            log.setDaId(da_id);
            log.setDaName(admin.getDaName());
            log.setAdminType(admin.getTypeId());
            log.setTypeId(1);//1登录 2退出
            log.setTokenName(token_name);
            log.setTokenString(token);
            log.setIp(CommonFunction.ipToLong(CommonFunction.getIp(request)));
            daLoginLogService.deal(log);*/
            status = 3;
        }
        return status;
    }
}

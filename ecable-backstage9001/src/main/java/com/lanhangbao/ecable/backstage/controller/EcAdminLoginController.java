package com.lanhangbao.ecable.backstage.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.ecable.entities.bean.Ec_admin;
import com.lanhangbao.ecable.entities.bean.Eca_login;
import com.lanhangbao.ecable.entities.bean.Eca_login_log;
import com.lanhangbao.ecable.entities.bean.Eca_login_time;
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
import java.util.Random;

@RestController
public class EcAdminLoginController {

    @Resource
    private RestTemplate restTemplate;

    private MultiValueMap<String, Object> form;//form
    private  Ec_admin ecAdmin;//管理员表
    private Eca_login ecaLogin;//管理员登录表
    private Eca_login_log ecaLoginLog;//管理员登录日志


    @Value("${service-url.nacos-user-service}")
    private String serverURL;


    //loginCheck 通过手机号密码登录客户端
    @PostMapping(value = "/admin/login/password")
    @ResponseBody
    public String loginPassword(HttpServletRequest request,HttpServletResponse response)
    {
        Map<String, Object> map = new HashMap<>();
        int status = 0;
        String content = "";
        String ecaPhone = request.getParameter("ecaPhone");
        String ecaPwd = CommonFunction.md5(CommonFunction.md5(request.getParameter("ecaPwd")));
        int loginType = Integer.parseInt(request.getParameter("loginType"));
        form = new LinkedMultiValueMap<>();
        ecAdmin = new Ec_admin();
        ecAdmin.setEcaPhone(ecaPhone);
        ecAdmin.setEcaPwd(ecaPwd);
        form.set("ecAdminJson", CommonFunction.getGson().toJson(ecAdmin));
        String adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone",form,String.class);
        //1.先判断手机号是否已注册
        if(adminObj == null){//手机号不存在
            status = 1;
            content = "该管理员不存在，请核实";
        }else{
            adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone_and_password",form,String.class);
            //2.判断输入的密码是否正确
            if(adminObj == null){//密码错误
                status = 2;
                content = "小莜莜提醒您，您的密码不对哟！";
            }else{
                ecAdmin = CommonFunction.getGson().fromJson(adminObj,Ec_admin.class);
                //密码正确以后判断是否是第一次登录 验证他的登录信息表中是否有信息
                ecaLogin = new Eca_login();
                ecaLogin.setEcaId(ecAdmin.getEcaId());
                ecaLogin.setClientType(1);//PC端网页
                form.set("ecaLoginJson",CommonFunction.getGson().toJson(ecaLogin));
                String loginObj = restTemplate.postForObject(serverURL + "/admin/get_login_pass_ecaid",form,String.class);
                if(loginObj == null){//没有登录信息
                   status = 3; //开启短信验证
                    content = "小莜莜提醒您，您需要短信验证才能登录哟";
                }else{//有登录信息
                    ecaLogin = CommonFunction.getGson().fromJson(loginObj,Eca_login.class);
                    String cookieToken = CommonFunction.getCookie(request,ecaLogin.getTokenName());
                    String tokenName = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
                    String tokenString = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
                    if(ecAdmin.getAdminType() == 0 || ecAdmin.getAdminType() == 1){//系统管理员和超级管理员
                        if(cookieToken == null || cookieToken.equals("0")){//没有cookie存cookie存loginLog存session存登录信息
                            //更新管理员登录信息表
                            int ecaLoginInsertStatus = insertEcaLogin(ecAdmin,loginType,tokenName,tokenString);
                            if(ecaLoginInsertStatus != 1){//如果插入不成功
                                status = 4;//登录信息存储失败
                                content = "管理员登录信息存储失败";
                            }else{//如果插入成功设置sessionTime
                                //存登录日志
                                int ecaLoginLogInsertStatus = insertEcaLoginLog(request,ecAdmin,tokenName,tokenString);
                                if(ecaLoginLogInsertStatus != 1){//如果插入不成功
                                    status = 5;//管理员登录日志存储失败
                                    content = "管理员登录日志存储失败";
                                }else{//如果插入成功
                                    //存session ecaId 存cookie token 限制登录
                                    form.set("ecaId",ecAdmin.getEcaId());
                                    String ecaLoginTimeObj = restTemplate.postForObject(serverURL + "/admin/login_time/get_login_time_pass_ecaid",form,String.class);
                                    Eca_login_time loginTime = CommonFunction.getGson().fromJson(ecaLoginTimeObj,Eca_login_time.class);
                                    int cookieTime = CommonFunction.getSaveTime(1);
                                    int sessionTime = CommonFunction.getSaveTime(2);
                                    if (loginTime != null) {
                                        sessionTime = loginTime.getLoginTime();
                                    }
                                    CommonFunction.setCookie(response, tokenName, tokenString, cookieTime);
                                    CommonFunction.setSession(request, "ecaId", String.valueOf(ecAdmin.getEcaId()), sessionTime);
                                    content = "恭喜您，您登录成功了，准备起飞";
                                    status = 7;
                                }
                            }
                        }else{//存在cookie
                            if(!cookieToken.equals(ecaLogin.getTokenString())){
                                status = 3;//需要二次验证
                            }else{
                                //更新管理员登录信息表
                                int ecaLoginInsertStatus = insertEcaLogin(ecAdmin,loginType,tokenName,tokenString);
                                if(ecaLoginInsertStatus != 1){//如果插入不成功
                                    status = 4;//登录信息存储失败
                                    content = "管理员登录信息存储失败";
                                }else{//如果插入成功设置sessionTime
                                    //存登录日志
                                    int ecaLoginLogInsertStatus = insertEcaLoginLog(request,ecAdmin,tokenName,tokenString);
                                    if(ecaLoginLogInsertStatus != 1){//如果插入不成功
                                        status = 5;//管理员登录日志存储失败
                                        content = "管理员登录日志存储失败";
                                    }else{//如果插入成功
                                        //存session ecaId 存cookie token 限制登录
                                        form.set("ecaId",ecAdmin.getEcaId());
                                        String ecaLoginTimeObj = restTemplate.postForObject(serverURL + "/admin/login_time/get_login_time_pass_ecaid",form,String.class);
                                        Eca_login_time loginTime = CommonFunction.getGson().fromJson(ecaLoginTimeObj,Eca_login_time.class);
                                        int cookieTime = CommonFunction.getSaveTime(1);
                                        int sessionTime = CommonFunction.getSaveTime(2);
                                        if (loginTime != null) {
                                            sessionTime = loginTime.getLoginTime();
                                        }
                                        CommonFunction.setCookie(response, tokenName, tokenString, cookieTime);
                                        CommonFunction.setSession(request, "ecaId", String.valueOf(ecAdmin.getEcaId()), sessionTime);
                                        content = "恭喜您，您登录成功了，准备起飞";
                                        status = 7;
                                    }
                                }
                            }
                        }
                    }else{//除系统管理员和超级管理员以外的其它员工
                        if(cookieToken == null || cookieToken.equals("0")){//没有cookie存cookie存loginLog存session存登录信息
                            //更新管理员登录信息表
                            int ecaLoginInsertStatus = insertEcaLogin(ecAdmin,loginType,tokenName,tokenString);
                            if(ecaLoginInsertStatus != 1){//如果插入不成功
                                status = 4;//登录信息存储失败
                                content = "管理员登录信息存储失败";
                            }else{//如果插入成功设置sessionTime
                                //存登录日志
                                int ecaLoginLogInsertStatus = insertEcaLoginLog(request,ecAdmin,tokenName,tokenString);
                                if(ecaLoginLogInsertStatus != 1){//如果插入不成功
                                    status = 5;//管理员登录日志存储失败
                                    content = "管理员登录日志存储失败";
                                }else{//如果插入成功
                                    //存session ecaId 存cookie token 限制登录
                                    form.set("ecaId",ecAdmin.getEcaId());
                                    String ecaLoginTimeObj = restTemplate.postForObject(serverURL + "/admin/login_time/get_login_time_pass_ecaid",form,String.class);
                                    Eca_login_time loginTime = CommonFunction.getGson().fromJson(ecaLoginTimeObj,Eca_login_time.class);
                                    int cookieTime = CommonFunction.getSaveTime(1);
                                    int sessionTime = CommonFunction.getSaveTime(2);
                                    if (loginTime != null) {
                                        sessionTime = loginTime.getLoginTime();
                                    }
                                    CommonFunction.setCookie(response, tokenName, tokenString, cookieTime);
                                    CommonFunction.setSession(request, "ecaId", String.valueOf(ecAdmin.getEcaId()), sessionTime);
                                    content = "恭喜您，您登录成功了，准备起飞";
                                    status = 7;
                                }
                            }
                        }else{
                            status = 6;
                            content = "您没有用绑定的电脑登录哟！";
                        }
                    }
                }
            }
        }
        map.put("status",status);
        map.put("content",content);
        return CommonFunction.getGson().toJson(map);
    }
    //二次验证时发送短信验证码
    @PostMapping(value = "/admin/login/send_code")
    @ResponseBody
    public String loginSendCode(HttpServletRequest request)
    {
        Map<String, Object> map = new HashMap<>();
        int status = 0;
        String content = "";
        String code = String.valueOf((new Random()).nextInt(9999));
        String ecaPhone = request.getParameter("ecaPhone");
        System.out.println("code + " + code);
        System.out.println("ecaPhone + " + ecaPhone);
        CommonFunction.setSession(request, "code", code, 1200);
        String ip = CommonFunction.getIp(request);
        if(!ip.equals("127.0.0.1")) {
            CommonFunction.send_admin_login(ecaPhone, code);
            status = 1;
            content = "发送验证码成功，测试环境";
        }else{
            status = 2;
            content = "发送验证码成功，正式环境";
        }
        map.put("status", status);
        map.put("content",content);
        return CommonFunction.getGson().toJson(map);
    }
    //二次验证码登录时验证
    @PostMapping(value = "/admin/login/code_submit")
    @ResponseBody
    public String codeSubmit(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        int status = 0;
        String content = "";
        String ecaPhone = request.getParameter("ecaPhone");
        String code = request.getParameter("code");
        int loginType = Integer.parseInt(request.getParameter("loginType"));
        String sessionCode = CommonFunction.getSession(request,"code");
        if (CommonFunction.getSession(request, "code") == null) {//验证码已失效
            status = 1;
            content = "验证码已失效";
        } else if (!code.equals(sessionCode)) {//验证码错误
            status = 2;
            content = "验证码验证错误";
        } else {//登录成功 1 插入token 2 插入登录日志
            form = new LinkedMultiValueMap<>();
            ecAdmin = new Ec_admin();
            String tokenName = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
            String tokenString = CommonFunction.md5(CommonFunction.md5(String.valueOf(System.currentTimeMillis())));
            ecAdmin.setEcaPhone(ecaPhone);
            form.set("ecAdminJson", CommonFunction.getGson().toJson(ecAdmin));
            String adminObj = restTemplate.postForObject(serverURL + "/admin/get_admin_pass_phone",form,String.class);
            ecAdmin = CommonFunction.getGson().fromJson(adminObj,Ec_admin.class);
            //System.out.println(CommonFunction.getGson().toJson(ecAdmin));
            //插入管理员登录信息表
            int ecaLoginInsertStatus = insertEcaLogin(ecAdmin,loginType,tokenName,tokenString);
            if(ecaLoginInsertStatus != 1){//如果插入不成功
                status = 3;//登录信息存储失败
                content = "管理员登录信息存储失败";
            }else{//如果插入成功设置sessionTime
                //存登录日志
                int ecaLoginLogInsertStatus = insertEcaLoginLog(request,ecAdmin,tokenName,tokenString);
                if(ecaLoginLogInsertStatus != 1){//如果插入不成功
                    status = 4;//管理员登录日志存储失败
                    content = "管理员登录日志存储失败";
                }else{//如果插入成功
                    //存session ecaId 存cookie token 限制登录
                    form.set("ecaId",ecAdmin.getEcaId());
                    String ecaLoginTimeObj = restTemplate.postForObject(serverURL + "/admin/login_time/get_login_time_pass_ecaid",form,String.class);
                    Eca_login_time loginTime = CommonFunction.getGson().fromJson(ecaLoginTimeObj,Eca_login_time.class);
                    int cookieTime = CommonFunction.getSaveTime(1);
                    int sessionTime = CommonFunction.getSaveTime(2);
                    if (loginTime != null) {
                        sessionTime = loginTime.getLoginTime();
                    }
                    CommonFunction.setCookie(response, tokenName, tokenString, cookieTime);
                    CommonFunction.setSession(request, "ecaId", String.valueOf(ecAdmin.getEcaId()), sessionTime);
                    content = "恭喜您，您登录成功了，准备起飞";
                    status = 5;
                }
            }
        }
        map.put("status", status);
        map.put("content",content);
        return CommonFunction.getGson().toJson(map);
    }
    //insertEcaLogin 存储登录信息
    public int insertEcaLogin(Ec_admin ecAdmin, int loginType, String tokenName, String tokenString)
    {
        int status = 0;
        System.out.println("ecAdmin + " + CommonFunction.getGson().toJson(ecAdmin));
        ecaLogin = new Eca_login();
        ecaLogin.setEcaId(ecAdmin.getEcaId());
        ecaLogin.setClientType(1);//PC端网页
        ecaLogin.setLoginType(loginType);
        ecaLogin.setTokenName(tokenName);
        ecaLogin.setTokenString(tokenString);
        ecaLogin.setPhoneStr("");
        ecaLogin.setEffectTime(System.currentTimeMillis());
        form.set("ecaLoginJson",CommonFunction.getGson().toJson(ecaLogin));
        String ecaLoginInsertStatusObj = restTemplate.postForObject(serverURL + "/admin/insert_login_message",form,String.class);
        status = Integer.parseInt(ecaLoginInsertStatusObj);
        return status;
    }
    //insertEcaLoginLog 存储管理员登录信息
    public int insertEcaLoginLog(HttpServletRequest request,Ec_admin ecAdmin,String tokenName,String tokenString)
    {
        int status = 0;
        ecaLoginLog = new Eca_login_log();
        ecaLoginLog.setEcaId(ecAdmin.getEcaId());
        ecaLoginLog.setEcaName(ecAdmin.getEcaName());
        ecaLoginLog.setAdminType(ecAdmin.getAdminType());
        ecaLoginLog.setClientType(1);
        ecaLoginLog.setTypeId(1);//登录
        ecaLoginLog.setTokenName(tokenName);
        ecaLoginLog.setTokenString(tokenString);
        ecaLoginLog.setIp(CommonFunction.ipToLong(request));
        ecaLoginLog.setIpAddress(CommonFunction.getIpAddress(request));
        ecaLoginLog.setAddTime(System.currentTimeMillis());
        form.set("ecaLoginLogJson",CommonFunction.getGson().toJson(ecaLoginLog));
        String ecaLoginLogInsertStatusObj = restTemplate.postForObject(serverURL + "/admin/eca_login_log/insert",form,String.class);
        status = Integer.parseInt(ecaLoginLogInsertStatusObj);
        return status;
    }
}

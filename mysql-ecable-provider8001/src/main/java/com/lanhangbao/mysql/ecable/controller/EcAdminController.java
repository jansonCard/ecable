package com.lanhangbao.mysql.ecable.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Ec_admin;
import com.lanhangbao.mysql.ecable.service.EcAdminService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class EcAdminController
{

    EcAdminService ecAdminService;

    public EcAdminController(EcAdminService ecAdminService) {
        this.ecAdminService = ecAdminService;
    }


    //getAdminPassPHone通过手机号获取管理员信息
    @PostMapping({"/admin/get_admin_pass_phone"})
    @ResponseBody
    public Ec_admin getAdminPassPhone(@Param("ecAdminJson") String ecAdminJson)
    {
        System.out.println(ecAdminJson);
        return ecAdminService.getEcAdminPassPhone(CommonFunction.getGson().fromJson(ecAdminJson,Ec_admin.class).getEcaPhone());
    }
    //getAdminPassPhoneAndPassword 通过手机号和密码获取管理员信息
    @PostMapping({"/admin/get_admin_pass_phone_and_password"})
    @ResponseBody
    public Ec_admin getAdminPassPhoneAndPassword(@Param("ecAdminJson") String ecAdminJson)
    {
        Ec_admin ecAdmin = CommonFunction.getGson().fromJson(ecAdminJson,Ec_admin.class);
        return ecAdminService.getEcAdminPassPhoneAndPassword(ecAdmin.getEcaPhone(),ecAdmin.getEcaPwd());
    }
    //updateAdminPasswordPassId 通手ecaId修改密码
    @PostMapping({"/admin/update_admin_password_pass_id"})
    @ResponseBody
    public int updateAdminPasswordPassId(@Param("ecAdminJson") String ecAdminJson)
    {
       return ecAdminService.updatePassId(CommonFunction.getGson().fromJson(ecAdminJson,Ec_admin.class));
    }
}

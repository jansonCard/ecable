package com.lanhangbao.mysql.ecable.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Eca_login;
import com.lanhangbao.mysql.ecable.service.EcaLoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//管理员登录信息
@RestController
public class EcaLoginController {
    private final EcaLoginService ecaLoginService;

    public EcaLoginController(EcaLoginService ecaLoginService) {
        this.ecaLoginService = ecaLoginService;
    }

    //getEcaLogin 通过ecaId获取管理员login信息
    @PostMapping({"/admin/get_login_pass_ecaid"})
    @ResponseBody
    public Eca_login getAdminLoginPassEcaId(@Param("ecaLoginJson") String ecaLoginJson)
    {
        Eca_login ecaLogin = CommonFunction.getGson().fromJson(ecaLoginJson,Eca_login.class);
        //System.out.println(CommonFunction.getGson().toJson(ecaLoginJson));
        return ecaLoginService.getEcaLoginPassEcaId(ecaLogin);
    }
    //insertEcaLogin 通过ecaId获取管理员login信息
    @PostMapping({"/admin/insert_login_message"})
    @ResponseBody
    public int insertEcaLogin(@Param("ecaLoginJson") String ecaLoginJson)
    {
        //System.out.println("ecaLoginJson + " + ecaLoginJson);
        Eca_login ecaLogin = CommonFunction.getGson().fromJson(ecaLoginJson,Eca_login.class);
        //System.out.println("ecaLogin + " + CommonFunction.getGson().toJson(ecaLogin));
        return ecaLoginService.insert(ecaLogin);
    }
}

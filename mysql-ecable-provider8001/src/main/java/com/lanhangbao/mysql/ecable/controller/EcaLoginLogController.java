package com.lanhangbao.mysql.ecable.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Ec_admin;
import com.lanhangbao.mysql.ecable.bean.Eca_login_log;
import com.lanhangbao.mysql.ecable.service.EcaLoginLogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcaLoginLogController {
   private final EcaLoginLogService ecaLoginLogService;

    public EcaLoginLogController(EcaLoginLogService ecaLoginLogService) {
        this.ecaLoginLogService = ecaLoginLogService;
    }
    //insertEcaLoginLog 插入数据
    @PostMapping({"/admin/eca_login_log/insert"})
    @ResponseBody
    public int updateAdminPasswordPassId(@Param("ecaLoginLogJson") String ecaLoginLogJson)
    {
        System.out.println(ecaLoginLogJson);
        return ecaLoginLogService.insert(CommonFunction.getGson().fromJson(ecaLoginLogJson, Eca_login_log.class));
    }
}

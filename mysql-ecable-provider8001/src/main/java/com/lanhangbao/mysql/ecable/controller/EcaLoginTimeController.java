package com.lanhangbao.mysql.ecable.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Eca_login;
import com.lanhangbao.mysql.ecable.bean.Eca_login_time;
import com.lanhangbao.mysql.ecable.service.EcaLoginTimeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcaLoginTimeController {
    private final EcaLoginTimeService ecaLoginTimeService;

    public EcaLoginTimeController(EcaLoginTimeService ecaLoginTimeService) {
        this.ecaLoginTimeService = ecaLoginTimeService;
    }

    //getLoginTimePassEcaId 通过ecaId获取管理员login信息
    @PostMapping({"/admin/login_time/get_login_time_pass_ecaid"})
    @ResponseBody
    public Eca_login_time getLoginTimePassEcaId(@Param("ecaId") String ecaId)
    {
        Eca_login_time ecaLoginTime = ecaLoginTimeService.getLoginTimePassEcaId(Integer.parseInt(ecaId));
        return ecaLoginTime;
    }
}

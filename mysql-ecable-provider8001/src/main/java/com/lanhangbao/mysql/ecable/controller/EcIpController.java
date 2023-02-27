package com.lanhangbao.mysql.ecable.controller;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Ec_ip;
import com.lanhangbao.mysql.ecable.service.EcIpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcIpController {
    private final EcIpService ecIpService;

    public EcIpController(EcIpService ecIpService) {
        this.ecIpService = ecIpService;
    }
    private Ec_ip ecIp;
    //getEcIpPassIp 通过IP获取Ec_ip
    @PostMapping({"/ip/get_ip"})
    @ResponseBody
    public Ec_ip getEcIpPassIp(@Param("ecIpJson") String ecIpJson)
    {
        //System.out.println(ecIpJson);
        ecIp = CommonFunction.getGson().fromJson(ecIpJson,Ec_ip.class);
        return ecIpService.getEcIpPassIp(ecIp);
    }
    //insert 插入ip库
    @PostMapping({"/ip/insert"})
    @ResponseBody
    public int insert(@Param("ecIpJson") String ecIpJson)
    {
        //System.out.println(ecIpJson);
        ecIp = CommonFunction.getGson().fromJson(ecIpJson,Ec_ip.class);
        return ecIpService.insert(ecIp);
    }
}

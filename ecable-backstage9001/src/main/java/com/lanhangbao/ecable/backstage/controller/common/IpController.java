package com.lanhangbao.ecable.backstage.controller.common;

import com.lanhangbao.ecable.entities.bean.Ec_ip;
import jakarta.annotation.Resource;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IpController {
    @Resource
    private RestTemplate restTemplate;
    private MultiValueMap<String, Object> form;//form
    Ec_ip ecIp;
}

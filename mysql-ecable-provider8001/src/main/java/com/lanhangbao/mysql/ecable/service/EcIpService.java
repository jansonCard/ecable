package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.mysql.ecable.bean.Ec_ip;
import com.lanhangbao.mysql.ecable.bean.Ec_ipExample;
import com.lanhangbao.mysql.ecable.dao.Ec_ipMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcIpService {
    @Resource
    Ec_ipMapper ecIpMapper;
    private Ec_ip ecIp;
    private Ec_ipExample example;
    private Ec_ipExample.Criteria criteria;
    //getEcIpPassIp
    public Ec_ip getEcIpPassIp(Ec_ip ecIp)
    {
        ecIp = null;
        example = new Ec_ipExample();
        criteria = example.createCriteria();
        List<Ec_ip> list = ecIpMapper.selectByExample(example);
        if(!list.isEmpty()){
            ecIp = list.get(0);
        }
        return ecIp;
    }
    //insert
    public int insert(Ec_ip record)
    {
        record.setAddTime(System.currentTimeMillis());
        return ecIpMapper.insertSelective(record);
    }
}

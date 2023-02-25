package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.mysql.ecable.bean.Eca_login;
import com.lanhangbao.mysql.ecable.bean.Eca_loginExample;
import com.lanhangbao.mysql.ecable.dao.Eca_loginMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

//管理员登录信息表
@Service
public class EcaLoginService {
    @Resource
    Eca_loginMapper ecaLoginMapper;
    private Eca_loginExample example;
    private Eca_loginExample.Criteria criteria;
    /*getEcaLoginPassEcaId 通过ecaId获取管理员登录信息*/
    public Eca_login getEcaLoginPassEcaId(Eca_login record)
    {
        Eca_login ecaLogin = null;
        example = new Eca_loginExample();
        criteria = example.createCriteria();
        criteria.andEcaIdEqualTo(record.getEcaId());
        criteria.andClientTypeEqualTo(record.getClientType());
        List<Eca_login> list = ecaLoginMapper.selectByExample(example);
        if(!list.isEmpty()){
            ecaLogin = list.get(0);
        }
        return ecaLogin;
    }
    //insert 插入数据
    public int insert(Eca_login record)
    {
        int ecaId = record.getEcaId();
        example = new Eca_loginExample();
        criteria = example.createCriteria();
        criteria.andEcaIdEqualTo(record.getEcaId());
        criteria.andClientTypeEqualTo(record.getClientType());
        List<Eca_login> list = ecaLoginMapper.selectByExample(example);
        if(!list.isEmpty()){
            return ecaLoginMapper.insertSelective(record);
        }else{
            return ecaLoginMapper.updateByExampleSelective(record,example);
        }
    }
}

package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.mysql.ecable.bean.Eca_loginExample;
import com.lanhangbao.mysql.ecable.bean.Eca_login_time;
import com.lanhangbao.mysql.ecable.bean.Eca_login_timeExample;
import com.lanhangbao.mysql.ecable.dao.Eca_loginMapper;
import com.lanhangbao.mysql.ecable.dao.Eca_login_timeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcaLoginTimeService {
    @Resource
    Eca_login_timeMapper ecaLoginTimeMapper;
    Eca_login_timeExample example = new Eca_login_timeExample();
    Eca_login_timeExample.Criteria criteria = example.createCriteria();
    //getLoginTimePassEcaId 通过ecaId获取Eca_login_time
    public Eca_login_time getLoginTimePassEcaId(int ecaId)
    {
        Eca_login_time ecaLoginTime = null;
        criteria.andEcaIdEqualTo(ecaId);
        List<Eca_login_time> list = ecaLoginTimeMapper.selectByExample(example);
        if(!list.isEmpty()){
            ecaLoginTime = list.get(0);
        }
        return ecaLoginTime;
    }
}

package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.mysql.ecable.bean.Eca_login_log;
import com.lanhangbao.mysql.ecable.bean.Eca_login_logExample;
import com.lanhangbao.mysql.ecable.dao.Eca_login_logMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EcaLoginLogService {
    @Resource
    Eca_login_logMapper ecaLoginLogMapper;
    Eca_login_logExample example;
    Eca_login_logExample.Criteria criteria;
    //insert 插入
    public int insert(Eca_login_log record)
    {
        return ecaLoginLogMapper.insert(record);
    }
}

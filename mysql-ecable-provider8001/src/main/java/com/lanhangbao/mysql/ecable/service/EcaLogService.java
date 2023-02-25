package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Eca_log;
import com.lanhangbao.mysql.ecable.dao.Eca_logMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public class EcaLogService {
    @Resource
    Eca_logMapper ecaLogMapper;
    //insert 插入数据
    public int insert(HttpServletRequest request,Eca_log record)
    {
        long ip = CommonFunction.ipToLong(request);
        String ipAddress = CommonFunction.getIpAddress(request);
        record.setIp(ip);
        record.setIpAddress(ipAddress);
        record.setAddTime(System.currentTimeMillis());
        return ecaLogMapper.insert(record);
    }
}

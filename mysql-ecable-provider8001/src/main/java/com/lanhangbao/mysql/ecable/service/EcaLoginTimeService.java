package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.ecable.entities.CommonFunction;
import com.lanhangbao.mysql.ecable.bean.Ec_admin;
import com.lanhangbao.mysql.ecable.bean.Eca_log;
import com.lanhangbao.mysql.ecable.bean.Eca_login_time;
import com.lanhangbao.mysql.ecable.bean.Eca_login_timeExample;
import com.lanhangbao.mysql.ecable.dao.Eca_login_timeMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.List;

@Service
public class EcaLoginTimeService {
    @Resource
    Eca_login_timeMapper ecaLoginTimeMapper;
    Eca_login_timeExample example = new Eca_login_timeExample();
    Eca_login_timeExample.Criteria criteria = example.createCriteria();
    @Resource
    EcaLogService ecaLogService;
    @Resource
    EcAdminService ecAdminService;
    Ec_admin ecAdmin;
    private Eca_log ecaLog;
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
    //deal
    public int deal(HttpServletRequest request,Eca_login_time record,int clientType) {
        int status = 0;
        int ecaId = record.getEcaId();
        criteria.andEcaIdEqualTo(ecaId);
        List<Eca_login_time> list = ecaLoginTimeMapper.selectByExample(example);
        String description = "";
        if(list.isEmpty()){//插入
            status = ecaLoginTimeMapper.insert(record);
            if(status == 0){
                return status;
            }
        }else{//修改
            status = ecaLoginTimeMapper.updateByExample(record,example);
            if(status == 0){
                return status;
            }
        }
        ecAdmin.setEcaId(ecaId);
        ecAdmin = ecAdminService.getAdminPassId(ecAdmin);
        ecaLog.setEcaId(record.getEcaId());
        ecaLog.setEcaName(ecAdmin.getEcaName());
        ecaLog.setClientType(clientType);
        return status;
    }
}

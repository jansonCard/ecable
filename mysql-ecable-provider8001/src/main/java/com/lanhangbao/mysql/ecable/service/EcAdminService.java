package com.lanhangbao.mysql.ecable.service;

import com.lanhangbao.mysql.ecable.bean.Ec_admin;
import com.lanhangbao.mysql.ecable.bean.Ec_adminExample;
import com.lanhangbao.mysql.ecable.dao.Ec_adminMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EcAdminService {
    @Resource
    Ec_adminMapper ecAdminMapper;
    private Ec_admin ecAdmin;
    private Ec_adminExample example;
    private Ec_adminExample.Criteria criteria;
    //insert 插入管理员
    public int insert(Ec_admin record){
        return ecAdminMapper.insert(record);
    }
    //getEcAdminPassPhone 通过手机号码获取管理员信息
    public Ec_admin getEcAdminPassPhone(String ecaPhone){
        ecAdmin =  null;
        example = new Ec_adminExample();
        criteria = example.createCriteria();
        criteria.andEcaPhoneEqualTo(ecaPhone);
        List<Ec_admin> list = ecAdminMapper.selectByExample(example);
        if(!list.isEmpty()){
            ecAdmin = list.get(0);
        }
        return ecAdmin;
    }
    //getAdminPassPhoneAndPassword 通过手机号码和密码获取管理员信息
    public Ec_admin getEcAdminPassPhoneAndPassword(String ecaPhone,String ecaPwd){
        ecAdmin =  null;
        example = new Ec_adminExample();
        criteria = example.createCriteria();
        criteria.andEcaPhoneEqualTo(ecaPhone);
        criteria.andEcaPwdEqualTo(ecaPwd);
        List<Ec_admin> list = ecAdminMapper.selectByExample(example);
        if(!list.isEmpty()){
            ecAdmin = list.get(0);
        }
        return ecAdmin;
    }
    //updatePassId 通过id修改管理员表
    public int updatePassId(Ec_admin record){
        return ecAdminMapper.updateByPrimaryKeySelective(record);
    }

}

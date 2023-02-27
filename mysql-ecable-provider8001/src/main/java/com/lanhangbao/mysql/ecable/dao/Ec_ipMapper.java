package com.lanhangbao.mysql.ecable.dao;

import com.lanhangbao.mysql.ecable.bean.Ec_ip;
import com.lanhangbao.mysql.ecable.bean.Ec_ipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ec_ipMapper {
    long countByExample(Ec_ipExample example);

    int deleteByExample(Ec_ipExample example);

    int deleteByPrimaryKey(Long eciId);

    int insert(Ec_ip row);

    int insertSelective(Ec_ip row);

    List<Ec_ip> selectByExample(Ec_ipExample example);

    Ec_ip selectByPrimaryKey(Long eciId);

    int updateByExampleSelective(@Param("row") Ec_ip row, @Param("example") Ec_ipExample example);

    int updateByExample(@Param("row") Ec_ip row, @Param("example") Ec_ipExample example);

    int updateByPrimaryKeySelective(Ec_ip row);

    int updateByPrimaryKey(Ec_ip row);
}
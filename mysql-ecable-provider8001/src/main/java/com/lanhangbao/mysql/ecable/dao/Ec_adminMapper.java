package com.lanhangbao.mysql.ecable.dao;

import com.lanhangbao.mysql.ecable.bean.Ec_admin;
import com.lanhangbao.mysql.ecable.bean.Ec_adminExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface Ec_adminMapper {
    long countByExample(Ec_adminExample example);

    int deleteByExample(Ec_adminExample example);

    int deleteByPrimaryKey(Integer ecaId);

    int insert(Ec_admin row);

    int insertSelective(Ec_admin row);

    List<Ec_admin> selectByExample(Ec_adminExample example);

    Ec_admin selectByPrimaryKey(Integer ecaId);

    int updateByExampleSelective(@Param("row") Ec_admin row, @Param("example") Ec_adminExample example);

    int updateByExample(@Param("row") Ec_admin row, @Param("example") Ec_adminExample example);

    int updateByPrimaryKeySelective(Ec_admin row);

    int updateByPrimaryKey(Ec_admin row);
}
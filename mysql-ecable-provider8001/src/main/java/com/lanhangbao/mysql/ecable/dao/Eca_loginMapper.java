package com.lanhangbao.mysql.ecable.dao;

import com.lanhangbao.mysql.ecable.bean.Eca_login;
import com.lanhangbao.mysql.ecable.bean.Eca_loginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Eca_loginMapper {
    long countByExample(Eca_loginExample example);

    int deleteByExample(Eca_loginExample example);

    int deleteByPrimaryKey(Integer ecalId);

    int insert(Eca_login row);

    int insertSelective(Eca_login row);

    List<Eca_login> selectByExample(Eca_loginExample example);

    Eca_login selectByPrimaryKey(Integer ecalId);

    int updateByExampleSelective(@Param("row") Eca_login row, @Param("example") Eca_loginExample example);

    int updateByExample(@Param("row") Eca_login row, @Param("example") Eca_loginExample example);

    int updateByPrimaryKeySelective(Eca_login row);

    int updateByPrimaryKey(Eca_login row);
}
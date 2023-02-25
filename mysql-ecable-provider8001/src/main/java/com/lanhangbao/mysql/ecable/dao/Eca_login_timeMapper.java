package com.lanhangbao.mysql.ecable.dao;

import com.lanhangbao.mysql.ecable.bean.Eca_login_time;
import com.lanhangbao.mysql.ecable.bean.Eca_login_timeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Eca_login_timeMapper {
    long countByExample(Eca_login_timeExample example);

    int deleteByExample(Eca_login_timeExample example);

    int deleteByPrimaryKey(Integer ecaltId);

    int insert(Eca_login_time row);

    int insertSelective(Eca_login_time row);

    List<Eca_login_time> selectByExample(Eca_login_timeExample example);

    Eca_login_time selectByPrimaryKey(Integer ecaltId);

    int updateByExampleSelective(@Param("row") Eca_login_time row, @Param("example") Eca_login_timeExample example);

    int updateByExample(@Param("row") Eca_login_time row, @Param("example") Eca_login_timeExample example);

    int updateByPrimaryKeySelective(Eca_login_time row);

    int updateByPrimaryKey(Eca_login_time row);
}
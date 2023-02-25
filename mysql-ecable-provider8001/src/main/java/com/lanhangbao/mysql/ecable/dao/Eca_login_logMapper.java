package com.lanhangbao.mysql.ecable.dao;

import com.lanhangbao.mysql.ecable.bean.Eca_login_log;
import com.lanhangbao.mysql.ecable.bean.Eca_login_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Eca_login_logMapper {
    long countByExample(Eca_login_logExample example);

    int deleteByExample(Eca_login_logExample example);

    int deleteByPrimaryKey(Integer ecallId);

    int insert(Eca_login_log record);

    int insertSelective(Eca_login_log row);

    List<Eca_login_log> selectByExample(Eca_login_logExample example);

    Eca_login_log selectByPrimaryKey(Integer ecallId);

    int updateByExampleSelective(@Param("row") Eca_login_log row, @Param("example") Eca_login_logExample example);

    int updateByExample(@Param("row") Eca_login_log row, @Param("example") Eca_login_logExample example);

    int updateByPrimaryKeySelective(Eca_login_log row);

    int updateByPrimaryKey(Eca_login_log row);
}
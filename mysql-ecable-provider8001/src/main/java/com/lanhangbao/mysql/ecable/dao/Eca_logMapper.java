package com.lanhangbao.mysql.ecable.dao;

import com.lanhangbao.mysql.ecable.bean.Eca_log;
import com.lanhangbao.mysql.ecable.bean.Eca_logExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Eca_logMapper {
    long countByExample(Eca_logExample example);

    int deleteByExample(Eca_logExample example);

    int deleteByPrimaryKey(Integer ecalId);

    int insert(Eca_log row);

    int insertSelective(Eca_log row);

    List<Eca_log> selectByExample(Eca_logExample example);

    Eca_log selectByPrimaryKey(Integer ecalId);

    int updateByExampleSelective(@Param("row") Eca_log row, @Param("example") Eca_logExample example);

    int updateByExample(@Param("row") Eca_log row, @Param("example") Eca_logExample example);

    int updateByPrimaryKeySelective(Eca_log row);

    int updateByPrimaryKey(Eca_log row);
}
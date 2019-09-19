package com.phantom.dao;

import com.phantom.model.TWechatLog;
import com.phantom.model.TWechatLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWechatLogDao {
    long countByExample(TWechatLogExample example);

    int deleteByExample(TWechatLogExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TWechatLog record);

    int insertSelective(TWechatLog record);

    List<TWechatLog> selectByExampleWithBLOBs(TWechatLogExample example);

    List<TWechatLog> selectByExample(TWechatLogExample example);

    TWechatLog selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TWechatLog record, @Param("example") TWechatLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TWechatLog record, @Param("example") TWechatLogExample example);

    int updateByExample(@Param("record") TWechatLog record, @Param("example") TWechatLogExample example);

    int updateByPrimaryKeySelective(TWechatLog record);

    int updateByPrimaryKeyWithBLOBs(TWechatLog record);

    int updateByPrimaryKey(TWechatLog record);
}
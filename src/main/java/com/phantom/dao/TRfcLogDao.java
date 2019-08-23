package com.phantom.dao;

import com.phantom.model.TRfcLog;
import com.phantom.model.TRfcLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRfcLogDao {
    long countByExample(TRfcLogExample example);

    int deleteByExample(TRfcLogExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TRfcLog record);

    int insertSelective(TRfcLog record);

    List<TRfcLog> selectByExample(TRfcLogExample example);

    TRfcLog selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TRfcLog record, @Param("example") TRfcLogExample example);

    int updateByExample(@Param("record") TRfcLog record, @Param("example") TRfcLogExample example);

    int updateByPrimaryKeySelective(TRfcLog record);

    int updateByPrimaryKey(TRfcLog record);
}
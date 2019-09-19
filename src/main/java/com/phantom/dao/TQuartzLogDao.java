package com.phantom.dao;

import com.phantom.model.TQuartzLog;
import com.phantom.model.TQuartzLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("TQuartzLogDao")
public interface TQuartzLogDao {
    long countByExample(TQuartzLogExample example);

    int deleteByExample(TQuartzLogExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TQuartzLog record);

    int insertSelective(TQuartzLog record);

    List<TQuartzLog> selectByExampleWithBLOBs(TQuartzLogExample example);

    List<TQuartzLog> selectByExample(TQuartzLogExample example);

    TQuartzLog selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TQuartzLog record, @Param("example") TQuartzLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TQuartzLog record, @Param("example") TQuartzLogExample example);

    int updateByExample(@Param("record") TQuartzLog record, @Param("example") TQuartzLogExample example);

    int updateByPrimaryKeySelective(TQuartzLog record);

    int updateByPrimaryKeyWithBLOBs(TQuartzLog record);

    int updateByPrimaryKey(TQuartzLog record);
}
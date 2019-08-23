package com.phantom.dao;

import com.phantom.model.TProjectSapLog;
import com.phantom.model.TProjectSapLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProjectSapLogDao {
    long countByExample(TProjectSapLogExample example);

    int deleteByExample(TProjectSapLogExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TProjectSapLog record);

    int insertSelective(TProjectSapLog record);

    List<TProjectSapLog> selectByExampleWithBLOBs(TProjectSapLogExample example);

    List<TProjectSapLog> selectByExample(TProjectSapLogExample example);

    TProjectSapLog selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TProjectSapLog record, @Param("example") TProjectSapLogExample example);

    int updateByExampleWithBLOBs(@Param("record") TProjectSapLog record, @Param("example") TProjectSapLogExample example);

    int updateByExample(@Param("record") TProjectSapLog record, @Param("example") TProjectSapLogExample example);

    int updateByPrimaryKeySelective(TProjectSapLog record);

    int updateByPrimaryKeyWithBLOBs(TProjectSapLog record);

    int updateByPrimaryKey(TProjectSapLog record);
}
package com.phantom.dao;

import com.phantom.model.TPmProjectBase;
import com.phantom.model.TPmProjectBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPmProjectBaseDao {
    long countByExample(TPmProjectBaseExample example);

    int deleteByExample(TPmProjectBaseExample example);

    int insert(TPmProjectBase record);

    int insertSelective(TPmProjectBase record);

    List<TPmProjectBase> selectByExampleWithBLOBs(TPmProjectBaseExample example);

    List<TPmProjectBase> selectByExample(TPmProjectBaseExample example);

    int updateByExampleSelective(@Param("record") TPmProjectBase record, @Param("example") TPmProjectBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") TPmProjectBase record, @Param("example") TPmProjectBaseExample example);

    int updateByExample(@Param("record") TPmProjectBase record, @Param("example") TPmProjectBaseExample example);

    TPmProjectBase selectByProjectId(@Param("PROJECT_ID") String projectId);

    int updateProjectQuickRel(@Param("PROJECT_ID") String projectId,@Param("DATA_AUTH") String dataAuth,@Param("USER_ID") String userId);
}
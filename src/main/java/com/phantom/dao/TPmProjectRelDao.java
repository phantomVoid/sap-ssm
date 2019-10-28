package com.phantom.dao;

import com.phantom.model.TPmProjectRel;
import com.phantom.model.TPmProjectRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPmProjectRelDao {
    long countByExample(TPmProjectRelExample example);

    int deleteByExample(TPmProjectRelExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TPmProjectRel record);

    int insertSelective(TPmProjectRel record);

    List<TPmProjectRel> selectByExample(TPmProjectRelExample example);

    TPmProjectRel selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TPmProjectRel record, @Param("example") TPmProjectRelExample example);

    int updateByExample(@Param("record") TPmProjectRel record, @Param("example") TPmProjectRelExample example);

    int updateByPrimaryKeySelective(TPmProjectRel record);

    int updateByPrimaryKey(TPmProjectRel record);
}
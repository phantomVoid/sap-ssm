package com.phantom.dao;

import com.phantom.model.TPmProjectPost;
import com.phantom.model.TPmProjectPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("TPmProjectPostDao")
public interface TPmProjectPostDao {
    long countByExample(TPmProjectPostExample example);

    int deleteByExample(TPmProjectPostExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TPmProjectPost record);

    int insertSelective(TPmProjectPost record);

    List<TPmProjectPost> selectByExample(TPmProjectPostExample example);

    TPmProjectPost selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TPmProjectPost record, @Param("example") TPmProjectPostExample example);

    int updateByExample(@Param("record") TPmProjectPost record, @Param("example") TPmProjectPostExample example);

    int updateByPrimaryKeySelective(TPmProjectPost record);

    int updateByPrimaryKey(TPmProjectPost record);
}
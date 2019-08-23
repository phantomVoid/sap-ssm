package com.phantom.dao;

import com.phantom.model.TPmProjectDetail;
import com.phantom.model.TPmProjectDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPmProjectDetailDao {
    long countByExample(TPmProjectDetailExample example);

    int deleteByExample(TPmProjectDetailExample example);

    int insert(TPmProjectDetail record);

    int insertSelective(TPmProjectDetail record);

    List<TPmProjectDetail> selectByExample(TPmProjectDetailExample example);

    int updateByExampleSelective(@Param("record") TPmProjectDetail record, @Param("example") TPmProjectDetailExample example);

    int updateByExample(@Param("record") TPmProjectDetail record, @Param("example") TPmProjectDetailExample example);
}
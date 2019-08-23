package com.phantom.dao;

import com.phantom.model.TPmProjectReport;
import com.phantom.model.TPmProjectReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPmProjectReportDao {
    long countByExample(TPmProjectReportExample example);

    int deleteByExample(TPmProjectReportExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TPmProjectReport record);

    int insertSelective(TPmProjectReport record);

    List<TPmProjectReport> selectByExample(TPmProjectReportExample example);

    TPmProjectReport selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TPmProjectReport record, @Param("example") TPmProjectReportExample example);

    int updateByExample(@Param("record") TPmProjectReport record, @Param("example") TPmProjectReportExample example);

    int updateByPrimaryKeySelective(TPmProjectReport record);

    int updateByPrimaryKey(TPmProjectReport record);
}
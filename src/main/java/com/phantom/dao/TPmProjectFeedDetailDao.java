package com.phantom.dao;

import com.phantom.model.TPmProjectFeedDetail;
import com.phantom.model.TPmProjectFeedDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("TPmProjectFeedDetailDao")
public interface TPmProjectFeedDetailDao {
    long countByExample(TPmProjectFeedDetailExample example);

    int deleteByExample(TPmProjectFeedDetailExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TPmProjectFeedDetail record);

    int insertSelective(TPmProjectFeedDetail record);

    List<TPmProjectFeedDetail> selectByExample(TPmProjectFeedDetailExample example);

    TPmProjectFeedDetail selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TPmProjectFeedDetail record, @Param("example") TPmProjectFeedDetailExample example);

    int updateByExample(@Param("record") TPmProjectFeedDetail record, @Param("example") TPmProjectFeedDetailExample example);

    int updateByPrimaryKeySelective(TPmProjectFeedDetail record);

    int updateByPrimaryKey(TPmProjectFeedDetail record);
}
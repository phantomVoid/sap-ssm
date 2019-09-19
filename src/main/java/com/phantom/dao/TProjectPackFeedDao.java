package com.phantom.dao;

import com.phantom.model.TProjectPackFeed;
import com.phantom.model.TProjectPackFeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("TProjectPackFeedDao")
public interface TProjectPackFeedDao {
    long countByExample(TProjectPackFeedExample example);

    int deleteByExample(TProjectPackFeedExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TProjectPackFeed record);

    int insertSelective(TProjectPackFeed record);

    List<TProjectPackFeed> selectByExample(TProjectPackFeedExample example);

    TProjectPackFeed selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TProjectPackFeed record, @Param("example") TProjectPackFeedExample example);

    int updateByExample(@Param("record") TProjectPackFeed record, @Param("example") TProjectPackFeedExample example);

    int updateByPrimaryKeySelective(TProjectPackFeed record);

    int updateByPrimaryKey(TProjectPackFeed record);
}
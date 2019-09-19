package com.phantom.dao;

import com.phantom.model.TCoItem;
import com.phantom.model.TCoItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("TCoItemDao")
public interface TCoItemDao {
    long countByExample(TCoItemExample example);

    int deleteByExample(TCoItemExample example);

    int insert(TCoItem record);

    int insertSelective(TCoItem record);

    List<TCoItem> selectByExample(TCoItemExample example);

    int updateByExampleSelective(@Param("record") TCoItem record, @Param("example") TCoItemExample example);

    int updateByExample(@Param("record") TCoItem record, @Param("example") TCoItemExample example);
}
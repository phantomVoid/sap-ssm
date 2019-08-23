package com.phantom.dao;

import com.phantom.model.TCoItemLevel;
import com.phantom.model.TCoItemLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoItemLevelDao {
    long countByExample(TCoItemLevelExample example);

    int deleteByExample(TCoItemLevelExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TCoItemLevel record);

    int insertSelective(TCoItemLevel record);

    List<TCoItemLevel> selectByExample(TCoItemLevelExample example);

    TCoItemLevel selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TCoItemLevel record, @Param("example") TCoItemLevelExample example);

    int updateByExample(@Param("record") TCoItemLevel record, @Param("example") TCoItemLevelExample example);

    int updateByPrimaryKeySelective(TCoItemLevel record);

    int updateByPrimaryKey(TCoItemLevel record);
}
package com.phantom.dao;

import com.phantom.model.TAccountCheckBase;
import com.phantom.model.TAccountCheckBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountCheckBaseDao {
    long countByExample(TAccountCheckBaseExample example);

    int deleteByExample(TAccountCheckBaseExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TAccountCheckBase record);

    int insertSelective(TAccountCheckBase record);

    List<TAccountCheckBase> selectByExample(TAccountCheckBaseExample example);

    TAccountCheckBase selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TAccountCheckBase record, @Param("example") TAccountCheckBaseExample example);

    int updateByExample(@Param("record") TAccountCheckBase record, @Param("example") TAccountCheckBaseExample example);

    int updateByPrimaryKeySelective(TAccountCheckBase record);

    int updateByPrimaryKey(TAccountCheckBase record);
}
package com.phantom.dao;

import com.phantom.model.TAccountCheckInfo;
import com.phantom.model.TAccountCheckInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountCheckInfoDao {
    long countByExample(TAccountCheckInfoExample example);

    int deleteByExample(TAccountCheckInfoExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TAccountCheckInfo record);

    int insertSelective(TAccountCheckInfo record);

    List<TAccountCheckInfo> selectByExample(TAccountCheckInfoExample example);

    TAccountCheckInfo selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TAccountCheckInfo record, @Param("example") TAccountCheckInfoExample example);

    int updateByExample(@Param("record") TAccountCheckInfo record, @Param("example") TAccountCheckInfoExample example);

    int updateByPrimaryKeySelective(TAccountCheckInfo record);

    int updateByPrimaryKey(TAccountCheckInfo record);
}
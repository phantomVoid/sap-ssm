package com.phantom.dao;

import com.phantom.model.MlDataItems;
import com.phantom.model.MlDataItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlDataItemsDao {
    long countByExample(MlDataItemsExample example);

    int deleteByExample(MlDataItemsExample example);

    int insert(MlDataItems record);

    int insertSelective(MlDataItems record);

    List<MlDataItems> selectByExample(MlDataItemsExample example);

    int updateByExampleSelective(@Param("record") MlDataItems record, @Param("example") MlDataItemsExample example);

    int updateByExample(@Param("record") MlDataItems record, @Param("example") MlDataItemsExample example);
}
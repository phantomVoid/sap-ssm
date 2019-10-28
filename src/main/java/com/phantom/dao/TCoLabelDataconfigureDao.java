package com.phantom.dao;

import com.phantom.model.TCoLabelDataconfigure;
import com.phantom.model.TCoLabelDataconfigureExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TCoLabelDataconfigureDao {
    long countByExample(TCoLabelDataconfigureExample example);

    int deleteByExample(TCoLabelDataconfigureExample example);

    int insert(TCoLabelDataconfigure record);

    int insertSelective(TCoLabelDataconfigure record);

    List<TCoLabelDataconfigure> selectByExampleWithBLOBs(TCoLabelDataconfigureExample example);

    List<TCoLabelDataconfigure> selectByExample(TCoLabelDataconfigureExample example);

    int updateByExampleSelective(@Param("record") TCoLabelDataconfigure record, @Param("example") TCoLabelDataconfigureExample example);

    int updateByExampleWithBLOBs(@Param("record") TCoLabelDataconfigure record, @Param("example") TCoLabelDataconfigureExample example);

    int updateByExample(@Param("record") TCoLabelDataconfigure record, @Param("example") TCoLabelDataconfigureExample example);

    List<Map<String, Object>> getLabelList(@Param("labelId") String labelId,@Param("dataAuth") String dataAuth);
}
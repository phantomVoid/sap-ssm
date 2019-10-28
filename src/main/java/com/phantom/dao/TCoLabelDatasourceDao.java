package com.phantom.dao;

import com.phantom.model.TCoLabelDatasource;
import com.phantom.model.TCoLabelDatasourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCoLabelDatasourceDao {
    long countByExample(TCoLabelDatasourceExample example);

    int deleteByExample(TCoLabelDatasourceExample example);

    int insert(TCoLabelDatasource record);

    int insertSelective(TCoLabelDatasource record);

    List<TCoLabelDatasource> selectByExampleWithBLOBs(TCoLabelDatasourceExample example);

    List<TCoLabelDatasource> selectByExample(TCoLabelDatasourceExample example);

    int updateByExampleSelective(@Param("record") TCoLabelDatasource record, @Param("example") TCoLabelDatasourceExample example);

    int updateByExampleWithBLOBs(@Param("record") TCoLabelDatasource record, @Param("example") TCoLabelDatasourceExample example);

    int updateByExample(@Param("record") TCoLabelDatasource record, @Param("example") TCoLabelDatasourceExample example);
}
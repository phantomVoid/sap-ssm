package com.phantom.dao;

import com.phantom.model.MlTemplate;
import com.phantom.model.MlTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlTemplateDao {
    long countByExample(MlTemplateExample example);

    int deleteByExample(MlTemplateExample example);

    int insert(MlTemplate record);

    int insertSelective(MlTemplate record);

    List<MlTemplate> selectByExampleWithBLOBs(MlTemplateExample example);

    List<MlTemplate> selectByExample(MlTemplateExample example);

    int updateByExampleSelective(@Param("record") MlTemplate record, @Param("example") MlTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") MlTemplate record, @Param("example") MlTemplateExample example);

    int updateByExample(@Param("record") MlTemplate record, @Param("example") MlTemplateExample example);
}
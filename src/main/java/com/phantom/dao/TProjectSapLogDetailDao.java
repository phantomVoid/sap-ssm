package com.phantom.dao;

import com.phantom.model.TProjectSapLogDetail;
import com.phantom.model.TProjectSapLogDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("TProjectSapLogDetailDao")
public interface TProjectSapLogDetailDao {
    long countByExample(TProjectSapLogDetailExample example);

    int deleteByExample(TProjectSapLogDetailExample example);

    int deleteByPrimaryKey(String ID);

    int insert(TProjectSapLogDetail record);

    int insertSelective(TProjectSapLogDetail record);

    List<TProjectSapLogDetail> selectByExampleWithBLOBs(TProjectSapLogDetailExample example);

    List<TProjectSapLogDetail> selectByExample(TProjectSapLogDetailExample example);

    TProjectSapLogDetail selectByPrimaryKey(String ID);

    int updateByExampleSelective(@Param("record") TProjectSapLogDetail record, @Param("example") TProjectSapLogDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") TProjectSapLogDetail record, @Param("example") TProjectSapLogDetailExample example);

    int updateByExample(@Param("record") TProjectSapLogDetail record, @Param("example") TProjectSapLogDetailExample example);

    int updateByPrimaryKeySelective(TProjectSapLogDetail record);

    int updateByPrimaryKeyWithBLOBs(TProjectSapLogDetail record);

    int updateByPrimaryKey(TProjectSapLogDetail record);
}
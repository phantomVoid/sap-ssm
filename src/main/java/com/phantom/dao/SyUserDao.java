package com.phantom.dao;

import com.phantom.model.SyUser;
import com.phantom.model.SyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyUserDao {
    long countByExample(SyUserExample example);

    int deleteByExample(SyUserExample example);

    int insert(SyUser record);

    int insertSelective(SyUser record);

    List<SyUser> selectByExampleWithBLOBs(SyUserExample example);

    List<SyUser> selectByExample(SyUserExample example);

    int updateByExampleSelective(@Param("record") SyUser record, @Param("example") SyUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SyUser record, @Param("example") SyUserExample example);

    int updateByExample(@Param("record") SyUser record, @Param("example") SyUserExample example);
}
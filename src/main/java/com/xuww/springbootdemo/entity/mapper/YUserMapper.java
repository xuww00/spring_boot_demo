package com.xuww.springbootdemo.entity.mapper;


import com.xuww.springbootdemo.entity.YUser;
import com.xuww.springbootdemo.entity.YUserCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YUserMapper {
    long countByExample(YUserCriteria example);

    int deleteByExample(YUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(YUser record);

    int insertSelective(YUser record);

    List<YUser> selectByExample(YUserCriteria example);

    YUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YUser record, @Param("example") YUserCriteria example);

    int updateByExample(@Param("record") YUser record, @Param("example") YUserCriteria example);

    int updateByPrimaryKeySelective(YUser record);

    int updateByPrimaryKey(YUser record);

    public List<YUser> listByPage(@Param("startIndex") Integer startIndex, @Param("endIndex") Integer endIndex);
}
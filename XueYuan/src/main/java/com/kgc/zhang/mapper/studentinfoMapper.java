package com.kgc.zhang.mapper;

import com.kgc.zhang.entity.studentinfo;
import com.kgc.zhang.entity.studentinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface studentinfoMapper {
    int countByExample(studentinfoExample example);

    int deleteByExample(studentinfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(studentinfo record);

    int insertSelective(studentinfo record);

    List<studentinfo> selectByExample(studentinfoExample example);

    studentinfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") studentinfo record, @Param("example") studentinfoExample example);

    int updateByExample(@Param("record") studentinfo record, @Param("example") studentinfoExample example);

    int updateByPrimaryKeySelective(studentinfo record);

    int updateByPrimaryKey(studentinfo record);
}
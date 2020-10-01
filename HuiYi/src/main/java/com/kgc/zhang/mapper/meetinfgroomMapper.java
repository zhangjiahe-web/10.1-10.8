package com.kgc.zhang.mapper;

import com.kgc.zhang.entity.meetinfgroom;
import com.kgc.zhang.entity.meetinfgroomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface meetinfgroomMapper {
    int countByExample(meetinfgroomExample example);

    int deleteByExample(meetinfgroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(meetinfgroom record);

    int insertSelective(meetinfgroom record);

    List<meetinfgroom> selectByExample(meetinfgroomExample example);

    meetinfgroom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") meetinfgroom record, @Param("example") meetinfgroomExample example);

    int updateByExample(@Param("record") meetinfgroom record, @Param("example") meetinfgroomExample example);

    int updateByPrimaryKeySelective(meetinfgroom record);

    int updateByPrimaryKey(meetinfgroom record);
}
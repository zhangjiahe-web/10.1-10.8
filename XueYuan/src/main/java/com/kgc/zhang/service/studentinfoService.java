package com.kgc.zhang.service;

import com.kgc.zhang.entity.studentinfo;
import com.kgc.zhang.entity.studentinfoExample;

import java.util.List;

public interface studentinfoService {
    List<studentinfo> selectByExample(studentinfoExample example);

    studentinfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(studentinfo record);
}

package com.kgc.zhang.service;

import com.kgc.zhang.entity.Standard;
import com.kgc.zhang.entity.StandardExample;

import java.util.ArrayList;
import java.util.List;

public interface StandardService {
    List<Standard> selectByExample(StandardExample example);
    int insert(Standard record);
    Standard selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Standard record);
    int delete(ArrayList id);
}

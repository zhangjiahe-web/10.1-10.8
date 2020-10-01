package com.kgc.zhang.service;

import com.kgc.zhang.entity.meetinfgroom;
import com.kgc.zhang.entity.meetinfgroomExample;

import java.util.List;

public interface meetInfoService {
    List<meetinfgroom> selectByExample(meetinfgroomExample example);
    int insert(meetinfgroom record);
}

package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.meetinfgroom;
import com.kgc.zhang.entity.meetinfgroomExample;
import com.kgc.zhang.mapper.meetinfgroomMapper;
import com.kgc.zhang.service.meetInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("meetInfoService")
public class meetInfoServiceImpl implements meetInfoService {
    @Resource
    meetinfgroomMapper meetinfgroomMapper;
    @Override
    public List<meetinfgroom> selectByExample(meetinfgroomExample example) {
        return meetinfgroomMapper.selectByExample(example);
    }

    @Override
    public int insert(meetinfgroom record) {
        return meetinfgroomMapper.insert(record);
    }
}

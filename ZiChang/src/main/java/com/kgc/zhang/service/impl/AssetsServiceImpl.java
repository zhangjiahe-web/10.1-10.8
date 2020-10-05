package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.Assets;
import com.kgc.zhang.entity.AssetsExample;
import com.kgc.zhang.mapper.AssetsMapper;
import com.kgc.zhang.service.AssetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AssetsService")
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public List<Assets> selectByExample(AssetsExample example) {
        return assetsMapper.selectByExample(example);
    }

    @Override
    public int insert(Assets record) {
        return assetsMapper.insert(record);
    }
}

package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.Standard;
import com.kgc.zhang.entity.StandardExample;
import com.kgc.zhang.mapper.StandardMapper;
import com.kgc.zhang.service.StandardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("StandardService")
public class StandardServiceImpl implements StandardService {
    @Resource
    StandardMapper standardMapper;
    @Override
    public List<Standard> selectByExample(StandardExample example) {
        return standardMapper.selectByExample(example);
    }

    @Override
    public int insert(Standard record) {
        return standardMapper.insert(record);
    }

    @Override
    public Standard selectByPrimaryKey(Integer id) {
        return standardMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Standard record) {
        return standardMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(ArrayList id) {
        return standardMapper.delete(id);
    }
}

package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.Bills;
import com.kgc.zhang.entity.BillsExample;
import com.kgc.zhang.mapper.BillsMapper;
import com.kgc.zhang.service.billsService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("billsService")
public class billsServiceImpl implements billsService {
    @Resource
    BillsMapper billsMapper;

    @Override
    public List<Bills> selectByExample2(BillsExample example) {
        return billsMapper.selectByExample2(example);
    }

    @Override
    public int insert(Bills record) {
        return billsMapper.insert(record);
    }
}

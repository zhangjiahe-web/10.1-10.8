package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.studentinfo;
import com.kgc.zhang.entity.studentinfoExample;
import com.kgc.zhang.mapper.studentinfoMapper;
import com.kgc.zhang.service.studentinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentinfoService")
public class studentinfoServiceImpl implements studentinfoService {
    @Resource
    studentinfoMapper studentinfoMapper;
    @Override
    public List<studentinfo> selectByExample(studentinfoExample example) {
        return studentinfoMapper.selectByExample(example);
    }

    @Override
    public studentinfo selectByPrimaryKey(Integer sid) {
        return studentinfoMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByPrimaryKeySelective(studentinfo record) {
        return studentinfoMapper.updateByPrimaryKey(record);
    }
}

package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.Projectinfo;
import com.kgc.zhang.entity.ProjectinfoExample;
import com.kgc.zhang.mapper.ProjectinfoMapper;
import com.kgc.zhang.service.ProjectinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ProjectinfoService")
public class ProjectinfoServiceImpl implements ProjectinfoService {
    @Resource
    ProjectinfoMapper projectinfoMapper;
    @Override
    public List<Projectinfo> selectByExample(ProjectinfoExample example) {
        return projectinfoMapper.selectByExample(example);
    }

    @Override
    public Projectinfo selectByPrimaryKey(Integer id) {
        return projectinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Projectinfo record) {
        return projectinfoMapper.updateByPrimaryKeySelective(record);
    }
}

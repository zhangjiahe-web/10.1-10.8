package com.kgc.zhang.service;

import com.kgc.zhang.entity.Projectinfo;
import com.kgc.zhang.entity.ProjectinfoExample;

import java.util.List;

public interface ProjectinfoService {
    List<Projectinfo> selectByExample(ProjectinfoExample example);

    Projectinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Projectinfo record);
}

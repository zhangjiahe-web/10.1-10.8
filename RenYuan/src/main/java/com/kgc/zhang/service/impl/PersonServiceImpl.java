package com.kgc.zhang.service.impl;

import com.kgc.zhang.entity.Person;
import com.kgc.zhang.entity.PersonExample;
import com.kgc.zhang.mapper.PersonMapper;
import com.kgc.zhang.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("PersonService")
public class PersonServiceImpl implements PersonService {
    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> selectByExample(PersonExample example) {
        return personMapper.selectByExample(example);
    }

    @Override
    public int insert(Person record) {
        return personMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }
}

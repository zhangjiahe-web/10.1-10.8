package com.kgc.zhang.service;

import com.kgc.zhang.entity.Person;
import com.kgc.zhang.entity.PersonExample;

import java.util.List;

public interface PersonService {
    List<Person> selectByExample(PersonExample example);
    int insert(Person record);
    int deleteByPrimaryKey(Integer id);
}

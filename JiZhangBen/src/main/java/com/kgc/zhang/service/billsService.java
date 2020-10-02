package com.kgc.zhang.service;

import com.kgc.zhang.entity.Bills;
import com.kgc.zhang.entity.BillsExample;

import java.util.List;

public interface billsService {
    List<Bills> selectByExample2(BillsExample example);
    int insert(Bills record);
}

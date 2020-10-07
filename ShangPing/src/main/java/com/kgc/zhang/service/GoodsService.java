package com.kgc.zhang.service;

import com.kgc.zhang.entity.Goods;
import com.kgc.zhang.entity.GoodsExample;

import java.util.List;

public interface GoodsService {
    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Goods record);
}

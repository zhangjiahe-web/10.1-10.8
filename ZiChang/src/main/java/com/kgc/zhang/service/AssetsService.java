package com.kgc.zhang.service;

import com.kgc.zhang.entity.Assets;
import com.kgc.zhang.entity.AssetsExample;

import java.util.List;

public interface AssetsService {
    List<Assets> selectByExample(AssetsExample example);
    int insert(Assets record);
}

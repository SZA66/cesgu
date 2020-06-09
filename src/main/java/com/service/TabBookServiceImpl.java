package com.service;

import com.mapper.TabBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TabBookServiceImpl implements TabBookService{
    @Autowired
    private TabBookMapper tabBookMapper;
    @Override
    public List<Map> selectBookAll(Map map) {
        List<Map> maps = tabBookMapper.selectBookAll(map);
        return maps;
    }
}

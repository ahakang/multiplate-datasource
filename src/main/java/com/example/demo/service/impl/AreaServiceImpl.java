package com.example.demo.service.impl;

import com.example.demo.eneity.Area;
import com.example.demo.mapper.master.AreaMapper;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:guokk
 * @date: 2019-11-27
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;


    @Override
    public Area detail(Long id) {
        Area area = areaMapper.selectByPrimaryKey(id);
        return area;
    }
}

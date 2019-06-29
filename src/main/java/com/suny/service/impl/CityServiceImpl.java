package com.suny.service.impl;

import com.suny.mapper.CityMapper;
import com.suny.pojo.Citys;
import com.suny.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<Citys> showCountryCitys(int id) {
        return cityMapper.selCountryCitys(id);
    }
}

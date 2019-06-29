package com.suny.mapper;

import com.suny.pojo.Citys;

import java.util.List;

public interface CityMapper {
    List<Citys> selCountryCitys(int id);
}

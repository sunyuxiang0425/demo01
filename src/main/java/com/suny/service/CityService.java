package com.suny.service;

import com.suny.pojo.Citys;
import com.suny.pojo.Countrys;

import java.util.List;

public interface CityService {
    List<Citys> showCountryCitys(int id);

    List<Countrys> showCityCountry();
}

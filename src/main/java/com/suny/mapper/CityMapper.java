package com.suny.mapper;

import com.suny.pojo.Citys;
import com.suny.pojo.Countrys;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    /**
     * 以ID为条件查询每个省份对应的城市
     * @param id
     * @return
     */
    List<Citys> selCountryCitys(int id);

    /**
     * 查询所有城市
     * @return
     */
    List<Citys> selCitys();

    /**
     * 查询所有省份
     * @return
     */
    List<Countrys> selCountry();

    /**
     * 以ID查询省份
     * @param id
     * @return
     */
    Countrys selCountryById(@Param("cityId") int id);
    /**
     * 查询每个城市所对应的省份
     * @param list
     * @return
     */
    List<Countrys> selCityCountry(List<Citys> list);
}

package com.suny.mapper;

import com.suny.pojo.Menu;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<Menu> selAll();
    List<Menu> selById(Map<String,Object> map);
}

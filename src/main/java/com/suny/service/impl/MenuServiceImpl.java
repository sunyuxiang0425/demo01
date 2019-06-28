package com.suny.service.impl;

import com.suny.mapper.MenuMapper;
import com.suny.pojo.Menu;
import com.suny.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> showChild() {
        List<Menu> menus = menuMapper.selAll();
        Map<String,Object> map=new HashMap<>();
            for (Menu menu:menus){
                map.put("map",menu);
            }
        List<Menu> list = menuMapper.selById(map);

        return list;
    }
}

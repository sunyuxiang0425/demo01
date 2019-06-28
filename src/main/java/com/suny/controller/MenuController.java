package com.suny.controller;

import com.suny.pojo.Menu;
import com.suny.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
    @ResponseBody
    @RequestMapping("/test")
    public List<Menu> tset(){
        System.out.println("sunyuxiang");
        return menuService.showChild();
    }
}

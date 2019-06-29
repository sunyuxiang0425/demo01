package com.suny.controller;

import com.suny.pojo.Citys;
import com.suny.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;
    @RequestMapping("showcity")
    @ResponseBody
    public List<Citys> show(){
        List<Citys> list = cityService.showCountryCitys(2);
        return list;
    }
}

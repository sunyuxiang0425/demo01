package com.suny.controller;

import com.suny.pojo.Users;
import com.suny.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String loginCheckUser(String username, String password, Model model){

            Users users = userService.checkUser(username, password);
            if (users!=null){
                model.addAttribute("user",users);
                return "main.jsp";
            }

        return "/WEB-INF/error.jsp";
    }
}

package com.suny.service.impl;

import com.suny.mapper.UserMapper;
import com.suny.pojo.Users;
import com.suny.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public Users checkUser(String username, String password) {
        return userMapper.selOne(username, password);

    }

}

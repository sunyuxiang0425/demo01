package com.suny.service;

import com.suny.pojo.Users;


public interface UserService {
    Users checkUser(String username, String password);

}

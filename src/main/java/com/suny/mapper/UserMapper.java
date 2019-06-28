package com.suny.mapper;

import com.suny.pojo.Users;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
    Users selOne(@Param("username") String username, @Param("password") String password);
}

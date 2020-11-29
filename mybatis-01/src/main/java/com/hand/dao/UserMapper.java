package com.hand.dao;

import com.hand.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
}

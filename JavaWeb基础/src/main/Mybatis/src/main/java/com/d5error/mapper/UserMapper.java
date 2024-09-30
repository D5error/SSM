package com.d5error.mapper;

import com.d5error.pojo.User;

import java.util.ArrayList;

public interface UserMapper {
    public ArrayList<User> selectAll();

    public User selectById(int id);
}

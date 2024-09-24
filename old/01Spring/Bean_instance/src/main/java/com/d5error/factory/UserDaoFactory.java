package com.d5error.factory;

import com.d5error.dao.UserDao;
import com.d5error.dao.impl.UserDaoImpl;

public class UserDaoFactory {
//    没有static修饰符
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}

package com.d5error.factory;

import com.d5error.dao.UserDao;
import com.d5error.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

//    代原始替实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

//    是否单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}

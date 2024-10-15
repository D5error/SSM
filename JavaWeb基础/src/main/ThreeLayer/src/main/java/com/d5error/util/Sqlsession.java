package com.d5error.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class Sqlsession {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String config = "mybatis-config.xml";
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(config));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Sqlsession() {
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}

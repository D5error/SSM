package com.d5error.test;

import com.d5error.mapper.AccountsMapper;
import com.d5error.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void testSelectByUsername() throws IOException {
        SqlSession sqlSession = getSqlSession();

        String username = "d5error";

        AccountsMapper accountsMapper = sqlSession.getMapper(AccountsMapper.class);
        Account account = accountsMapper.selectByUsername(username);
        String password = account.getPassword();
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

    @ Test
    public void testAddAccount() throws IOException {
        SqlSession sqlSession = getSqlSession();

        String username = "root";
        String password = "sUsfs@#4sf";

        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);

        AccountsMapper accountsMapper = sqlSession.getMapper(AccountsMapper.class);
        accountsMapper.addAccount(account);
        sqlSession.commit();

        Account ret = accountsMapper.selectByUsername(username);
        System.out.println("username: " + ret.getUsername());
        System.out.println("password: " + ret.getPassword());
    }

    private SqlSession getSqlSession() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        return sqlSessionFactory.openSession();
    }
}

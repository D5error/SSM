package com.d5error;

import com.d5error.mapper.UserMapper;
import com.d5error.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MapperDemo {
    public static void main(String[] args) throws IOException {
//        加载mybatis配置文件并创建sqlSeccsionFactory工厂对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }

//        释放资源
        inputStream.close();
        sqlSession.close();
    }
}

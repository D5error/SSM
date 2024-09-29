package com.d5error;

import com.d5error.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) throws IOException {
//        加载mybatis配置文件并创建sqlSeccsionFactory工厂对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        执行sql语句
        List<User> users = sqlSession.selectList("test.selectAll");

//        打印结果
        for (User user : users) {
            System.out.println(user);
        }

//        释放资源
        sqlSession.close();
        inputStream.close();
    }
}

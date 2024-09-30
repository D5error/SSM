package com.d5error.test;

import com.d5error.mapper.BrandMapper;
import com.d5error.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MybatisTest {
    @Test
    public void testSelectByConditionBrand() throws IOException {
        // 获取brandMapper
        SqlSession sqlSession = getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 条件参数
        int status = 0;
        String companyName = "公";
        String brandName = "华为";

        // 支持模糊查询
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 条件
        System.out.println("status:" + status);
        System.out.println("companyName:" + companyName);
        System.out.println("brandName:" + brandName);

//        method 1
        System.out.println("method 1");
        ArrayList<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        for (Brand b : brands) {
            System.out.println(b);
        }

//        method2
        System.out.println("method 2");
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brandMapper.selectByCondition(brand);
        for (Brand b : brands) {
            System.out.println(b);
        }

//        method3
        System.out.println("method 3");
        Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);
        brandMapper.selectByCondition(map);
        for (Brand b : brands) {
            System.out.println(b);
        }

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectAllBrand() throws IOException {
//        获取sqlSession对象
        SqlSession sqlSession = getSqlSession();

//        获取mapper对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        查询
        ArrayList<Brand> brands = brandMapper.selectAll();
        for (Brand brand : brands) {
            System.out.println(brand);
        }

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByIdBrand() throws IOException {
        SqlSession sqlSession = getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        for (int i = 1; i <= 3; i++) {
            Brand brand = brandMapper.selectById(i);
            System.out.println(brand);
        }
        sqlSession.close();
    }

    private SqlSession getSqlSession() throws IOException {
//        加载mybatis配置文件并创建sqlSeccsionFactory工厂对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}

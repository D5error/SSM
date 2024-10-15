package com.d5error.test;

import com.d5error.mapper.BrandMapper;
import com.d5error.pojo.Brand;
import com.d5error.util.Sqlsession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MybatisTest {
    @ Test
    public void testAdd(){
        SqlSession sqlsession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlsession.getMapper(BrandMapper.class);

        String brandName = "阿里巴巴";
        String companyName = "阿里巴巴公司";
        int orderd = 20;
        String description = "阿里，阿里巴巴，阿里巴巴是个快乐青年。";
        int status = 1;

        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrderd(orderd);
        brand.setDescription(description);
        brand.setStatus(status);

        brandMapper.add(brand);

        sqlsession.commit();
        sqlsession.close();
    }

    @ Test
    public void testDeleteById(){
        SqlSession sqlsession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlsession.getMapper(BrandMapper.class);

        int id = 10;
        brandMapper.deleteById(id);

        sqlsession.commit();
        sqlsession.close();
    }

    @ Test
    public void testUpdate(){
        SqlSession sqlsession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlsession.getMapper(BrandMapper.class);

        int id = 1;
        String description = "三折叠，怎么折，都有面。";

        Brand brand = new Brand();
        brand.setId(id);
        brand.setDescription(description);

        brandMapper.update(brand);

        sqlsession.commit();
        sqlsession.close();
    }

    @ Test
    public void testSelectById(){
        SqlSession sqlsession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlsession.getMapper(BrandMapper.class);

        int id = 1;
        Brand brand = brandMapper.selectById(id);

        System.out.println("###select by id###");
        System.out.println(brand);
        System.out.println("##################\n");
        sqlsession.close();
    }

    @ Test
    public void testSelectAll(){
        SqlSession sqlsession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlsession.getMapper(BrandMapper.class);

        System.out.println("###select all###");
        for (Brand brand : brandMapper.selectAll()) {
            System.out.println(brand);
        }
        System.out.println("################\n");


        sqlsession.close();
    }
}

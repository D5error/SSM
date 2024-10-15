package com.d5error.service;

import com.d5error.mapper.BrandMapper;
import com.d5error.pojo.Brand;
import com.d5error.util.Sqlsession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BrandService {

    public List<Brand> selectAll() {
        SqlSession sqlSession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        sqlSession.close();
        return brands;
    }

    public void add(Brand brand) {
        SqlSession sqlSession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.add(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public Brand selectById(int id) {
        SqlSession sqlSession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(id);
        sqlSession.close();
        return brand;
    }

    public void update(Brand brand) {
        SqlSession sqlSession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteById(int id) {
        SqlSession sqlSession = Sqlsession.getSqlSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
    }
}

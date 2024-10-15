package com.d5error.mapper;

import com.d5error.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    public void add(Brand brand);

    public void deleteById(int id);

    public void update(Brand brand);

    public Brand selectById(int id);

    public List<Brand> selectAll();
}

package com.d5error.mapper;

import com.d5error.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.Map;

public interface BrandMapper {
    public ArrayList<Brand> selectAll();

    public Brand selectById(int id);

    /**
     *
     * @param status
     * @param companyName
     * @return
     */
    public ArrayList<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    public ArrayList<Brand> selectByCondition(Brand brand);

    public ArrayList<Brand> selectByCondition(Map map);
}

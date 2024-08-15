package com.d5error.dao.impl;

import com.d5error.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    @Override
    public boolean readResources(String url, String password) {
        return password.equals("123456");
    }
}

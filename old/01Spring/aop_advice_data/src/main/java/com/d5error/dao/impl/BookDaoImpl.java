package com.d5error.dao.impl;

import com.d5error.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id) {
        System.out.println("id: " + id);
        return "d5error";
    }
}

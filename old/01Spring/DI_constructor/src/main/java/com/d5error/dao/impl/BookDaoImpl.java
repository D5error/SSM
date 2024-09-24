package com.d5error.dao.impl;

import com.d5error.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
        System.out.println("databaseName: " + databaseName);
        System.out.println("connectionNum: " + connectionNum);
    }
}

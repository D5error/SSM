package com.d5error.dao.impl;

import com.d5error.dao.BookDao;

public class BookDaoImpl implements BookDao{
    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save(){
        System.out.println("book dao save ..." + "connectionNum: " + connectionNum + " databaseName: " + databaseName);
    }
}

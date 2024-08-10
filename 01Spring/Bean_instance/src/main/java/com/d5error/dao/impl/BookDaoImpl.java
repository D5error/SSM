package com.d5error.dao.impl;

import com.d5error.dao.BookDao;

public class BookDaoImpl implements BookDao {
//    把public换成private依然被调用：用了反射（暂时不知道是什么意思）
    public BookDaoImpl() {
        System.out.println("book dao constructor is running ...");
//        表明Bean实例化时此构造函数被使用了
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}

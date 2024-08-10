package com.d5error.factory;

import com.d5error.dao.OrderDao;
import com.d5error.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
//    这里用static，即静态工厂
    public static OrderDao getOrderDao() {
//        相比之间new，工厂可以进行更多处理操作，实现更多功能
        System.out.println("order factory setup ...");
        return new OrderDaoImpl();
    }
}

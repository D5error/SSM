package com.d5error.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/GetAndPost")
public class MyHttpServletForUniformingGetAndPost extends HttpServlet {
    @ Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到一条get请求");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            System.out.print(key + ":" );
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.print(value + " " );
            }
            System.out.println();
        }
    }

    @ Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到了一条post请求");
        System.out.println("转发至doGet方法");
        this.doGet(req, resp);
    }
}

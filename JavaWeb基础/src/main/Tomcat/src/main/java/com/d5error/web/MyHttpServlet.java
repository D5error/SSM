package com.d5error.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

//这里用了xml，相对于注解不方便
//@WebServlet("/http-servlet")
public class MyHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("***获取请求行***");
        String method = req.getMethod();
        System.out.println("method:" + method);

        String contextPath = req.getContextPath();
        System.out.println("contextPath:" + contextPath);

        StringBuffer getRequestURL = req.getRequestURL();
        System.out.println("getRequestURL:" + getRequestURL);

        String getRequestURI = req.getRequestURI();
        System.out.println("getRequestURI:" + getRequestURI);

        String getQueryString = req.getQueryString();
        System.out.println("getQueryString:" + getQueryString);
        System.out.println("****************\n");

        System.out.println("===获取请求头===");
        String userAgent = req.getHeader("user-agent");
        System.out.println("userAgent:" + userAgent);
        System.out.println("================\n");

        System.out.println("Request请求转发~~~");
        req.setAttribute("msg", "有个转发请求过来咯~");
        req.getRequestDispatcher("/GetAndPost").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("+++获取请求体+++");
        BufferedReader reader = req.getReader();
        String s = reader.readLine();
        System.out.println(s);
        System.out.println("++++++++++++++++");
    }
}

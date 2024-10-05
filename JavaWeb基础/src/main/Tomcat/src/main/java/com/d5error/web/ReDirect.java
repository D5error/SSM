package com.d5error.web;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/redirect"})
public class ReDirect extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("'/redirect', 收到了get请求，重定向至/hello.html");
//        resp.setStatus(302);
//        resp.setHeader("location", "/hello.html");

        resp.sendRedirect("/hello.html");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到了post请求？？？");
    }
}

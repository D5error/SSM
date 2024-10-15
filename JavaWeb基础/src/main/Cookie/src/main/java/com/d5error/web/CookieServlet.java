package com.d5error.web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 添加Cookie
        Cookie cookie = new Cookie("qq", "1247054343");
        resp.addCookie(cookie);

        // 获取Cookie
        Cookie[] userCookies = req.getCookies();
        for (Cookie userCookie : userCookies) {
            System.out.println(userCookie.getName() + "=" + userCookie.getValue());
        }


        PrintWriter writer = resp.getWriter();
        writer.println("hello, this is cookie servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ServletException, IOException {
        this.doGet(req, resp);
    }
}

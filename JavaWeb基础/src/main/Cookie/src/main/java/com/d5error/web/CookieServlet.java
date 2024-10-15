package com.d5error.web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 添加Cookie
        Cookie cookie = new Cookie("qq", "1247054343");
        resp.addCookie(cookie);
        String name = "张三";
        name = URLEncoder.encode(name, "utf-8");
        resp.addCookie(new Cookie("name", name));

        cookie.setMaxAge(10);

        // 获取Cookie
        System.out.println("获取浏览器的cookie");
        Cookie[] userCookies = req.getCookies();
        for (Cookie userCookie : userCookies) {
            if (userCookie.getName().equals("name")) {
                String val = userCookie.getValue();
                val = URLDecoder.decode(val, "utf-8");
                System.out.println(userCookie.getName() + "=" + val);
                continue;
            }
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

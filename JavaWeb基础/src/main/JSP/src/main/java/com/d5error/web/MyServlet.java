package com.d5error.web;

import com.d5error.pojo.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/el")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "三星", "大韩三星", 666, "财阀", 1));
        brands.add(new Brand(2, "OPPO", "步步高", 1, "厂妹专用", 0));
        brands.add(new Brand(3, "华为", "华为公司", 100, "爱国就买", 0));
        brands.add(new Brand(4, "小米", "小米公司", 50, "Are you OK", 1));
        brands.add(new Brand(5, "D5", "d5error@163.com", 1000, "释怀了，是自导自演的悲剧", 1));

        // 将数据存储至request域中
        req.setAttribute("brands", brands);

        // 转发到 el.jsp
        req.getRequestDispatcher("/el.jsp").forward(req, resp);
    }
}

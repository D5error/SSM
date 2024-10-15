package com.d5error.web;

import com.d5error.pojo.Brand;
import com.d5error.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到一个add请求");
        req.setCharacterEncoding("utf-8");

        String brandName = req.getParameter("brandName");
        String companyName = req.getParameter("companyName");
        int orderd = Integer.parseInt(req.getParameter("orderd"));
        String description = req.getParameter("description");
        int status = Integer.parseInt(req.getParameter("status"));

        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrderd(orderd);
        brand.setDescription(description);
        brand.setStatus(status);

        brandService.add(brand);

        req.getRequestDispatcher("/selectAllServlet").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/addServlet: get方法");
    }
}

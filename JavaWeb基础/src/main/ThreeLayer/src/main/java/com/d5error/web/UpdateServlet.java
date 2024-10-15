package com.d5error.web;

import com.d5error.pojo.Brand;
import com.d5error.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        Brand brand = new Brand();
        brand.setId(Integer.parseInt(req.getParameter("id")));
        brand.setBrandName(req.getParameter("brandName"));
        brand.setCompanyName(req.getParameter("companyName"));
        brand.setDescription(req.getParameter("description"));
        brand.setStatus(Integer.parseInt(req.getParameter("status")));
        brand.setOrderd(Integer.parseInt(req.getParameter("orderd")));
        brandService.update(brand);

        req.getRequestDispatcher("/selectAllServlet").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}

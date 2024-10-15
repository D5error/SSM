<%@ page import="com.d5error.pojo.Brand" %><%--
  Created by IntelliJ IDEA.
  User: D5
  Date: 10/7/2024
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>

    <body>
        <input type="button" value="新增" id="add"><br>

        <hr>

        <table border="1" cellpadding="0" width="800">
            <tr align="center">
                <th>id</th>
                <th>品牌名称</th>
                <th>企业名称</th>
                <th>排序</th>
                <th>品牌介绍</th>
                <th>状态</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${brands}" var="brand">
                <tr align="center">
                    <td>${brand.id}</td>
                    <td>${brand.brandName}</td>
                    <td>${brand.companyName}</td>
                    <td>${brand.orderd}</td>
                    <td>${brand.description}</td>
                    <td>
                        <c:if test="${brand.status == 1}">
                            <c:out value="启用"></c:out>
                        </c:if>
                        <c:if test="${brand.status != 1}">
                            <c:out value="停用"></c:out>
                        </c:if>
                    </td>
                    <td>
                        <a href="/ThreeLayer/selectByIdServlet?id=${brand.id}">修改</a>
                        <a href="/ThreeLayer/deleteByIdServlet?id=${brand.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <script>
            document.getElementById("add").onclick = function () {
                location.href = "/ThreeLayer/addBrand.jsp";
            }
        </script>
    </body>
</html>
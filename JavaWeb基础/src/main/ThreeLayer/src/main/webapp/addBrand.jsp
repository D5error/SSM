<%--
  Created by IntelliJ IDEA.
  User: D5
  Date: 10/7/2024
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h3>添加品牌</h3>
    <form action="/ThreeLayer/addServlet" method="post">
        品牌名称：<input name="brandName"><br>
        企业名称：<input name="companyName"><br>
        排序大小：<input name="orderd"><br>
        描述信息：<textarea rows="5" cols="20" name="description"></textarea><br>
        状态：
            <input type="radio" name="status" value="0">停用
            <input type="radio" name="status" value="1">启用<br>

        <input type="submit" value="提交">
    </form>
</body>
</html>

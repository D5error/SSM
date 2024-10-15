<%--
  Created by IntelliJ IDEA.
  User: D5
  Date: 10/13/2024
  Time: 9:41 PM
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
<h3>修改品牌</h3>
<form action="/ThreeLayer/updateServlet" method="post">
    <input type="hidden" name="id" value="${brand.id}">
    品牌名称：<input name="brandName" value="${brand.brandName}"><br>
    企业名称：<input name="companyName" value="${brand.companyName}"><br>
    排序：<input name="orderd" value="${brand.orderd}"><br>
    描述信息：<textarea id="textarea" cols="20" name="description"></textarea><br>
    状态：
    <input type="radio" name="status" value="0" <c:if test="${brand.status == 0}">checked</c:if>>停用
    <input type="radio" name="status" value="1" <c:if test="${brand.status == 1}">checked</c:if>>启用<br>

    <input type="submit" value="提交">
</form>
<script>
    document.getElementById("textarea").value="${brand.description}"
</script>
</body>
</html>
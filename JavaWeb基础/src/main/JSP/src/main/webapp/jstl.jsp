<%@ page import="com.d5error.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: D5
  Date: 10/7/2024
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:if test="true">
    <%="if条件为true,,"%>
  </c:if>
    <hr>
    <c:forEach items="${brands}" var="brand">
        ${brand.id}
        ${brand.brandName}
        ${brand.companyName}
        ${brand.orderd}
        ${brand.description}
        <c:if test="${brand.status == 1}">
            <c:out value="启用"></c:out>
        </c:if>
        <c:if test="${brand.status != 1}">
            <c:out value="禁用"></c:out>
        </c:if>
        <hr>
    </c:forEach>
</body>
</html>

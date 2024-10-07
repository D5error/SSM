<%--
  Created by IntelliJ IDEA.
  User: D5
  Date: 10/6/2024
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>hello jsp</h1>

    <%
        out.println("这是由java打印出来的一句话。");
        int i = 3;
    %>

    <%=i%>
    <%="hello"%>

    <%!
        String name = "d5error";
        void show() {
            System.out.println(name);
        }
    %>

</body>
</html>

<%@ page import="com.d5error.pojo.Brand" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // 查询数据库
    List<Brand> brands = new ArrayList<Brand>();
    brands.add(new Brand(1, "三星", "大韩三星", 666, "财阀", 1));
    brands.add(new Brand(2, "OPPO", "步步高", 1, "厂妹专用", 0));
    brands.add(new Brand(3, "华为", "华为公司", 100, "爱国就买", 0));
    brands.add(new Brand(4, "小米", "小米公司", 50, "Are you OK", 1));
    brands.add(new Brand(5, "D5", "d5error@163.com", 1000, "释怀了，是自导自演的悲剧", 1));
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>

    <body>
    <input type="button" value="新增"><br>
    <hr>

    <table border="1" cellpadding="0" width="800">
        <tr>
            <th>序号</th>
            <th>品牌名称</th>
            <th>企业名称</th>
            <th>排序</th>
            <th>品牌介绍</th>
            <th>状态</th>
            <th>操作</th>
        </tr>

        <%
          for (Brand brand : brands) {
        %>
            <tr align="center">
            <td><%=brand.getId()%></td>
            <td><%=brand.getBrandName()%></td>
            <td><%=brand.getCompanyName()%></td>
            <td><%=brand.getOrderd()%></td>
            <td><%=brand.getDescription()%></td>
            <td><%
                    if (brand.getStatus() == 1) {
                %>
                <%="启用"%>
                <%
                    } else {
                %>
                <%="停用"%>
                <%
                    }
                %>
            </td>
            <td><a href="#">修改</a> <a href="#">删除</a></td>
        <%
          }
        %>

    </table>
    </body>
</html>
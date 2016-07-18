<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 时光机器
  Date: 2016/7/18
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>

<table border="1px">
    <tr>
        <td>订单ID</td>
        <td>订单编号</td>
        <td>用户ID</td>
        <td>用户名</td>
        <td>是否卖家</td>
        <td>订单详情编号</td>
    </tr>
    <c:forEach items="${ordersCustom }" var="ordersCustom">
        <tr>
            <td>${ordersCustom.oid}</td>
            <td>${ordersCustom.onumber}</td>
            <td>${ordersCustom.usersCustom.uid}</td>
            <td>${ordersCustom.usersCustom.uname}</td>
            <td>${ordersCustom.usersCustom.isbusiness}</td>
            <td>${ordersCustom.orderDetailsCustom.odid}</td>
        </tr>
    </c:forEach>
    <%--<c:forEach items="">
        <td>${ordersCustom.orderDetailsCustom.odid}</td>
    </c:forEach>--%>
</table>

</body>
</html>

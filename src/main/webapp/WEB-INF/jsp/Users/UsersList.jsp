<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 时光机器
  Date: 2016/7/15
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UsersList</title>
</head>
<body>
<table>
<c:forEach items="${usersCustom }" var="usersCustom">
    <tr>
        <td>用户编号：</td>
        <td>${usersCustom.uid}</td>
    </tr>
    <tr>
        <td>用户名：</td>
        <td>${usersCustom.uname}</td>
    </tr>
    <tr>
        <td>是否卖家：</td>
        <td>${usersCustom.isbusiness}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>

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

    <script type="text/javascript">
        function showUsers(){
            //提交form
            document.usersForm.action="${pageContext.request.contextPath }/users/usersListBy";
            document.usersForm.submit();
        }
    </script>

</head>
<body>
<form name="usersForm" method="post">
<input type="button" value="查询" onclick="showUsers()">
<!-- 一定要注意向封装类Vo中传值时，用XXX.XXX的形式传参，否则在Controller层是接收不到参数的 -->
<input type="text" name="usersCustom.uname"/></td>
</form>
<table border="1px">
    <tr>
        <td>用户编号</td>
        <td>用户名</td>
        <td>是否卖家</td>
    </tr>
<c:forEach items="${usersCustom }" var="usersCustom">
    <tr>
        <td>${usersCustom.uid}</td>
        <td>${usersCustom.uname}</td>
        <td>${usersCustom.isbusiness}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>

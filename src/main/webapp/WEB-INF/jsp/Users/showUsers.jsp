<%--
  Created by IntelliJ IDEA.
  User: 时光机器
  Date: 2016/7/11
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showUsers</title>

    <script type="text/javascript">
        function showUsers(){
            //提交form
            document.usersForm.action="${pageContext.request.contextPath }/users/showUsers";
            document.usersForm.submit();
        }
        function addUsers(){
            //提交form
            document.usersForm.action="${pageContext.request.contextPath }/users/addUsers";
            document.usersForm.submit();
        }
    </script>

</head>
<body>
<div align="center">
<form name="usersForm" method="post">
    <%--action="${pageContext.request.contextPath }/users/showUsers"--%>
<table border="1px">
    <tr>
        <td>查询：<input type="text" name="uid"/></td>
        <td><input type="button" value="查询" onclick="showUsers()" /></td>
        <!-- submit与form表单是有相关性的，submit之后表单就会按照form的目录进行跳转 -->
        <%--<td><input type="submit" value="查询"/></td>--%>
    </tr>
    <tr>
        <td>用户编号：</td>
        <td>${usersCustom.uid}</td>
    </tr>
    <tr>
        <td>用户名：</td>
        <td>${usersCustom.uname}</td>
    </tr>
    <tr>
        <td><input type="button" value="添加用户" onclick="addUsers()"/></td>
        <%--<td><a href="${pageContext.request.contextPath }/users/addUsers">添加用户</a></td>--%>
        <%--<td><input type="submit"  value="添加用户"/></td>--%>
    </tr>
</table>
</form>
</div>
</body>
</html>

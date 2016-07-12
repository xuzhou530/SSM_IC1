<%--
  Created by IntelliJ IDEA.
  User: 时光机器
  Date: 2016/7/11
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addUsers</title>
    <script type="text/javascript">
        function addUsersSubmit(){
            //提交form
            document.addForm.action="${pageContext.request.contextPath }/users/addUsersSubmit";
            document.addForm.submit();
        }
    </script>
</head>
<body>
<form name="addForm" method="post">
<table border="1px">
    <tr>
        <td>用户名：</td>
        <td><input type="text" name="uname"></td>
    </tr>
    <tr>
        <td>密码：</td>
        <td><input type="text" name="upassword"></td>
    </tr>
    <tr>
        <td>我是卖家：</td>
        <td><input type="text" name="isbusiness"></td>
    </tr>
    <tr>
        <td><input type="button" value="提交" onclick="addUsersSubmit()"/></td>
        <td></td>
        <!-- submit与form表单是有相关性的，submit之后表单就会按照form的目录进行跳转 -->
        <%--<td><input type="submit" value="提交"></td>--%>
    </tr>
</table>
</form>
</body>
</html>

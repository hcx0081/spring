<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/bind/sayVo" method="post">
    姓名1：<input type="text" name="userList[0].username"><br>
    年龄1：<input type="text" name="userList[0].age"><br>
    姓名2：<input type="text" name="userList[1].username"><br>
    年龄2：<input type="text" name="userList[1].age"><br>
    <button type="submit">提交</button>
</form>

</body>
</html>

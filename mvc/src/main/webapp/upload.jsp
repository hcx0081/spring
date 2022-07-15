<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="uad/uploadS" method="post" enctype="multipart/form-data">
    单个文件：<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>
<form action="uad/uploadM" method="post" enctype="multipart/form-data">
    多个文件：<input type="file" name="upload" multiple><br>
    <input type="submit" value="上传">
</form>
</body>
</html>

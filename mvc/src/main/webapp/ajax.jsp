<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <%-- 引入jQuery --%>
    <script src="webjars/jquery/3.6.0/dist/jquery.js"></script>
    <script>
        var userlist = [];
        userlist.push({username: "zs", age: 20})
        userlist.push({username: "kobe", age: 24})
        
        $.ajax({
            type: "post",
            url: "bind/sayAjax",
            /*
            * 这里如果是get请求方法，则参数会跟在url后面，不在请求体中，即
            * http://localhost:8080/bind/sayAjax?[{"username":"zs","age":20},{"username":"kobe","age":24}]
            * 这不是个正确的请求；
            * 所以需要是post请求，因为参数在请求体中
            *  */
            data: JSON.stringify(userlist),
            /* 当请求数据为JSON格式时，contentType必须为application/json */
            contentType: "application/json;charset=utf-8",
        })
    </script>
</head>
<body>

</body>
</html>
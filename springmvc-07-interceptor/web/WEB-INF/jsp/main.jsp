<%--
  Created by IntelliJ IDEA.
  User: zhangyunqing
  Date: 2021/8/10
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <h1>首页</h1>
<span>${username}</span>
<a href="${pageContext.request.contextPath}/user/logout">注销</a>
</body>
</html>

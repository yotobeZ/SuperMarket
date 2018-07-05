<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MYX
  Date: 2018-07-03
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>促销</title>
</head>
</head>
<body>
<h1>促销通知</h1>
<form action="/promm" method="post">
    商品种类：<input id ="proCatagory" type="text" name="proCatagory">
    <input type="submit" value="促销查询">
</form>

</body>
</html>

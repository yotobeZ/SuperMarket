<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-07-04
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--读stock和product表--%>
<html>
<head>
    <title>库存信息</title>
    <style>
        table,tr,td,th{
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table>
    <tr><th>商品名称</th><th>生产日期</th><th>库存数量</th></tr>
    <c:forEach items="${stocksList}" var="stocks" varStatus="i">
        <tr><td>${stocks.ProName}</td>
            <td>${stocks.ProDate}</td>
            <td>${stocks.StoreNum}</td>

    </c:forEach>
</table>

</body>
</html>

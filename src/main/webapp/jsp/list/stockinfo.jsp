<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-07-04
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="textml;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
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
<table align="center">
    <tr><th>商品名称</th><th>生产日期</th><th>库存数量</th></tr>
    <c:forEach items="${stocksList}" var="stocks" varStatus="i">
        <tr><td>${stocks.proName}</td>
            <td><fmt:formatDate type="date"
                                value="${stocks.proDate}"/></td>
            <td>${stocks.storeNum}</td></tr>

    </c:forEach>
</table>

</body>
</html>

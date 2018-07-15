<%--
  Created by IntelliJ IDEA.
  User: MYX
  Date: 2018-07-05
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="margin-top: 10px;width: 900px;text-align: center;">
    <tr>
        <td>商品编号</td><td>生产日期</td>
        <td>促销方式</td><td>促销时间</td>
    </tr>

    <c:forEach var="pro1" items="${promli}">
        <tr><td >${pro1.proId}</td >
            <td ><fmt:formatDate type="date"    value="${pro1.proDate}"/></td >
            <td>${pro1.promotion}</td>
            <td><fmt:formatDate type="date"    value="${pro1.saleDate}"/></td >
             </tr>
    </c:forEach>
</table>
</body>
</html>

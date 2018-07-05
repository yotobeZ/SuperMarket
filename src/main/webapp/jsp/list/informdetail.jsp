<%--
  Created by IntelliJ IDEA.
  User: MYX
  Date: 2018-07-04
  Time: 7:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="margin-top: 10px;width: 700px;text-align: center;">
    <tr>
        <td>商品编号</td><td>商品名称</td><td>库存数量</td><td>生产日期</td>
        <td>促销期</td><td>距离过期时间</td>
    </tr>

    <c:forEach var="pro" items="${prom}">
          <tr><td>${pro.proId}</td ><td>${pro.proName}</td ><td>${pro.storeNum}</td ><td>${pro.proDate}</td ><td>${pro.salesDay}</td >
              <td>${pro.restday}</td > </tr>
              </c:forEach>

</table>
</body>
</html>

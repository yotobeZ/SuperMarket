<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-07-04
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--读remindin和product表--%>
<html>
<head>
    <title>进货提醒</title>
</head>
<body>
<table>
    <tr><th>商品名称</th><th>进货数量</th><th>提醒日期</th></tr>
    <c:forEach items="${remindinsList}" var="remindins" varStatus="i">
    <tr><td>${remindins.ProName}</td>
        <td>${remindins.InNum}</td>
        <td>${remindins.RemDate}</td>
        <td>
        </td>

        </c:forEach>
</table>
</body>
</html>


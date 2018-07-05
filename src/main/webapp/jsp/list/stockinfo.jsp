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
    <tr><th>商品编号</th><th>商品名称</th><th>商品价格</th><th>库存数量</th><th>订单状态</th><th>操作</th></tr>
    <c:forEach items="${goodsList}" var="goods" varStatus="i">
        <tr><td>${goods.id}</td>
            <td>${goods.goodsName}</td>
            <td>${goods.goodsPrice}</td>
            <td>${goods.goodsCount}</td>
            <td>
                <c:choose>
                    <c:when test="${goods.billStatus ==0}">
                        待处理de
                    </c:when>
                    <c:when test="${goods.billStatus ==1}">
                        处理中3
                    </c:when>
                    <c:when test="${goods.billStatus ==2}">
                        已处理
                    </c:when>
                </c:choose>
            </td>
            <td><a href="/fix/${goods.id}">修改</a></td></tr>
    </c:forEach>
</table>

</body>
</html>

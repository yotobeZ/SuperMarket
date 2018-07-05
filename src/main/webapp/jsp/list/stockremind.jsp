<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-07-04
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>

<%@ page contentType="textml;charset=UTF-8" language="java" isELIgnored="false"%>
<%--读remindin和product表--%>
<html>
    <head>
        <title>进货提醒</title>
        <style>
            table,tr,td,th{
            border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <table align="center">
            <tr><th>商品名称</th><th>进货数量</th><th>提醒日期</th></tr>
            <c:forEach items="${remindinsList}" var="remindins" varStatus="i">
                <tr><td>${remindins.proName}</td>
                    <td>${remindins.inNum}</td>
                <%--  <td>${remindins.remDate}</td></tr>--%>
               <td><fmt:formatDate type="date"
                                        value="${remindins.remDate}"/></td></tr>
            </c:forEach>
        </table>
    </body>
</html>


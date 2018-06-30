<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>收银</title>
</head>
<body>
<div>
    <form action="/Sell" method="post">
        <table>
        <tr><th></th><th>名称</th><th>规格</th><th>生产日期</th><th>价格</th><th>数量</th></tr>
            <tr><td></td><td></tr>
        <tr ><td rowspan="4" colspan="2">共计</td><td rowspan="2" colspan="2" ><input type="text" id="sumprice" readonly></td></tr>
        </table>
        <input type="submit" value="结算">
    </form>

</div>
</body>
</html>

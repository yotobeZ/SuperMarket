<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>收银</title>
</head>
<style>

</style>
<script src="/resources/js/jquery-1.12.4.js"></script>
<script src="/resources/js/check.js"></script>
<%--<style type="text/css" href="resources/css/sellselect.css"/>--%>
<%--<script src="/resources/js/sellselect.js"/>--%>
<body>
<div>
    <table id="selectdiv">
        <tr><th></th>
            <th>名称</th>
            <th>规格</th>
            <th>生产日期</th>
            <th>价格</th>
            <th>数量</th>
            <th>总价</th>
        </tr>
        <tr id="selectedtr">
            <td><input id =ProId value="" hidden></td>
            <td>

                <input type="text" value=""  list="prolist" id="selectinput"/>
                <datalist  id="prolist" class="selectList">
                    <c:forEach var="pro" items="${prolist}">
                        <option id="${pro.proId}">${pro.proName}</option >
                    </c:forEach>
                </datalist>
            </td>

            <td><input id="ProSize" value="" readonly/></td>
            <td><input id="ProDate" value="" readonly/></td>
            <td><input id="ProPrice" value="" readonly/>元</td>
            <td><input type="text"  id="num" value=""/></td>
            <td><input type="text" id="sumprice" value="" readonly/></td>
        </tr>
    </table>
    <h1>购物车</h1>
    <form id="detail">

        <H3 >共计</H3>
        <input type="text" id="total" readonly>
        <select name="payway" required>支付方式
            <option >请选择</option>
            <option value="0">微信</option>
            <option value="1">支付宝</option>
            <option value="2">校园卡</option>
        </select>
        <input type="submit" value="结算"><br>
        <input type="button" value="Ajax提交" id="ajaxsub">
    </form>
</div>
</body>
</html>

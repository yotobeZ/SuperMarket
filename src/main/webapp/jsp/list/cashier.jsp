<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>收银</title>
</head>
<script src="/resources/js/jquery-1.12.4.js"></script>
<script src="/resources/js/check.js"></script>
<%--<style type="text/css" href="resources/css/sellselect.css"/>--%>
<%--<script src="/resources/js/sellselect.js"/>--%>
<body>
<div>
    <table id="selectdiv">
        <tr><th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
            <th>名称</th>
            <th>规格</th>
            <th>生产日期</th>
            <th>价格</th>
            <th>数量</th>
            <th>总价</th>
        </tr>
        <tr id="selectedtr">
            <td>
                <input type="text" value="" id="select" list="prolist"/>
                <datalist  id="prolist" class="selectList">
                    <c:forEach var="pro" items="${prolist}">
                        <option id="${pro.proId}">${pro.proName}</option >
                    </c:forEach>
                </datalist>
            </td>
            <td><input id="ProSize" readonly/></td>
            <td><input id="ProDate" readonly/></td>
            <td><input id="ProPrice" readonly/></td>
            <td><input type="text"  class="num"/></td>
            <td><input  type="text" class="sumprice" readonly/></td>
        </tr>
    </table>
    <form action="/Sell" method="post">
        <table id="detail">

            </tr>
            <tr>
                <td><p id="id">1</p></td>
                <td><input type="text" value="" class="name" /></td>
                <td><input readonly/></td>
                <td><input readonly/></td>
                <td><input readonly/></td>
                <td><input type="text" class="num" /></td>
                <td><input type="text" class="sumprice" readonly/></td>
            </tr>
            <tr >
                <td  colspan="5">共计</td>
                <td colspan="2" ><input type="text" id="total" readonly></td>
            </tr>
        </table>
        <input type="submit" value="结算">
    </form>
</div>
</body>
</html>

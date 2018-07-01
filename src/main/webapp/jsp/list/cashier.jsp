<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>收银</title>
</head>
<script type="text/javascript">
</script>
<script src="/resources/js/jquery-1.12.4.js"/>
<%--<style type="text/css" href="resources/css/sellselect.css"/>--%>
<%--<script src="/resources/js/sellselect.js"/>--%>
<body>
<div>
    <form action="/Sell" method="post">
        <table>
            <tr><th>&nbsp;&nbsp;&nbsp;&nbsp;</th>
                <th>名称</th>
                <th>规格</th>
                <th>生产日期</th>
                <th>价格</th>
                <th>数量</th>
                <th>总价</th>
            </tr>
            <tr>
                <td><p id="id">1</p></td>
                <td><input type="text" value="" id="name" list="prolist"/>
                    <div class="picture_click dropDowns" style=""></div>
                    <div id="prolist" class="selectList">
                        <c:forEach var="pro" items="${prolist}">
                            <div id="${pro.proId}">${pro.proName}</div>
                        </c:forEach>
                    </div>

                </td>
                <td><input readonly/></td>
                <td><input readonly/></td>
                <td><input readonly/></td>
                <td><input type="text" value="" id="num"/></td>
                <td><input type="text" readonly/></td>
            </tr>
        <tr >
            <td  colspan="5">共计</td>
            <td colspan="2" ><input type="text" id="sumprice" readonly></td>
        </tr>
        </table>
        <input type="submit" value="结算">
    </form>
</div>
</body>
</html>

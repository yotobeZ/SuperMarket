<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: mtwu
  Date: 2018/7/4
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>

<html>
<head>
    <%--<script src="${ctx }/resources/js/jquery-1.12.4.js"></script>--%>
    <%--<script src="${ctx }/resources/js/echarts.js"></script>--%>
    <%--<script src="${ctx }/resources/js/cfgopts.js"></script>--%>
        <script src="/resources/js/jquery-1.12.4.js"></script>
        <script src="/resources/js/echarts.js"></script>

</head>
<body>
<style>
    html, body, #main {
        width: 100%;
        height: 100%;
        margin: 0;
        background-color: #d4e1fa;
    }
</style>
<div id="bar" style="width: 600px;height: 400px;"></div>
    <script type="text/javascript">
    var myChart = echarts.init(document.getElementById('bar'));
    var option = {
        title: {
            text: '日营业额'
        },
        tooltip: {},
        legend: {
            data:['营业额']
        },
        xAxis: {
            data: ["校园卡","现金","支付宝","微信","银行卡"]
        },
        yAxis: [
    {
        type : 'value',
            name : '营业额',
        axisLabel : {
        formatter: '{value} 元'	//控制输出格式
    }
        },
        series: [{
            name: '销量',
            type: 'bar',
            data: []
        }];
    myChart.setOption(option);
</script>

</body>

</html>
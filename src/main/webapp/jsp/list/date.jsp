<%--
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
    <script src="${ctx }/resources/js/jquery-1.12.4.js"></script>
    <script src="${ctx }/resources/js/echarts.js"></script>
    <script src="${ctx }/resources/js/cfgopts.js"></script>
</head>
<body>
<style>
    html, body, #main {
        width: 100%;
        height: 100%;
        margin: 0;
        background-color: #00CC33;
    }
</style>
<div id="bar" style="width: 600px;height: 400px;"></div>
<script>
    var barChart;
    $(function () {
        barChart = echarts.init(document.getElementById("bar"));

        showBar();
    });

    function showBar() {
        $.ajax({
            type: "GET",
            url: "${ctx}/tec/barData.html",
            dataType: 'json',
            success: function (data) {
                var barOpt = getBarOpt();
                barOpt.title.text = '柱形图';
                barOpt.xAxis[0].name = '日期';
                barOpt.yAxis[0].name = '数量';
                barOpt.series[0].name = '柱形图';
                var fData = fmt.formtBarData(data);
                barOpt.xAxis[0].data = fData.xAxData;
                barOpt.series[0].data = fData.serData;
                barChart.setOption(barOpt);
            }
        });
    }
</script>
</body>

</html>
<%--
  Created by IntelliJ IDEA.
  User: MYX
  Date: 2018-07-04
  Time: 7:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        .black_overlay{
            display: none;
            position: absolute;
            top: 0%;
            left: 0%;
            width: 100%;
            height: 100%;
            background-color: black;
            z-index:1001;
            -moz-opacity: 0.8;
            opacity:.80;
            filter: alpha(opacity=88);
        }
        .white_content {
            display: none;
            position: absolute;
            top: 25%;
            left: 25%;
            width: 55%;
            height: 55%;
            padding: 20px;
            border: 10px solid orange;
            background-color: white;
            z-index:1002;
            overflow: auto;
        }
    </style>
</head>
<body>
<table style="margin-top: 10px;width: 900px;text-align: center;">
    <tr>
        <td>商品编号</td><td>商品名称</td><td>库存数量</td><td>生产日期</td>
        <td>促销期</td><td>距离过期时间</td><td>是否填写促销申请单 </td>
    </tr>

    <c:forEach var="pro" items="${prom}">
          <tr><td >${pro.proId}</td >
              <td >${pro.proName}</td >
              <td>${pro.storeNum}</td >
              <td><fmt:formatDate type="date"    value="${pro.proDate}"/></td>
              <td>${pro.salesDay}</td >
              <td>${pro.restday}</td >
              <td><a href = "JavaScript:void(0)" onclick = "openDialog()" >填写</a></td> </tr>
      </c:forEach>
</table>

<div id="light" class="white_content">

    <sp:form action="/addcx" method="post" modelAttribute="Promote" >
        商品编号:<sp:input path="logName" type="text" name="username" id="username"/><br>
        商品名称:<sp:input path="logPassword" type="text" name="password" id="password"/><br>
       商品生产日期 :<sp:input path="logPassword" type="text" name="password" id="password"/><br>
        促销方式 :<sp:input path="logPassword" type="text" name="password" id="password"/><br>
    </form>

    <a href = "javascript:void(0)" onclick = "closeDialog()" >点这里下载文件</a>
    <a href = "javascript:void(0)" onclick = "closeDialog()">点这里关闭本窗口</a>
</div>
<div id="fade" class="black_overlay"></div>
</body>

<script type="text/javascript">
    $(function(){

    })

    function openDialog(){

        document.getElementById('light').style.display='block';
        document.getElementById('fade').style.display='block'
    }

    function closeDialog(){
        document.getElementById('light').style.display='none';
        document.getElementById('fade').style.display='none'
    }
</script>
</body>
</html>

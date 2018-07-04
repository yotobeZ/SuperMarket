<%--
  Created by IntelliJ IDEA.
  User: mtwu
  Date: 2018/7/4
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'main.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript">

    function date()
    {
    ss=document.getElementById("date");
    ss.style.visibility="visible";
    }
    </script>
    </head>

    <body><br><br>
    <div style="position:absolute;top:0px;left:0px;width:1900;height:80px;background-size:contain; background-image:url(images/bj3.jpg)"> </div><!--style="visibility:hidden"-->
        <center><div id="div2" style="position:absolute;top:200px;left:50%;height:800px;width:1200px;background-image:url(images/bj6.jpg)"></div>
        <div id="div3" style="position:absolute;top:200px;left:50%;height:800px;width:1200px;background-image:url(images/bj6.jpg)">
        <iframe  id="date" style="position:absolute;top:0px;left:0px;width:100%;height:400px;visibility:hidden;" src="date.jsp"></iframe>
        </div></center>


    <div  style="position: absolute; top: 200px; left: 0px; width: 250px; height: 800px; background-image: url(images/bj2.jpg); font-size: 54px;">
        <center>
        <br><input type="button" style="font-size:24" name="date" value="日营业额" onclick="date()"><br><br>
        <input type="button" style="font-size:24" name="import" value="周营业额"onclick=""><br><br>
        <input type="button" style="font-size:24" name="storage" value="月营业额" onclick=""><br><br>

        </center>
        </div>

        </body>
        </html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-07-04
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>财务</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <style>

        #main-nav {
            margin-left: 1px;
        }

        #main-nav.nav-tabs.nav-stacked > li > a {
            padding: 10px 8px;
            font-size: 12px;
            font-weight: 600;
            color: #4A515B;
            background: #E9E9E9;
            background: -moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#FAFAFA), color-stop(100%,#E9E9E9));
            background: -webkit-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
            background: -o-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
            background: -ms-linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
            background: linear-gradient(top, #FAFAFA 0%,#E9E9E9 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9');
            -ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9')";
            border: 1px solid #D5D5D5;
            border-radius: 4px;
        }

        #main-nav.nav-tabs.nav-stacked > li > a > span {
            color: #4A515B;
        }

        #main-nav.nav-tabs.nav-stacked > li.active > a, #main-nav.nav-tabs.nav-stacked > li > a:hover {
            color: #FFF;
            background: #3C4049;
            background: -moz-linear-gradient(top, #4A515B 0%, #3C4049 100%);
            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#4A515B), color-stop(100%,#3C4049));
            background: -webkit-linear-gradient(top, #4A515B 0%,#3C4049 100%);
            background: -o-linear-gradient(top, #4A515B 0%,#3C4049 100%);
            background: -ms-linear-gradient(top, #4A515B 0%,#3C4049 100%);
            background: linear-gradient(top, #4A515B 0%,#3C4049 100%);
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049');
            -ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049')";
            border-color: #2B2E33;
        }

        #main-nav.nav-tabs.nav-stacked > li.active > a, #main-nav.nav-tabs.nav-stacked > li > a:hover > span {
            color: #FFF;
        }

        #main-nav.nav-tabs.nav-stacked > li {
            margin-bottom: 4px;
        }

        /*定义二级菜单样式*/
        .secondmenu a {
            font-size: 10px;
            color: #4A515B;
            text-align: center;
        }

        .navbar-static-top {
            background-color: #212121;
            margin-bottom: 5px;
        }

        .navbar-brand {
            background: url('') no-repeat 10px 8px;
            display: inline-block;
            vertical-align: middle;
            padding-left: 50px;
            color: #fff;
        }

    </style>
    <script type="text/javascript">

        function date()
        {
            window.parent.document.getElementById("week").style.display="none";
            ss=document.getElementById("date");
            ss.style.visibility="visible";
        }
        function week()
        {
            window.parent.document.getElementById("date").style.display="none";
            ww=document.getElementById("week");
            ww.style.visibility="visible";

        }
    </script>
</head>
<body class="eye-protector-processed" style="background-color: rgb(193, 230, 198); transition: background-color 0.3s ease;">
<div class="navbar navbar-duomi navbar-static-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" id="logo">合肥工业大学教育超市财务管理系统
            </a>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
                <li class="active">
                    <a href="#">
                        <i class="glyphicon glyphicon-th-large"></i>
                        首页
                    </a>
                </li>
                <li>
                    <a href="#stockManage" class="nav-header collapsed" data-toggle="collapse">
                        <i class="glyphicon glyphicon-cog"></i>
                        销售额信息
                        <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                    </a>
                    <ul id="stockManage" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a href="jsp/list/date.jsp"  target="iframe_a"><i class="glyphicon glyphicon-user"></i>日销售额</a></li>

                        <li><a  href="jsp/list/week.jsp" target="iframe_a"><i class="glyphicon glyphicon-edit"></i>月销售额</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#stockInManage" class="nav-header collapsed" data-toggle="collapse">
                        <i class="glyphicon glyphicon-cog"></i>
                        利润信息
                        <span class="pull-right glyphicon glyphicon-chevron-down"></span>
                    </a>
                    <ul id="stockInManage" class="nav nav-list collapse secondmenu" style="height: 0px;">
                        <li><a><i class="glyphicon glyphicon-user"></i>日利润</a></li>

                        <li><a href="jsp/list/weekin.jsp" target="iframe_a"><i class="glyphicon glyphicon-edit"></i>周利润</a></li>
                    </ul>
                </li>


        </div>
        <iframe src="/jsp/list/welcome1.jsp" name="iframe_a"  width="600" height="400">
            <div>showarea</div>
        </iframe>
    </div>
</div>
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script>
</script>

</body>
</html>
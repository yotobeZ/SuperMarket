<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>

<html>
<head>
    <title>商品列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    商品详细信息
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="/jsp/list/insertPro.jsp">增加新商品</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th >商品编号</th>
                <th >商品名称</th>
                <th >存放货架</th>
                <th >销售价格</th>
                <th >规格</th>
                <th >类别</th>
                <th >促销提前期</th>
                <th >供应商编号</th>
                <th >安全库存</th>
                <th >操作</th>
            </tr>
            </thead>
                <tbody>
            <c:forEach var="pro" items="${productlist}" >
                <tr>
                    <td >${pro.proId }</td>
                    <td>${pro.proName }</td>
                    <td>${pro.proShelf }</td>
                    <td>${pro.proPrice }</td>
                    <td>${pro.proSize}</td>
                    <td>${pro.proCatagory }</td>
                    <td>${pro.salesDay }</td>
                    <td>${pro.provideId }</td>
                    <td>${pro.safeStock }</td>
                    <td>

                        <a href="${path}/toUpdateProduct?proId=${pro.proId}">更改</a> |
                        <a href="${path}/deletePro?proId=${pro.proId}">删除</a>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
            </table>

            <script type="text/javascript">
                function updateProduct(id) {
                    var form = id;
                    form.action = "/toUpdateProduct";
                    form.method = "post";
                    form.submit();
                }
            </script>
        </div>
    </div>
</div>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/23
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<script src="/resources/js/jquery-1.12.4.js"></script>
<script>
    $(function () {
      $("#goodsName").blur(function () {
          if(this.val()==null){
          alert("商品名称不能为空");}
      });
      $("#goodsPrice").blur(function () {
          if(this.val()==null){
              alert("商品价格不能为空")
          }else  {
              if((typeof this.val()) !== number ||this.val() <= 0){
                  alert("商品价格必须为大于0的数字类型")
              }

          }
      })

    })
</script>
<body>

<sf:form action="/dofix" method="post" modelAttribute="Goods">
<table>
    <tr><td>商品编号</td><td><sf:input path="id" name="id" readonly="true" /><sf:errors path="id"/></td></tr>
    <tr><td>商品名称</td><td><sf:input path="goodsName"   name="goodsName"/><sf:errors path="goodsName"/></td></tr>
    <tr><td>商品价格</td><td><sf:input path="goodsPrice"   name="goodsPrice" id="goodsPrice"/><sf:errors path="goodsPrice"/></td></tr>
    <tr><td>库存数量</td><td><sf:input path="goodsCount"   name="goodsCount"/><sf:errors path="goodsCount"/></td></tr>
    <tr><td>订单状态</td><td><sf:select path="billStatus" name="billStatus">
        <c:choose>
            <c:when test="${Goods.billStatus ==0}">
                <option value="0" selected>待处理</option>
                <option value="1">处理中</option>
                <option value="2">已处理</option>
            </c:when>
            <c:when test="${Goods.billStatus ==1}">
                <option value="0" >待处理</option>
                <option value="1" selected>处理中</option>
                <option value="2">已处理</option>
            </c:when>
            <c:when test="${Goods.billStatus ==2}">
                <option value="0" >待处理</option>
                <option value="1" >处理中</option>
                <option value="2" selected>已处理</option>
            </c:when>
        </c:choose>
    </sf:select></td>
    <sf:hidden path="goodsDistrict"/></tr>
    <tr><td colspan="2">
        <input type="submit" value="提交"/>
        <input type="button" value="返回"  onclick="javascript:history.back(-1);">
    </td></tr>
</table>
</sf:form>
</body>
</html>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="static java.lang.Integer.parseInt" %><%--
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


</head>
<body>
<table border="1" align="center">
    <tr>
        <td>销售单号</td>
        <td>单金额</td>
    </tr>

<%
    String driverClass="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/supermarket";
    String user="root";
    String password="admin";
    Connection conn;
    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.util.Date currentTime = new java.util.Date();//得到当前系统时间
    String date1 = formatter.format(currentTime); //将日期时间格式化
    out.println("当前时间为："+date1);
//    String str_date2 = currentTime.toString(); //将Date型日期时间转换成字符串形式
    try{
        Class.forName(driverClass);
        conn=DriverManager.getConnection(url,user,password);
        Statement stmt=conn.createStatement();
        String sql="select salerecord.SaleNo,product.ProPrice*salerecord.SaleNum AS ProMo\n" +
                "from product LEFT OUTER JOIN salerecord ON product.ProId=salerecord.ProId\n" +
                "where salerecord.SaleDate=('"+date1+"')" ;
        ResultSet rs=stmt.executeQuery(sql);
        float SUM = 0;
       while(rs.next()){

%>
<tr>
    <td><%=rs.getString("SaleNo") %></td>
    <td><%=rs.getString("ProMo") %></td>
</tr>
<%
       SUM+=Float.parseFloat(rs.getString("ProMo"));
        }
%>
<tr>
    <td> 总计</td>
    <td><%=SUM%></td>
    </tr>
    <%

    }
    catch(Exception ex){
        ex.printStackTrace();
    }
%>

</body>

</html>
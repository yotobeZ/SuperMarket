<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: mtwu
  Date: 2018/7/5
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>周营业额</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <td>时间</td>
        <td>营业额</td>
    </tr>

        <%
    String driverClass="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/supermarket";
    String user="root";
    String password="admin";
    Connection conn;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date currentTime = new Date();//得到当前系统时间
    Calendar calendar  =   Calendar.getInstance();
     calendar.setTime(currentTime);//需要将date数据转移到Calender对象中操作
    int day=calendar.get(Calendar.DAY_OF_WEEK);
    calendar.add(calendar.DATE, 1);
     Class.forName(driverClass);
     conn=DriverManager.getConnection(url,user,password);
     Statement stmt=conn.createStatement();
      float[] heji=new float[day-1];
        float sum =0;
     for (int i=0;i<day-1;i++){
    try{
     calendar.add(calendar.DATE, -1);//把日期往后增加n天.正数往后推,负数往前移动
     currentTime=calendar.getTime();   //这个时间就是日期往后推一天的结果
     String date1 = formatter.format(currentTime); //将日期时间格式化
        String sql="select salerecord.SaleNo,product.ProPrice*salerecord.SaleNum AS ProMo\n" +
                "from product LEFT OUTER JOIN salerecord ON product.ProId=salerecord.ProId\n" +
                "where salerecord.SaleDate=('"+date1+"')" ;
        ResultSet rs=stmt.executeQuery(sql);
        float SUM = 0;
       while(rs.next()){
       SUM+=Float.parseFloat(rs.getString("ProMo"));
       heji[i] =SUM;
       sum=sum+heji[i];
        }
%>
    <tr>
        <td> <%=date1%></td>
        <td><%=SUM%></td>
    </tr>

        <%
    }
    catch(Exception ex){
        ex.printStackTrace();
    }

    }

   %>
    <tr>
        <td> 合计：</td>
        <td><%=sum%></td>
    </tr>
    </body>

</html>

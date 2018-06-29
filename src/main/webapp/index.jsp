<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/23
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<script src="resources/js/jquery-1.12.4.js"/>
<script>
</script>
<body>

<div id="class" align="center">

    <sp:form action="login" method="post" modelAttribute="userlog" >
        username:<sp:input path="username" type="text" name="username" id="username"/><br>
        password:<sp:input path="password" type="text" name="password" id="password"/><br>
        <input type="submit" value="submit" />
    </sp:form>

</div>

</body>
</html>

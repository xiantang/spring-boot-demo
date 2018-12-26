<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2018/12/25
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css"
          href="<c:url value="/resources/style.css"/> ">
</head>
<body>
<h1>
    Register
</h1>
<sf:form method="POST" commandName="spitter" enctype="multipart/form-data">
    <%--First Name: <input type="text" name="firstNmae"/> <br/>--%>
    <%--Last Name: <input type="text" name="lastName"/> <br/>--%>
    <%--User Name: <input type="text" name="username"/> <br/>--%>
    <%--Password: <input type="password" name="password"/> <br/>--%>
    <%--<input type="submit" value="Register">--%>

    First Name: <sf:input path="firstName"/>
    <sf:errors path="firstName"/> <br/>
    Last Name: <sf:input path="lastName"/> <br/>
    Email: <sf:input path="email"/> <br/>
    User Name: <sf:input path="username"/> <br/>
    Password: <sf:input path="password"/> <br/>
    <label>Profile Picture</label>
    <input type="file" name="profilePicture"
           accept="image/jpeg,image/png,image/gif" /> <br/>

    <input type="submit" value="Register">
</sf:form>
</body>
</html>

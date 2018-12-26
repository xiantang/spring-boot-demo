<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2018/12/24
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1><s:message code="spittr.welcome"/> </h1>
<%--<h1>Welcome to Spittr</h1>--%>
<a href="<c:url value="/spittles"/>">Spittles</a> |
<a href="<c:url value="/spitter/register"/> ">Register</a>
</body>
</html>

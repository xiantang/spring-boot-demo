<%--
  Created by IntelliJ IDEA.
  User: dd
  Date: 2018/12/27
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Customer Lookup</h2>
<form method="post" action="flow.htm">
    <%--流程执行的key--%>
    <input type="hidden" name="_flowExecutionKey"
           value="${flowExecutionKey}">

    <b>Phone number: </b>
    <input type="text" name="phoneNumber"><br>
        <%--为flow提供线索--%>
    <input type="submit" class="button"
           name="_eventId_submit" value="Submit">
</form>
</body>
</html>

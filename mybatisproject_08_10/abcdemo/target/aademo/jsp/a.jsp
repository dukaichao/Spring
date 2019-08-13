<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/8/9
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.dkc.po.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="100%" align="center">
    <tr>
        <th>uId</th>
        <th>uName</th>
        <th>uAddr</th>
    </tr>

    <c:forEach items="${list}" var="myItems">
        <tr>
            <td>${myItems.id}</td>
            <td>${myItems.name}</td>
            <td>${myItems.addr}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

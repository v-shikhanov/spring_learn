<%--
  Created by IntelliJ IDEA.
  User: Vladislav
  Date: 17.02.2020
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>User page</title>
</head>
<body>
<header><b>Users table</b></header>

    <table>
        <style> table { border: 4px double #333; border-collapse: separate; width: 100%; border-spacing: 7px 11px;}
        td { padding: 5px; border: 1px solid #a52a2a;} </style>

        <tr>
            <th>First name</th>
            <th>Second name</th>
            <th>Orders quantity</th>
            <th>id</th>
        </tr>

        <c:forEach var ="user" items = "${users}">
            <tr>
                <td><c:out value="${user.firstName}"/></td>
                <td><c:out value="${user.lastName}"/></td>
                <td>123</td>
                <td><c:out value="${user.id}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

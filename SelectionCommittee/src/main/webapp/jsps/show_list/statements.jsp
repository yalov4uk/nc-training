<%--
  Created by IntelliJ IDEA.
  User: Valera Yalov4uk
  Date: 4/18/2017
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Statements</title>
    <link rel="stylesheet" href="/css/index.css">
</head>
<body>
<table>
    <c:forEach var="statement" items="${statements}">
        <tr>
            <td>
                <c:out value="${statement}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
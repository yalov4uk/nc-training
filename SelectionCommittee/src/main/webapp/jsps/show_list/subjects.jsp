<%--
  Created by IntelliJ IDEA.
  User: Valera Yalov4uk
  Date: 4/18/2017
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Subjects</title>
    <link rel="stylesheet" href="/css/index.css">
</head>
<body>
<table>
    <c:forEach var="subject" items="${subjects}">
        <tr>
            <td>
                <c:out value="value"/>
                <c:out value="${subject.value}"/>
                <c:out value="${subject.userId}"/>
                <c:out value="${subject.subjectNameId}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
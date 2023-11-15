<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/15/2023
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
  <tr>
    <td>ID</td>
    <td>IMAGE</td>
  </tr>
  <c:forEach items="${images}" var="i" varStatus="loop">
    <tr>
        <td>${loop.count}</td>
      <img width="100" height="100" style="object-fit: cover" src="uploads/${i}" alt="#">
    </tr>
  </c:forEach>

</table>
</body>
</html>

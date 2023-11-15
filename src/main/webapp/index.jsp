<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:if test="${action==null}">
    <%
        response.sendRedirect(request.getContextPath()+"/HomeServlet?action=HOME");
    %>
</c:if>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<jsp:include page="/WEB-INF/assets/navbar.jsp"></jsp:include>
<h1>Đây là trang chủ</h1>
<h2>Danh sách bài viết</h2>
<c:forEach items="${list}" var="p" >
    <img src="${p.image}" alt="">
    <h3>${p.title}</h3>
    <p>${p.content}</p>
    <span>${p.author}</span>
</c:forEach>
</body>
</html>
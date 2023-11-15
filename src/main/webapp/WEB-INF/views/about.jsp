<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/15/2023
  Time: 10:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="../assets/navbar.jsp"></jsp:include>
<h1>Đây là trang mô tả về chúng tôi</h1>

<form action="/UploadServlet" method="post" enctype="multipart/form-data">
    <input type="file" name="image" multiple>
    <input type="file" name="avatar">
    <input type="submit" value="Upload" name="action">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hung1
  Date: 11/15/2023
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<ul>
    <li><a class="${action=='home'?'text-danger':''}" href="<%=request.getContextPath()%>/HomeServlet?action=HOME">Home</a></li>
    <li><a class="${action=='product'?'text-danger':''}" href="<%=request.getContextPath()%>/HomeServlet?action=PRODUCT">List Product</a></li>
    <li><a class="${action=='about'?'text-danger':''}" href="<%=request.getContextPath()%>/HomeServlet?action=ABOUT">About</a></li>
    <li><a class="${action=='profile'?'text-danger':''}" href="<%=request.getContextPath()%>/HomeServlet?action=PROFILE">My Profile</a></li>
    <li><a class="${action=='cart'?'text-danger':''}" href="<%=request.getContextPath()%>/HomeServlet?action=CART">Cart</a></li>
</ul>


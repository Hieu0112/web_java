<%-- 
    Document   : info
    Created on : Dec 20, 2023, 4:00:10 PM
    Author     : Hieu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <h1>Info</h1>
        <jsp:include page="menu.jsp"/>
        <h3>
            User:${sessionScope.account.username}<br/>
            <c:if test="${sessionScope.account.role==1}">
                Chao Mung Den kenh ban hang
            </c:if>
            <c:if test="${sessionScope.account.role==2}">
                Chao Mung khach hang moi ban mua hang
            </c:if>
        </h3>
    </body>
</html>

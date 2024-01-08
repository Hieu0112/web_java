<%-- 
    Document   : admin.jsp
    Created on : Aug 23, 2023, 11:19:11 AM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Day la trang admin!
        </h1>
        <c:set var="a" value="${sessionScope.account}"/>
        <h1>Hello admin :${a.username}<br/>
            role: ${a.role}
        </h1>
    </body>
</html>

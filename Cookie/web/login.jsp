<%-- 
    Document   : login
    Created on : Aug 23, 2023, 11:06:02 AM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <c:set var="cookie" value="${pageContext.request.cookies}"/>
        <form action="login" method="post">
            enter username: <input type="text" name="user" value="${cookie.cuser.value}"/><br/>
            enter password: <input type="password" name="pass" value="${cookie.cpass.value}"/><br/>
            <input 
                ${(cookie.crem!=null?'checked':'')}
                type="checkbox" name="rem" value="ON"/>Remember me<br/>
            <input type="submit" value="LOGIN"/>
        </form>
    </body>
</html>

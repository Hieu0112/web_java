<%-- 
    Document   : home
    Created on : Aug 23, 2023, 6:32:25 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>DAY LA TRANG CHU</h1>
        <h3>
            <a href="add.jsp">Goi file add.jsp</a>
        </h3>
        <h2>
            So Nguoi truy cap trang web la:
            <span style="color: blue">${sessionScope.counter}</span>
        </h2>
    </body>
</html>

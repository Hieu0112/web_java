<%-- 
    Document   : index.jsp
    Created on : Aug 23, 2023, 4:17:14 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${sessionScope.account.username}</h1>
    </body>
</html>

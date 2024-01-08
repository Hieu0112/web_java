<%-- 
    Document   : login.jsp
    Created on : Aug 23, 2023, 7:52:01 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <h1>Login page</h1>
        <h3 style="color: red">
            ${requestScope.ms}
        </h3>
        <form action="login" method="post">
            username:
            <input type="text" name ="user"/><br/>
            password:
            <input type="text" name ="pass"/><br/>
            <input type="submit" value="LOGIN">
        </form>
    </body>
</html>

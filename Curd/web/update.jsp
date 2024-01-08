<%-- 
    Document   : update
    Created on : Aug 21, 2023, 9:34:28 PM
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
        <h1>Update categories</h1>
        <c:set var="c" value="${requestScope.student}"/>
        <form action="update" method="post">
            enter ID: <input type="number" readonly name="id" value="${c.id}"><br/>
            enter name: <input type="text" name="name" value="${c.name}"><br/>
            enter gender: <input type="text" name="gender" value="${c.gender}"><br/>
            enter gpa: <input type="text" name="gpa" value="${c.gpa}"><br/>
            <input type="submit" value="UPDATE">
        </form>
    </body>
</html>

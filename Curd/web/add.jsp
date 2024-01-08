<%-- 
    Document   : add.jsp
    Created on : Aug 21, 2023, 10:22:58 AM
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
        <h1>Add new Student</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="add">
            enter ID: <input type="number" name="id"><br/>
            enter name: <input type="text" name="name"><br/>
            enter gender: <input type="text" name="gender"><br/>
            enter gpa: <input type="text" name="gpa"><br/>
            <input type="submit" value="SAVE">
        </form>
    </body>
</html>

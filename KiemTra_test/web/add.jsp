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
            enter studentID: <input type="text" name="studentID"><br/>
            enter firstName: <input type="text" name="firstName"><br/>
            enter lastName: <input type="text" name="lastName"><br/>
            enter mobilePhone: <input type="text" name="mobilePhone"><br/>
            enter birthday: <input type="text" name="birthday"><br/>
            enter classID: <input type="text" name="classID"><br/>
            <input type="submit" value="SAVE">
        </form>
    </body>
</html>

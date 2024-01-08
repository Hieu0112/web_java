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
            enter studentID: <input type="text" name="studentID" value="${c.studentID}"><br/>
            enter firstName: <input type="text" name="firstName" value="${c.firstName}"><br/>
            enter lastName: <input type="text" name="lastName" value="${c.lastName}"><br/>
            enter mobilePhone: <input type="text" name="mobilePhone" value="${c.mobilePhone}"><br/>
            enter birthday: <input type="text" name="birthday" value="${c.birthday}"><br/>
            enter classID: <input type="text" name="classID" value="${c.classID}"><br/>
            <input type="submit" value="UPDATE">
        </form>
    </body>
</html>

<%-- 
    Document   : list.jsp
    Created on : Aug 21, 2023, 10:12:15 AM
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
    <center>
        <h1>List of Students TI truy nhan tao</h1>
        <table border="1px" width =60%>
            <tr>
                <th>ID</th>
                <th>First_NAME</th>
                <th>Last_Name</th>
                <th>MobilePhone</th>
                <th>Birthday</th>
                <th>ClassID</th>
                <th>Class</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="c">
                <c:set var="id" value="${c.studentID}"/>
                <tr>
                    <td>${id}</td>
                    <td>${c.firstName}</td>
                    <td>${c.lastName}</td>
                    <td>${c.mobilePhone}</td>
                    <td>${c.birthday}</td>
                    <td>${c.classID}</td>
                    <td>${c.classes}</td>
                </tr>
            </c:forEach>
        </table>
    </center>
    </body>
</html>

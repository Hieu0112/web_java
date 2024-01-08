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
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("Are you sure to delete category with id="+id)){
                    window.location="delete?id="+id;
                }
            } 
        </script>
    </head>
    <body>
    <center>
        <h1>List of Student</h1>
        <h3>
            <a href="add.jsp">Add new</a>
        </h3>
        <table border="1px" width =60%>
            <tr>
                <th>ID</th>
                <th>First_NAME</th>
                <th>Last_Name</th>
                <th>MobilePhone</th>
                <th>Birthday</th>
                <th>ClassID</th>
                <th>Class</th>
                <th>ACTION</th>
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
                    <td>
                        <a href="update?id=${id}">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" onclick="doDelete('${id}')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h3>
            <form action="search" method="post">
            enter classID: <input type="text" name="input" value="D23QT"><br/>
            <input type="submit" value="SEARCH">
        </form>
        </h3>
    </center>
    </body>
</html>

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
        <title>Home</title>
        <style>
            /* styles.css */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
        }

        table {
            width: 60%;
            border-collapse: collapse;
            margin: 20px auto;
            background-color: #fff;
        }

        table, th, td {
            border: 1px solid #ccc;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        a {
            text-decoration: none;
            color: #0077b6;
        }

        a:hover {
            text-decoration: underline;
        }

        center {
            margin-top: 20px;
        }
        input[type="submit"] {
                padding: 10px 20px; /* Thay đổi kích thước nút theo nhu cầu */
                background-color: #0077b6;
                color: #fff;
                border: none;
                cursor: pointer;
            }
        </style>
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
        <h1>Danh sách Vật tư</h1>
        <h3>
            <a href="add.jsp">Add new</a>
        </h3>
        <table border="1px" width =60%>
            <tr>
                <th>Mã vật tư</th>
                <th>Tên vật tư</th>
                <th>Đơn vị tính</th>
                <th>ACTION</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="c">
                <c:set var="id" value="${c.maVTu}"/>
                <tr>
                    <td>${id}</td>
                    <td>${c.tenVTu}</td>
                    <td>${c.dvTinh}</td>
                    <td>
                        <a href="update?id=${id}">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" onclick="doDelete('${id}')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h3>
            <form action="show" method="post">
            <input type="submit" value="SEARCH" name="input">
        </form>
        </h3>
    </center>
    </body>
</html>

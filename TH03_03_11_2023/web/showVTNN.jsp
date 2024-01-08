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
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            text-align: center;
        }

        table {
            width: 60%;
            margin: 20px auto;
            background-color: #fff;
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

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e0e0e0;
        }
    </style>
    <body>
    <center>
        <h1>Vật tư có tổng số lượng xuất bán nhiều nhất.</h1>
        <table border="1px" width =60%>
            <tr>
                <th>Mã vật tư</th>
                <th>Tên vật tư</th>
                <th>Đơn vị tính</th>
                <th>Số lượng bán</th>
            </tr>
                <tr>
                <c:set var="c" value="${requestScope.datavattu}"/>
                    <td>${c.maVTu}</td>
                    <td>${c.tenVTu}</td>
                    <td>${c.dvTinh}</td>
                    <td>${requestScope.datavattonkho}</td>
                </tr>
        </table>
    </center>
    </body>
</html>

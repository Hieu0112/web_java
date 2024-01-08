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

        form {
            width: 60%;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ccc;
        }

        input[type="text"] {
            width: 99%;
            padding: 10px 0px 10px 10px;
            margin: 20px 0;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #0077b6;
            color: #fff;
            border: none;
            cursor: pointer;
        }
    </style>
    <body>
        <h1>Update Vật tư</h1>
        <c:set var="c" value="${requestScope.vattu}"/>
        <form action="update" method="post">
            Mã vật tư <input type="text" name="mavt" value="${c.maVTu}"><br/>
            Tên vật tư <input type="text" name="tenvt" value="${c.tenVTu}"><br/>
            Đơn vị tính <input type="text" name="dvtinh" value="${c.dvTinh}"><br/>
            Phần trăm <input type="text" name="phantram" value="${c.phanTram}"><br/>
            <input type="submit" value="UPDATE">
        </form>
    </body>
</html>

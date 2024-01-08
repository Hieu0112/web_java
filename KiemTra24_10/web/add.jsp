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
            enter masv: <input type="text" name="masv"><br/>
            enter hoten: <input type="text" name="hoten"><br/>
            enter ngaysinh: <input type="text" name="ngaysinh"><br/>
            enter gioitinh: <input type="text" name="gioitinh"><br/>
            enter malop: <input type="text" name="malop"><br/>
            <input type="submit" value="SAVE">
        </form>
    </body>
</html>

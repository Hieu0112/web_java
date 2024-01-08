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
        <h1>Update Sinh Vien</h1>
        <c:set var="c" value="${requestScope.student}"/>
        <form action="update" method="post">
            enter masv: <input type="text" name="masv" value="${c.masv}"><br/>
            enter hoten: <input type="text" name="hoten" value="${c.hoten}"><br/>
            enter ngaysinh: <input type="text" name="ngaysinh" value="${c.ngaysinh}"><br/>
            enter gioitinh: <input type="text" name="gioitinh" value="${c.gioitinh}"><br/>
            enter malop: <input type="text" name="malop" value="${c.malop}"><br/>
            <input type="submit" value="UPDATE">
        </form>
    </body>
</html>

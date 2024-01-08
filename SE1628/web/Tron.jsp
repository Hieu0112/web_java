<%-- 
    Document   : Tron
    Created on : Aug 19, 2023, 4:01:30 PM
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
        <h1>Bai 1</h1>
        <form action="tinh" method="post">
            enter redius:<input type="text" name="r"/><br/>
            <input type="submit" value="SUBMIT"/>
        </form>
        <%
            if(request.getAttribute("dt")!=null){
//                double s =(double)request.getAttribute("dt");
            String s =(String)request.getAttribute("dt");
        %>
        <h2>Dien tich :<%= s%></h2>
        <%
            }
        %>
    </body>
</html>

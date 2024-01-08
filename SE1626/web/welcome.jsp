<%-- 
    Document   : welcome
    Created on : Aug 19, 2023, 11:24:29 PM
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
<!--     
        Cach1
        <%
            if(request.getAttribute("name")!=null){
                String name=(String)request.getAttribute("name");
        %>
        <h1 style="color: blue">Hello <%= name%></h1>
        <%
            }
        %>
        -->
        
        <%
            if(request.getParameter("name")!=null){
                String name=request.getParameter("name");
        %>
        <h1 style="color: blue">Hello <%= name%></h1>
        <%
            }
        %>
        
    </body>
</html>

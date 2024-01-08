<%-- 
    Document   : login
    Created on : Aug 19, 2023, 11:12:23 PM
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
        <h1>Login Form</h1>
<!--        Servelet
        <%
            if(request.getAttribute("error")!=null){
                String er=(String)request.getAttribute("error");
        %>
        <h3 style="color: red">
            <%= er %>
        </h3>
        <%
            }
        %>
        <form action="login" method="post">
        -->
        <%
            String u_init=getServletContext().getInitParameter("user");
            String p_init=getServletContext().getInitParameter("pass");
            if(request.getParameter("user")!= null && request.getParameter("pass")!= null){
                String u =request.getParameter("user");
                String p =request.getParameter("pass");
                if(u.equalsIgnoreCase(u_init)&& p.equals(p_init)){
        %>
        <jsp:forward page="welcome.jsp">
            <jsp:param name="name" value="<%= u%>"/>
        </jsp:forward>
        <%
                }
                else{
                    String er="nhap sai ,de nghi nhap lai";
        %>
        <h3 style='color: red'>
            <%= er %>
        </h3>
        <%
                }
            }  
            
        %>
        <form>
            enter username:
            <input type="text" name ="user"/><br/>
            enter password:
            <input type="text" name ="pass"/><br/>
            <input type="submit" name ="LOGIN"/><br/>
        </form>
    </body>
</html>

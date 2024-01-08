<%-- 
    Document   : home
    Created on : Aug 19, 2023, 10:48:54 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <div id="menu_tab">
            <jsp:include page="menu.jsp"/>
        </div>
        <div class="clr">
            
        </div>
        <div class="clr">
            
        </div>
        <div class="girl">
            <%@include file="girl.jsp" %>
            <%@include file="index.html" %>
        </div>
        <div>
            
        </div>
        <div class="clr"></div>
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>

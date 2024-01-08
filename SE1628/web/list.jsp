<%-- 
    Document   : list.jsp
    Created on : Aug 19, 2023, 5:27:46 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="model.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Students</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>DOB</th>
                <th>GENDER</th>
            </tr>
            <%
                List<Student>list= (List<Student>)request.getAttribute("data");
                for(Student i:list){
            %>
            <tr>
                <td>
                    <%= i.getId()%>
                </td>
                
                <td>
                    <%= i.getName()%>
                </td>
                <td>
                    <%= i.getDob()%>
                </td>
                <td>
                    <img <%= (i.isGender()? "src='./imgs/male.png'":
                            "src='imgs/female.png'")%>
                            width="30px" height="30px"/>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>

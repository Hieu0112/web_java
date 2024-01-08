<%-- 
    Document   : home
    Created on : Aug 19, 2023, 3:17:44 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Example for JSP</h1>
        <h2 style="color: red">
        <%
            String name="Vu Thi Teo";
            out.println("Xin Chao ban "+name+" !!!");
            out.println("<br/>So Pi: "+Math.PI);
            double r=2;
            DecimalFormat f= new DecimalFormat("##.##");
        %>
        </h2>
        <h2 style="color: blue">
            Dien tich la: <%= f.format(Math.PI*r*r) %>
        </h2>
        <h1>Bai 1</h1>
            <!--Cach 1-->
            <form>
                enter redius:<input type="text" name="r"/><br/>
                <input type="submit" value="SUBMIT"/>
            </form>
            <%
                if(request.getParameter("r")!=null){
                    String r_raw=request.getParameter("r");
                    double ra;
                    try{
                        ra = Double.parseDouble(r_raw);
                        double s= ra*ra*Math.PI;
            %>
            <h2>Dien tich la:<%= f.format(s)%> </h2>
            <%
                }catch(Exception e){
                    System.out.println(e);
                }
                }
            %>
        </h1> 
       
    </body>
</html>

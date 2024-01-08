<%-- 
    Document   : tinh
    Created on : Aug 20, 2023, 3:48:29 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function choice(change){
                document.getElementById("d").value=change;
//                document.getElementById("f1").submit();
            }
            
        </script>
    </head>
    <body>
        <h1>Doi tien</h1>
        <h3 style="color: red">
            ${requestScope.error}
        </h3>
        <!--<form action="tinh" method="post">-->
        <form id="f1" action="tinh" method="post">
            Nhap tien viet<input type="text" name="money"/><br/>
<!--            <input type="radio" name="change" checked value="0"/>Sang USD
            <input type="radio" name="change" value="1"/>Sang YEN-->
<!--            <input type="checkbox" name="change" value="0"/>Sang USD
            <input type="checkbox" name="change" value="1"/>Sang YEN-->
            <br/>
            <!--<input type="submit" value="DOI TIEN"/>-->
            <input type="hidden" id="d" name="change" value="" />
<!--            <input type="button" onclick="choice('0')" value="DOI SANG USD"/>
            <input type="button" onclick="choice('1')" value="DOI SANG YEN"/>-->
            <input type="submit" onclick="choice('0')" value="DOI SANG USD"/>
            <input type="submit" onclick="choice('1')" value="DOI SANG YEN"/>
        </form>
        <h2 style="color: green">
            Tien doi :<br/>${requestScope.money}
        </h2>
    </body>
</html>

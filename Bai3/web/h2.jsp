<%-- 
    Document   : h2
    Created on : Aug 20, 2023, 11:05:39 AM
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
        <div>
            <h1>VD cho java bean</h1>
            <form>
                Nhap So 1:<input type="number" name="n1" value="${param.n1}"/><br/>
                Nhap So 2:<input type="number" name="n2" value="${param.n2}"/><br/>
                Nhap So 3:<input type="number" name="n3" value="${param.n3}"/><br/>
                <input type="submit" value="tinh toan"/><br/> 
            </form>
            
            <h2>
                Tong:${(param.n1+param.n2+param.n3)}
            </h2>
            <h2>
                Trung binh:${(param.n1+param.n2+param.n3)/3}
            </h2>
            <h2>
                Dien tich duong tron:${((param.n1+param.n2+param.n3)*(param.n1+param.n2+param.n3)*Math.PI)}
            </h2>
            
            <h4>Du lieu lay tu Server tra ve:
                <br/>
                Hello ${requestScope.name}
            </h4>
            <<h3 style='color: chocolate'>
                Thong tin Sinh Vien tu server la:<br/>
                ${requestScope.student}
            </h3>
        </div>
    </body>
</html>

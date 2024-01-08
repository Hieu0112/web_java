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
        <title>Add</title>
        <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            text-align: center;
        }

        form {
            width: 60%;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border: 1px solid #ccc;
        }

        h3 {
            color: red;
            text-align: center;
        }

        input[type="text"] {
            width: 99%;
            padding: 10px 0px 10px 10px;
            margin: 20px 0;
            border: 1px solid #ccc;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #0077b6;
            color: #fff;
            border: none;
            cursor: pointer;
        }
        </style>
    </head>
    <body>
        <h1>Add new Vật tư</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="add">
            Nhập Mã vật tư<input type="text" name="mavt"><br/>
            Tên vật tư<input type="text" name="tenvt"><br/>
            Đơn vị tính<input type="text" name="dvtinh"><br/>
            Phần trăm<input type="text" name="phantram"><br/>
            <input type="submit" value="SAVE">
        </form>
    </body>
</html>

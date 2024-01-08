<%-- 
    Document   : list
    Created on : Aug 21, 2023, 10:27:25 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #wrapper{
                font-family: arial;
                margin-left: 30px;
                width: 90%;
            }
            .clr {
                clear:both;
            }
            /*Phan Menu*/
            #menu_tab {
                width:100%;
            }
            ul.menu {
                float:left;
                background:url(./images/background_menu.jpg) repeat-x;
                display:block;
                list-style-type:none;
                font-weight:bold;
                width:1200px;
                height: 55px;
                padding:12px;
            }
            ul.menu li {
                display:inline;
                font-size:14px;
                padding-top: 15px;
                text-align:center;
                line-height:30px;
                color:#E2D9BC;
            }
            ul.menu li a{
                margin: 10px;
                padding-left:0px;
                text-decoration:none;
                text-align:center;
                color:#E2D9BC;
                position:relative;
            }
            ul.menu li a img{
                float:left;
                margin-left:10px;
            }
            ul.menu li .ATM {
                background:#270A02;
                border:none;
                color:#C60;
            }
            ul.menu li a:hover{
                color:#F90;
            }
            ul.menu li a:active{
                color:#FF0;
            }
            ul.menu li a:focus {
                color:#96F;
            }
            /*Phan footer*/
            .footer {
                background:url(./images/footer_bg.png) repeat-x;
                color: #ffffff;
                width:1200px;
            }
            .footer .logo {
                padding-top: 40px;
                padding-left: 300px;
                margin-bottom:10px;
                -webkit-transition: all 2s ease-in-out;
                -moz-transition: all 2s ease-in-out;
                -o-transition: all 2s ease-in-out;
                transition: all 2s ease;
            }
            .footer .footer_border {
                height:2px;
                background:#491D0F;
                margin-bottom:10px;
            }
            .footer .foot {
                padding-top: 10px;
                padding-left: 450px;
                padding-bottom: 20px;
            }
            .footer .foot h3 {
                -webkit-transition: all 1s ease-in-out;
                -moz-transition: all 1s ease-in-out;
                -o-transition: all 1s ease-in-out;
                transition: all 1s ease;
            }
            .footer:hover .logo {
                -webkit-transform:translateX(600px);
                -moz-transform:translateX(600px);
                -o-transform:translateX(600px);
            }
            .footer .foot:hover h3 {
                -webkit-transform:translateY(-60px);
                -moz-transform:translateY(-60px);
                -o-transform:translateY(-60px);
                color:#F60;
            }
            /*phan form*/
            #content{
                margin-left: 20px;
            }
            .login{
                width: 1200px;
                height: auto;
            }
            table{
                border-collapse: collapse;
            }
            td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div id="wrapper">
            <div id="menu_tab">
                <ul class="menu">
                    <li><a href="products?cid=${0}">All</a></li>
                    <c:forEach items="${requestScope.data}" var="c">
                    <li><a href="products?cid=${c.id}">${c.name}</a></li>
                    </c:forEach>
                </ul>
            </div>
            <div class="clr"></div>
            <div id="content">
                <c:set var="list" value="${requestScope.products}" />
                <c:if test="${((list==null)||(list.size()==0))}">
                    <h3>
                        No product
                    </h3>
                </c:if>
                <c:if test="${((list!=null)&&(list.size()>0))}">
                    <table border="1px">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>price</th>
                            <th>image</th>
                            <th>Category name</th>
                        </tr>
                        <c:forEach items="${list}" var="p">
                            <tr>
                                <th>${p.id}</th>
                                <th>${p.name}</th>
                                <th>${p.price}</th>
                                <th><img src="${p.image}" width="80px" height="auto"/></th>
                                <th>${p.category.name}</th>
                            </tr>
                        </c:forEach>
                    </table>
                </c:if>
            </div>
        </div>
    </body>
</html>

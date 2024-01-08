<%-- 
    Document   : h3
    Created on : Aug 20, 2023, 2:53:30 PM
    Author     : Hieu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>VD cho JSTL</h1>
        <c:set var="s" value="${requestScope.student}"/>
        <h2> Hello ${s.name}</h2>
        <image src="${(s.gender?'imgs/1.jpg':'imgs/2.png')}"/>
        <c:if test="${(s.diem>=5)}">
            <h3>Pass</h3>
        </c:if>
        <c:if test="${(s.diem<5)}">
            <h3>Fail</h3>
        </c:if>
            <h1>Danh sach Sinh Vien</h1>
            <table border="1px" width='40%'>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>gender</th>
                    <th>diem</th>
                    <th>rank</th>
                </tr>
                <c:forEach items="${requestScope.data}" var="i">
                    <tr>
                        <td>${i.id}</td>
                        <td>${i.name}</td>
                        <td>
                            <image src="${(i.gender?'imgs/1.jpg':
                                          'imgs/2.png')}" width="100px" height="auto" />
                        </td>
                        <td>${i.diem}</td>
                        <<td><h3>
                            <c:choose>
                                <c:when test="${i.diem<5}">
                                    weak
                                </c:when>
                                <c:when test="${(i.diem>=5 && i.diem<8)}">
                                    average
                                </c:when>
                                <c:when test="${i.diem>=8}">
                                    Excellent
                                </c:when>
                            </c:choose>
                            </h3>
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>

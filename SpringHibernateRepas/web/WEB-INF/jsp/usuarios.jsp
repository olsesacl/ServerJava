<%-- 
    Document   : usuarios
    Created on : 12-feb-2016, 21:06:53
    Author     : 2daw
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
        <h1>Listado de Usuarios</h1>
        
        <table border="1">
            <c:forEach var="usuario" items="${listaUsuarios}">
                <tr>
                    <td><c:out value="${usuario.getNombre()}"></c:out></td>
                    <td><c:out value="${usuario.getClave()}"></c:out></td>
                    <td><c:out value="${usuario.getEmail()}"></c:out></td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>

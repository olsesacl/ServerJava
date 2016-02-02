<%-- 
    Document   : tiendas
    Created on : 28-ene-2016, 21:01:36
    Author     : 2daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- Per a poder utilitzar les funcions amb "prefix c" --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            String titulo = request.getAttribute("Titulo").toString();
        %>
        <title>${titulo}</title>
    </head>
    <body>
        <h1>Listado de tiendas</h1>
        <h2>${mensaje}</h2>
        
        
        <table border="1">
            
            <c:forEach var="tienda" items="${lista}">
                <tr>
                    <td><c:out value="${tienda.getStoreName()}"></c:out></td>
                    <td><c:out value="${tienda.getStoreAddress()}"></c:out></td>
                    <td><c:out value="${tienda.getStoreCity()}"></c:out></td>
                    <td><a href="<%= request.getContextPath() %>/borrar/${tienda.getStoreId()}">Borrar</a></td>
                    <td><a href="">Editar</a></td>
                </tr>
                
            </c:forEach>
            
        </table>
        
    </body>
</html>

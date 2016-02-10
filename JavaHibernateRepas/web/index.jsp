<%-- 
    Document   : index
    Created on : 08-feb-2016, 20:22:35
    Author     : 2daw
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Entidad.Participante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de participantes</h1>
        
        <a href="insertar.jsp">Insertar Participante</a>
        <table border="1">
            <tr style="font-weight: bolder;">
                <td>Dorsal</td>
                <td>Nombre</td>
                <td>Apellidos</td>
                <td>Localidad</td>
                <td>Club</td>
            </tr>
        <%
            ArrayList<Participante> listaPart = (ArrayList<Participante>)request.getAttribute("listPart");
            
            for(Participante part:listaPart){
                %>
                
                <tr>
                    <td><%= part.getDorsal() %></td>
                    <td><%= part.getNombre() %></td>
                    <td><%= part.getApellidos() %></td>
                    <td><%= part.getPoblacion() %></td>
                    <td><%= part.getClub() %></td>
                    <td><a href="">Editar</a></td>
                    <td><a href="">Borrar</a></td>
                </tr>
                
            <%
            }
        %>
            
        </table>
        
    </body>
</html>

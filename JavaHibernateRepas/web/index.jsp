<%-- 
    Document   : index
    Created on : 08-feb-2016, 20:22:30
    Author     : isaa
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
        <h1>Lista de participantes</h1>
        <a href="insertar.jsp">Añadir participante</a>
        <table border="1">
            <th>Dorsal</th>
            <th>Nombre</th>
            <th>Apellidos</th>
            <th>Poblacion</th>
            <th>Club</th>
            <th>Editar</th>
             <th>Borrar</th>
            <!-- esto es un scriptlet para poder usar funciones de java -->
            <% ArrayList<Participante> listaPart = (ArrayList<Participante>) request.getAttribute("listaPart");
                for (Participante part : listaPart) {
                    if(part!=null){
            %>
            <tr>
                <td><%= part.getDorsal()%></td>
                <td><%= part.getNombre()%></td>
                <td><%= part.getApellidos()%></td>
                <td><%= part.getPoblacion()%></td>
                <td><%= part.getClub()%></td>
                <td><a href="EditarParticipante?dorsal=<%=part.getDorsal()%>">Editar</a></td>
                 <td><a href="BorrarParticipante?dorsal=<%=part.getDorsal()%>">Borrar</a></td>
            </tr>
            <%  }
                }


            %>
        </table>
    </body>
</html>

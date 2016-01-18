<%-- 
    Document   : MuestraParticipantes
    Created on : 11-ene-2016, 20:35:30
    Author     : Sergio
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Entidad.Participante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar participantes</title>
    </head>
    <body>
        
        <form method="post" action="mostrarDetallesParticipante">
            <h2>Ver datos del participante</h2>
            <select name="participanteElegido">
                <%
                    ArrayList<Participante> listadoParticipantes =(ArrayList<Participante>) request.getAttribute("listadoParticipantes");
                    
                    for(int i = 0; i < listadoParticipantes.size(); i++){
                        Participante participante = listadoParticipantes.get(i);
                        %>
                        <option value="<%=participante.getDorsal()%>">
                            <%= participante.getNombre() + ' ' + participante.getApellidos() %>
                        </option>
                        <%
                    }
                        %>
            </select>        
            <button type="submit">Buscar</button>
        </form>
        
    </body>
</html>

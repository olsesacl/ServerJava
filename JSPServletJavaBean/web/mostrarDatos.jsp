<%-- 
    Document   : mostrarDatos
    Created on : 05-feb-2016, 20:14:38
    Author     : 2daw
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entidad.Participante"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Alumno" scope="request" class="Entidad.InfoAlumno" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Los datos son los siguientes</h1>
        <div><b>Nombre:</b> <jsp:getProperty name="Alumno" property="nombre" /></div>
        <div><b>Primer Apellido:</b> <jsp:getProperty name="Alumno" property="apellido1"/></div>
        <div><b>Segundo Apellido</b> <jsp:getProperty name="Alumno" property="apellido2"/></div>
        
        <br><hr>
        <h1>Los datos de los participantes son</h1>
        
        <table border="1">
            
            <%
                ArrayList<Participante> listadoParticipantes = (ArrayList<Participante>) request.getAttribute("ListadoParticipantes");
                
                for(Participante part: listadoParticipantes){
                    %>
                    <tr>
                        <td><%= part.getDorsal() %></td>
                        <td><%= part.getNombre() %></td>
                        <td><%= part.getApellidos() %></td>
                        <td><%= part.getPoblacion() %></td>
                        <td><%= part.getClub() %></td>
                    </tr>
               <%     
                }

            %>
            
        </table>
        
        
    </body>
</html>

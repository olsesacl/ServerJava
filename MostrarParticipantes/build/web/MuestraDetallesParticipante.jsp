<%-- 
    Document   : MuestraDetallesParticipante
    Created on : 12-ene-2016, 20:34:37
    Author     : Sergio
--%>

<%@page import="Entidad.Participante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="participante" scope="request" class="Entidad.Participante" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles participante</title>
    </head>
    <body>
        <h2>Detalles <jsp:getProperty name="participante" property="nombre"/></h2>
       
            Dorsal: <jsp:getProperty name="participante" property="dorsal"/><br>
            Nombre: <jsp:getProperty name="participante" property="nombre"/><br>
            Apellidos: <jsp:getProperty name="participante" property="apellidos"/><br>
            Club: <jsp:getProperty name="participante" property="club"/><br>
            Poblacion: <jsp:getProperty name="participante" property="poblacion"/><br>
    </body>
</html>

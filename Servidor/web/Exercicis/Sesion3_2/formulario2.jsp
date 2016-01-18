<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="alquiler" scope="request" class="Exercicis.Sesion3_2.AlquilerBean" />
<%@include file="navbar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>Usted indicó la siguiente información:</b><br>
        <b>Pelicula:</b><jsp:getProperty name="alquiler" property="pelicula" /><br>
        <b>Dias de alquiler:</b><jsp:getProperty name="alquiler" property="dias" /><br>
        <b>Edad cliente</b><jsp:getProperty name="alquiler" property="edad" /><br>
        <b>Forma de pago:</b><jsp:getProperty name="alquiler" property="pago" /><br>        
        <b>Extras:</b><jsp:getProperty name="alquiler" property="extras" /><br>
        <b>¡Disfrute de la pelicula!</b>
    </body>
</html>

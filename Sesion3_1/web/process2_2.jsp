
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<jsp:useBean id="usuario" scope="request" class="Entidad.InfoUsuario" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>Usted indicó la siguiente información</b><br>
        <b>Nombre</b>: <jsp:getProperty name="usuario" property="name" /><br>
        <b>Email</b>: <jsp:getProperty name="usuario" property="email" /><br>
        <b>¡Esta respuesta ha sido generado desde JSP independizado de la lógica de negocio que produjo el JavaBean que usa!</b>
    </body>
</html>

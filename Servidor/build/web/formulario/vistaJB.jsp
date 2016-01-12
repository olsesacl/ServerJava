<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usuario" scope="request" class="formulario.InfoUsuario" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usted indicó la siguiente información</h1>
        <b>Nombre: </b><jsp:getProperty name="usuario" property="name" />
        <b>Email </b><jsp:getProperty name="usuario" property="email" />
        <p>Esta respuesta ha sido generada desde un jsp independiente</p>
    </body>
</html>

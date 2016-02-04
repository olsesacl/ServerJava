<%-- 
    Document   : procesar
    Created on : 02-feb-2016, 21:12:50
    Author     : 2daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usuario" scope="request" class="Entidad.Usuario" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Los datos son<br>
        Nombre: <jsp:getProperty name="usuario" property="name"/><br>
        Email: <jsp:getProperty name="usuario" property="email"/><br>
    </body>
</html>

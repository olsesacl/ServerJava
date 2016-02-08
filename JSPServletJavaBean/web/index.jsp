<%-- 
    Document   : index.jsp
    Created on : 05-feb-2016, 20:01:25
    Author     : 2daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del Alumno</h1>
        <form name="form1" action="RecogeDatos" method="POST">
            
            Nombre: <input type="text" name="nombre" value="" />
            Primer Apellido: <input type="text" name="apellido1" value="" />
            Segundo Apellido: <input type="text" name="apellido2" value="" />
            <input type="submit" value="Enviar" />
            
        </form>
    </body>
</html>

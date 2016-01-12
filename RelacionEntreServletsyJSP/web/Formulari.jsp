<%-- 
    Document   : Formulari
    Created on : 17-dic-2015, 21:02:51
    Author     : isaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del alumno</h1>
        <form name="form1" action="recogeDatos" method="POST">
            Nombre:<input type="text" name="nombre" value="" /> <br>
            Primer apellido: <input type="text" name="apellido1" value="" /><br>
            Segundo apellido: <input type="text" name="apellido2" value="" /><br>
            <input type="submit" value="enviar" />
        </form>

    </body>
</html>

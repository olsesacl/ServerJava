<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrada de datos</title>
    </head>
    <body>
        <form action="RecogeDatos" method="POST">
            <h2>Datois de Alumno:</h2>
            Nombre: <input type="text" name="nombre" /><br>
            Primer apellido: <input type="text" name="apellido1" /><br>
            Segundo apellido: <input type="text" name="apellido2" /><br>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>

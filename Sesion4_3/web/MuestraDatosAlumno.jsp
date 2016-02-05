<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="alumno" scope="request" class="Entidades.AlumnoBean" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Alumno</title>
    </head>
    <body>
        <h2>Los datos del alumno son:</h2><br>
        <b>Nombre:</b> <jsp:getProperty name="alumno" property="nombre" /><br>
        <b>Primer apellido:</b> <jsp:getProperty name="alumno" property="primerApellido"/><br>
        <b>Segundo apellido:</b> <jsp:getProperty name="alumno" property="segundoApellido"/><br>
        <b>DNI:</b> <jsp:getProperty name="alumno" property="DNI"/>
    </body>
</html>

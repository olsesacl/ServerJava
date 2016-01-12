<%-- 
    Document   : mostrarDatos
    Created on : 17-dic-2015, 21:21:02
    Author     : isaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- carregar bean, seria com un import de java--%>
 <jsp:useBean id="InfoAlumno" scope="request" class="Entidad.InfoAlumno" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El alumno introdujo los suiguientes datos: </h1>
        Nombre: <jsp:getProperty name="InfoAlumno" property="nombre" />
        Apellido 1:<jsp:getProperty name="InfoAlumno" property="apellido1" />
        Apellido 2: <jsp:getProperty name="InfoAlumno" property="apellido2" />
       
        
    </body>
</html>

<%-- 
    Document   : insertar
    Created on : 09-feb-2016, 21:24:12
    Author     : isaa
--%>
<jsp:useBean id="participante" scope="request" class="Entidad.Participante" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar participante</h1>
        <form name="formulario" method="POST" action="RegistrarParticipante">
        
            Dorsal:  <input type="text" name="dorsal" value="<jsp:getProperty name="participante" property="dorsal" />" /><br>
            Nombre:<input type="text" name="nombre" value="<jsp:getProperty name="participante" property="nombre" />" /><br>
            Apellidos:<input type="text" name="apellidos" value="<jsp:getProperty name="participante" property="apellidos" />" /><br>
            Poblacion: <input type="text" name="poblacion" value="<jsp:getProperty name="participante" property="poblacion" />" /><br>
            Club: <input type="text" name="club" value="<jsp:getProperty name="participante" property="club" />" /><br>
      <input type="submit" value="Guardar" name="guardar" />
        </form>
    </body>
</html>
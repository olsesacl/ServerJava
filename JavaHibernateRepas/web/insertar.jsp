<%-- 
    Document   : insertar
    Created on : 09-feb-2016, 21:24:12
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
        <h1>Alta participante</h1>
        <form name="formulario" method="POST" action="RegistrarParticipante">
        
            Dorsal:  <input type="text" name="dorsal" value="" /><br>
      Nombre:<input type="text" name="nombre" value="" /><br>
      Apellidos:<input type="text" name="apellidos" value="" /><br>
      Poblacion: <input type="text" name="poblacion" value="" /><br>
      Club: <input type="text" name="club" value="" /><br>
      <input type="submit" value="Guardar" name="guardar" />
        </form>
    </body>
</html>

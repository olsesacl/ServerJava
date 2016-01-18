<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2><%= session.getAttribute("nick")%> </h2>
        
        <form method="POST" action="recogerDatosChat">
            <label for="texto">Introduce texto y pulsa enviar:</label><br>
            <input name="texto" id="texto" type="text">
            <input type="submit" name="action" value="Enviar">
            <input type="submit" name="action" value="Actualizar">
        </form>
        
        <textarea disabled="disabled" cols="40" rows="20"><jsp:getProperty name="chat" property="texto"></jsp:getProperty></textarea>
        
    </body>
</html>

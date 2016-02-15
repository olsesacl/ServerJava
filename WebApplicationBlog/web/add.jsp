<%-- 
    Document   : add
    Created on : 15-feb-2016, 20:33:20
    Author     : 2daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>BlogController?add=1
        

        <h1>Añadir post</h1>

        
        <form name="formulario" method="POST" action="BlogController?add=1">
        
            Titulo: <input type="text" name="title" value="" /><br>
            Slug: <input type="text" name="new_slug" value="" /><br>
            Body: <textarea name="body"></textarea><br>
           
      <input type="submit" value="Guardar" name="guardar" />
        </form>
    </body>

</html>

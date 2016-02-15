<%-- 
    Document   : editar
    Created on : 15-feb-2016, 20:10:34
    Author     : 2daw
--%>
<%@page import="entidad.GnrPost"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar post</h1>
        <% GnrPost Post = (GnrPost) request.getAttribute("Post");%>
        
        <form name="formulario" method="POST" action="BlogController?edited=<%= Post.getPostSlug()%>">
        
            Titulo: <input type="text" name="title" value="<%= Post.getPostTitle()%>" /><br>
            Slug: <input type="text" name="new_slug" value="<%= Post.getPostSlug()%>" /><br>
            Body: <textarea name="body"><%= Post.getPostBody()%></textarea><br>
           
      <input type="submit" value="Guardar" name="guardar" />
        </form>
    </body>
</html>

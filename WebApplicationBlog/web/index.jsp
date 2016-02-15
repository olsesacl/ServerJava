<%-- 
    Document   : index.jsp
    Created on : 15-feb-2016, 18:56:48
    Author     : 2daw
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entidad.GnrPost"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Noticias del blog</title>
    </head>
    <body>
        <h1>NOTICIAS DEL BLOG</h1>
        <a href="add.jsp">Insertar nuevo post</a>
        <table border="1">
            <th>Titulo</th>
            <th>Imagen</th>
            <th>Editar</th>
            <th>Eliminar</th>
 
            <% ArrayList<GnrPost> listaPosts = (ArrayList<GnrPost>) request.getAttribute("listaPosts");
                for (GnrPost post : listaPosts) {
                    if(post!=null){
            %>
            <tr>
                <td><a href="BlogController?slug=<%= post.getPostSlug()%>"><%= post.getPostTitle()%></a></td>
                <td><img src="images/<%= post.getPostImage()%>" width="120px"></td>
                <td><a href="BlogController?editar=<%=post.getPostSlug()%>">Editar</a></td>
                <td><a href="BlogController?borrar=<%=post.getPostSlug()%>">Borrar</a></td>
            </tr>
            <%  }//if distinto de null
                }//for
            %>
        </table>
        
        
    </body>
</html>

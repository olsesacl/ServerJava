<%-- 
    Document   : BlogDetalle
    Created on : 15-feb-2016, 19:47:50
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
        <h1>Blog detalle</h1>
        <% GnrPost post = (GnrPost) request.getAttribute("Post");
        %>
        <table border="1">
            <tr><td><h3><%= post.getPostHeaderDescription() %><h3></td></tr>
            <tr><td><%= post.getPostBody()%></td></tr>
        </table>
        
        
    </body>
</html>

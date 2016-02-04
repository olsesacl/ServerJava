<%-- 
    Document   : index
    Created on : 02-feb-2016, 21:14:45
    Author     : 2daw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="usuario" scope="request" class="Entidad.Usuario" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(request.getParameter("name") == null){
                %>
                
                <form name="form1" method="POST" action="">
                    Nombre: <input type="text" name="name"><br>
                    Email:<input type="text" name="email"><br>
                <input type="submit" value="Enviar" name="Enviar">
            </form>
                
            <% } else {

                String nombre = request.getParameter("name");
                String email = request.getParameter("email");
            
            %>
            <jsp:setProperty name="usuario" property="name" value="<%= nombre %>" />
            <jsp:setProperty name="usuario" property="email" value="<%= email %>" />
            <jsp:forward page="procesar.jsp"></jsp:forward>
            
            <% } %>
        
        
        
    </body>
</html>

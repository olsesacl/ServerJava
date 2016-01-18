
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<jsp:useBean id="usuario" scope="request" class="Exercicis.Sesion3_1.InfoUsuario" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <% 
            if((request.getParameter("name") == null
                && request.getParameter("email")==null)
            ||
                    (request.getParameter("name").equals("")
                    && request.getParameter("email").equals("")))
        { %>
        Complete este formulario
        <form method="post" action="./process2_1.jsp">
            Su nombre: <input type="text" name="name" size="26"><br>
            Su email: <input type="text" name="email" size="26"><br>
            <input type="submit" value="Enviar">
        </form>
        <% } else { %>  <%-- scriptlet JSP --%>
       <% String nombre, mail;
        nombre = request.getParameter("name");
        mail = request.getParameter("email");
        %>
        <jsp:setProperty name="usuario" property="name" value="<%=nombre%>" />
        <jsp:setProperty name="usuario" property="email" value="<%=mail%>" />
        <jsp:forward page="./process2_2.jsp"></jsp:forward>
        
        <% } %>
    </body>
</html>

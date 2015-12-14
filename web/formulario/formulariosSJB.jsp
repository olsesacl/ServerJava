
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Rellena el formulario</h1>
        
        <% 
            if((request.getParameter("name") == null) || (request.getParameter("email") == null)
                    || (request.getParameter("name").equals("")) || (request.getParameter("email").equals(""))){
                
            
            %>
            <form name="form" action="formulariosSJB.jsp" method="POST">
                Su nombre:<input type="text" name="name" value="" size="26"/><br>
                Su email:<input type="text" name="email" value="" size="26"/><br>
                <input type="submit" value="Enviar" name="send" />
                
            </form>
            
            <%
                }else{ //Si ja estan definides les variables
                    //out.println("variables a mostrar");
                    String nombre = request.getParameter("name");
                    String mail = request.getParameter("email");
               %>
               <b>Usted ha indicado la siguiente informacion</b><br>
               <b>Nombre:</b> <%= nombre %><br>
               <b>Email:</b> <%= mail %>
              <%      
                } 
            
            %>
    </body>
</html>

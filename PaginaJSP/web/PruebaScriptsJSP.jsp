<%-- 
    Document   : PtuebaScriptsJSP
    Created on : 02-feb-2016, 20:49:33
    Author     : 2daw
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SCRIPTS JSP</title>
    </head>
    <body>
        <h1>SCRIPTS JSP</h1>
        
        <ul>
            <li>
                <b>Expresiones JSP</b><br>
                Fecha Actual: <%= new Date()%>
            </li>
            <li><b>Scriptlet</b><br>
                <%
                    Calendar cal = Calendar.getInstance();
                    out.println("La fecha actual es: " + cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR));
                    %>
            </li>
            <li>
                <b>Declaración más expresión</b><br>
                <%! private int cuentaDeAcceso = 0; %>
                
                Accesos a la página: <%= ++cuentaDeAcceso %>
                
            </li>
        </ul>
                
                <b>La ip de tu ordenador es:</b> <%= request.getRemoteHost() %> <br>
                <b>El puerto del servidor es:</b> <%= request.getServerPort() %><br>
                <b>El protocolo que estas usandoes :</b> <%= request.getProtocol()%><br>
        
    </body>
</html>

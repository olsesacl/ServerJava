<%-- 
    Document   : pruebaScriptsJSP
    Created on : 11-dic-2015, 20:57:01
    Author     : JuanJesus
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%><%-- --%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 2</title>
    </head>
    <body>
        <h1>Ejercicio 2</h1>
        <ul>
            <li>
                <!-- <b>Scriptlet JSP</b><br><%-- Un scriptlet es un trozo de código java--%> -->
                <%
                    Calendar cal = Calendar.getInstance();
                    out.println("La hora es: "+cal.get(Calendar.HOUR)+
                            ":"+(cal.get(Calendar.MINUTE)));
                %>
            </li>       
        </ul>
    </body>
</html>


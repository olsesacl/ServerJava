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
        <title>Ejercicio 3</title>
    </head>
    <body>
        <h1>Ejercicio 3</h1>
               
                <%
                    int cont = 0;
                %>
                <table border="1">
                        <% 
                        for (int i = 0; i<=9; i++){
                        %>
                            <tr>
                                <% 
                                    for (int e = 0; e<=5; e++){
                                %>
                                    
                                    <td> <%= cont %></td>
                                <%
                                    cont++;
                                }                    
                                %>
                            </tr>
                        <%
                        }                    
                        %>
                    
                                        
                </table>
                
    </body>
</html>

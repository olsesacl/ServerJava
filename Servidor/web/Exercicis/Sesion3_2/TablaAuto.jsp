<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="navbar.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
        <%
            for(int i = 0; i<60;){
                out.print("<tr>");
                for(int j = 0 ; j<6 ;j++){
                    out.print("<td>" + i +"</td>");
                    i++;
                }
                out.print("</tr>");
            }
            
            %>
        </table>
        
    </body>
</html>

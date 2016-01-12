
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        La IP de tu ordenador es: <%= request.getRemoteHost() %><br>
        El nombre del servidor es: <%= request.getServerName() %><br>
        El puerto del servidor: <%= request.getServerPort() %><br>
        La ip del servidor: <%= request.getRemoteAddr() %><br>
        El protocolo que estas usando es: <%= request.getProtocol() %>
    </body>
</html>

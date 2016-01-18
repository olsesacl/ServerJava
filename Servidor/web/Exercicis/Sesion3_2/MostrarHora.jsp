<%@page import="java.util.GregorianCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="navbar.jsp" %>
<%@page import="java.util.Calendar"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
        %>
        <b>Ahora son: </b><% out.print(String.format("%02d:%02d",hour, min));%>
    </body>
</html>

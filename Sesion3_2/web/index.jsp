<%-- 
    Document   : index
    Created on : 07-ene-2016, 16:33:18
    Author     : sergi
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <%@ page import="java.io.*" %>
<% 
String file = application.getRealPath("/");
File f = new File(file);
String [] fileNames = f.list();
File [] fileObjects= f.listFiles();
for (int i = 0; i < fileObjects.length; i++) {
    String fname = file+fileNames[i];
    if(fileObjects[i].isDirectory()){
        
            out.print("<br>Directorio <a href='./"+fileNames[i]+"'>"+fileNames[i]+"</a>");
     }
    else if(!fileObjects[i].isDirectory() && fileNames[i].compareToIgnoreCase("index.jsp")!=0){
        out.print("<br>Ficheros: <a href='./"+fileNames[i]+"'>"+fileNames[i]+"</a>");
    }
}
%>
    </body>
</html>

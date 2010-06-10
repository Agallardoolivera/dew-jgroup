<%-- 
    Document   : personas
    Created on : 19/05/2010, 07:29:32 PM
    Author     : U820901
--%>

<%@page import="proyecto.Persona, java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
<tr><th>Nombre</th><th>Apellidos</th></tr>
<%
Collection<Persona> c = (ArrayList<Persona>)request.getAttribute("personas");
   if (c!=null)
    for(Persona p : c) {
    out.println("<tr><td>");
    out.println(p.getNombre());
    out.println("</td><td>");
    out.println(p.getApellidos());
    out.println("</td></tr>");
    }
   else
     out.println("test");
    out.println("Alone");
%> </table>
    </body>
</html>

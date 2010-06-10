<%-- 
    Document   : Resultado
    Created on : 19/05/2010, 09:08:21 PM
    Author     : U201000432
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="ProyectoCalculos.CalculoServlet, java.util.*"%>
<html>
<body>
<table border="1">
<tr><th>Nombre</th><th>Apellidos</th></tr>
<%
Collection<Formulas> c = (ArrayList<Formulas>)request.getAttribute("formulas");
if (c!=null){
for(Formulas p : c) {
out.println("<tr><td>");
out.println(p.getNombre());
out.println("</td><td>");
out.println(p.getApellidos());
out.println("</td></tr>");
}
}
%> </table>
</body>
</html>


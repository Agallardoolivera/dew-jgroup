<%-- 
    Document   : test
    Created on : 01/08/2010, 11:56:28 AM
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test</title>
    </head>
    <body>
        <table width="100%" border="1">
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Unidad de Medida</th>
            </tr>


            <%    java.util.Collection <proyecto.modelo.Articulo> articulos= (java.util.Collection)request.getAttribute("articulos");
                    for (proyecto.modelo.Articulo art : articulos) {
            %>
            <tr>
                <td><% out.print(art.getCo_Articulo());%></td>
                <td><%  out.print(art.getNo_Articulo());%></td>
                <td><%  out.print(art.getUM());}%></td>
            </tr>
         
</table>
  </body>
</html>

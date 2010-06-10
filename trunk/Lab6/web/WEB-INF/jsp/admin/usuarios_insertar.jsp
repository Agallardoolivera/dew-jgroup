<%-- 
    Document   : usuarios_insertar
    Created on : 09/06/2010, 08:22:57 PM
    Author     : u814305
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuarios insertar</h1>
<form action="usuarios_mantener.htm" method="post">
<input type="hidden" name="metodo" value="doInsertar"/>
IdUsuario: <input type="text" name="idUsuario"/> <br/>
Clave: <input type="text" name="clave"/> <br/>
Nombres: <input type="text" name="nombres"/> <br/>
<input type="submit" value="Insertar"/>
</form>
    </body>
</html>

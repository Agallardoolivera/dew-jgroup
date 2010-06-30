<%-- 
    Document   : usuarios_insertar
    Created on : 09/06/2010, 08:22:54 PM
    Author     : pcsidrod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/util.js"></script>
    </head>
    <body>
        <h1>Usuarios insertar</h1>
        <form method="post">
            <input type="hidden" name="metodo" value="doInsertar"/>
            IdUsuario: <input type="text" name="idUsuario" id="idUsuario"/> <br/>
            Clave: <input type="text" name="clave" id="clave"/> <br/>
            Nombres: <input type="text" name="nombres" id="nombres"/> <br/>
            <input type="button" value="Insertar" onclick="usuarioInsertar();"/>
        </form>
        <div id="tablaContenido">
        </div>
    </body>
</html>

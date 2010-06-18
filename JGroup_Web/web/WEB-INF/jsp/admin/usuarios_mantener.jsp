<%-- 
    Document   : usuarios_mantener
    Created on : 09/06/2010, 08:20:17 PM
    Author     : pcsidrod
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuarios mantener</h1>
        <form>
            <input type="button" value="Insertar"
                   onclick="window.location='usuarios_mantener.htm?metodo=insertar'"/>
        </form>


    <c:forEach items="${usuarios}" var="u">
        ${u.nombres} <br/>
    </c:forEach>
</body>
</html>

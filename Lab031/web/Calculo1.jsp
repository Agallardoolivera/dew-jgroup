<%-- 
    Document   : Calculo1
    Created on : 19/05/2010, 08:36:45 PM
    Author     : U201000432
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<form method="post" action="CalculoServlet">
Operador 1: <input type="text" name="operador1" size="4"
maxlength="4"/><br/>
Operador 2: <input type="text" name="operador2" size="4"
maxlength="4"/><br/>
Operador 3: <input type="text" name="operador3" size="4"
maxlength="4"/><br/>

<input type="submit" name="operacion" value="Realizar la suma"/>
</form>
</body>
</html>

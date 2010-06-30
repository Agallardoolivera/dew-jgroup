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
        <script type="text/javascript" src="<%=request.getContextPath()%>/js/util.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>::- Sistema de Pedidos On Line -::</title>
        <link type="image/x-icon" href="../favicon.ico" rel="icon" />
        <link type="image/x-icon" href="../favicon.ico" rel="shortcut icon" />
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/efc.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/cf.css"/>
        <!--<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/menus.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/grid.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/Progress.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/ext-all.css"/>-->
        <script language="JavaScript" src="../js/jquery-1.2.3.js"></script>
        <script language="JavaScript" src="../js/jquery.maskedinput-1.1.2.pack.js"  type="text/javascript"></script>
        <script language="JavaScript" src="../js/jquery.numeric.pack.js"></script>
        <script language="JavaScript" src="../js/jquery.floatnumber.js"></script>
        <script language="JavaScript" src="../js/jquery.tablehover.js"></script>
        <style type="text/css">
        <!--
        .Estilo1 {font-size: 24px}
        .Estilo2 {
                font-size: 16px;
                font-style: italic;
                color: #000033;
        }
        .Estilo3 {
                font-size: 12px;
                font-style: italic;
                font-weight: bold;
        }
        -->
        </style>
        -
        <script language="JavaScript" src="../js/graphs.js"></script>
        <script language="JavaScript" src="../js/swfobject.js"></script>
        <script language="JavaScript" src="../js/funcion_cont.js"></script>
    </head>
    <body topmargin="0" leftmargin="0" rightmargin="0">



        <input type="hidden" name="idusuario" id="idusuario" value="" />
        <input type="hidden" name="idempresa" id="idempresa" value="" />
        <input type="hidden" name="idarea" id="idarea" value="" />
        <div id="basecont">
            <div id="header">
                <table border="0" cellpadding="2" cellspacing="2" width="100%">
                    <tr>
                        <td width="1%"></td>
                        <td width="12%" align="left" id="logoefc">
                            <script type="text/javascript">
                                // <![CDATA[
                                var so = new SWFObject("logoefc_chico.swf", "EFC", "180", "95", "9", "#999999");
                                //so.addVariable("flashVarText", "this is passed in via FlashVars for example only"); // this line is optional, but this example uses the variable and displays this text inside the flash movie
                                so.write("logoefc");
                                // ]]>
                            </script>
                        </td>
                        <td width="77%" align="left">
                            <span class="titlelogo">proveedores <br />
                                &nbsp;industriales</span><br /><br />

                            <span class="textlogo" style="font-size:11px;">Soluciones integrales de Abastecimiento</span>
                        </td>

                        <td width="10%"><p align="center"><a href="menu.htm"><img src="<%=request.getContextPath()%>/images/Browser History.png" width="49" height="40" border="0" align="middle" title="Usuario"/></a></p>
                            <p align="center" class="Estilo3">Retornar al Men&uacute; </p></td>
                        <td width="0%" style=" text-align:left;">
 </td>
                    </tr>
                </table>
            </div>
            <div style="background:#99CC33;"></div>
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:450px;">
    </head>
    <body>
        <h1>Usuarios mantener</h1>
        <form method="post" action="usuarios_mantener.htm?metodo=insertar">
             <input type="hidden" name="metodo" value="doInsertar"/>
                        <table width="450" border="1" align="center">
                            <tr><td width="127" align="left"><span class="Estilo3">Ingrese Nombres</span></td>
                                <td colspan="3" align="left"><input type="text" name="txt_nom" id="txt_nom" size="40"/></td>
                            <tr><td align="left"><span class="Estilo3">Ingrese Apellidos</span></td>
    <td colspan="3" align="left"><input type="text" name="txt_ape" id="txt_ape" size="40"/></td>
<tr><td align="left"><span class="Estilo3">Ingrese DNI</span></td>
    <td colspan="3" align="left"><input type="text" name="txt_dni" id="txt_dni" maxlength="8"/></td>
<tr><td align="left"><span class="Estilo3">Ingrese Usuario</span></td>
    <td colspan="3" align="left"><input type="text" name="txt_usu" id="txt_usu" maxlength="20"/></td>
<tr><td align="left"><span class="Estilo3">Ingrese Contrasena</span></td>
    <td colspan="3" align="left"><input type="password" name="txt_contra" id="txt_contra" maxlength="20"/></td>
<tr><td align="left"><span class="Estilo3">Tipo Usuario</span></td>
	<td width="114">Administrador:
	  <input name="rbttipusu" type="radio" value="1"/>
</td>
	<td width="101">Avanzado:
  <input name="rbttipusu" type="radio" value="2" />
</td>
<td width="104">Usuario:
  <input name="rbttipusu" type="radio" value="3" checked="checked"/>
</td>
</table>
            <table width="450" border="1" align="center">
<tr><td width="260" align="center"><input type="button" value="Insertar" onclick="usuarioInsertar();"/></td>
<td width="224" align="center"><input type="submit" name="btn_canc" value="Cancelar" /></td></tr>
</table>

            
        </form>
        <table border="1" width="450">
            <tr class="Estilo3">
                <td width="93">Nombres</td>
                <td width="93">Apellidos</td>
                <td width="50">Dni</td>
                <td width="93">Usuario</td>
                <td width="93">Password</td>
                <td width="93">Editar</td>
                <td width="93">Eliminar</td>
            </tr>
            <tr>
                <td width="93"><div id="tablanombre"></td>
                <td width="93"><div id="tablaapellido"></td>
                <td width="20"><div id="tabladni"></td>
                <td width="93"><div id="tablausu"></td>
                <td width="93"><div id="tablacontra"></td>
                <td><a href='usuarios_editar.htm?metodo=editar>Editar</a></td>
                <td><a href="usuarios_eliminar.htm">Eliminar</a></td>
               
            </tr>
        </table>
    <c:forEach items="${usuarios}" var="u">
        ${u.nombres} <br/>
    </c:forEach>
        
</body>
</html>

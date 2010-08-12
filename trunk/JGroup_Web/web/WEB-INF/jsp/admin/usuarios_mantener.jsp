<%-- 
    Document   : usuarios_mantener
    Created on : 09/06/2010, 08:20:17 PM
    Author     : pcsidrod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="usuario" scope="page" class="proyecto.modelo.Usuario" />
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

                        <td width="10%"><p align="center"><a href="retornaMenu.htm?metodo=Menu"><img src="<%=request.getContextPath()%>/images/Browser History.png" width="49" height="40" border="0" align="middle" title="Usuario"/></a></p>
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
                            <form method="post" action="usuarios_mantener.htm?metodo=doInsertar">
                                
                                <input type="hidden" name="metodo" value="doInsertar"/>
                                <table width="450" border="1" align="center">
                                    <tr><td width="127" align="left"><span class="Estilo3">Ingrese Nombres</span></td>
                                        <td colspan="3" align="left"><input type="text" name="usuario" id="usuario" size="40"/></td>
                                    <tr><td align="left"><span class="Estilo3">Ingrese Contrasena</span></td>
                                        <td colspan="3" align="left"><input type="password" name="contra" id="contra" maxlength="20"/></td>
                                </table>
                                <table width="450" border="1" align="center">
                                    <tr><td width="260" align="center"><input name="btnguardar" type="submit" value="Insertar"/></td>
                                        <td width="224" align="center"><input type="submit" name="btn_canc" value="Cancelar" /></td></tr>
                                </table>


                            </form>
                            <form name="form2" method="post" action="usuarios_mantener.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            Usuarios:
            <label>
                <input name="nombre" type="text" id="nombre">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
            </label>
                            <table border="1" width="450" class="subtitleing">
                                <tr class="Estilo3">
                                    <td width="93">Nombres</td>
                                    <td width="93">Password</td>
                                    <td width="93">Editar</td>
                                    <td width="93">Eliminar</td>
                                </tr>
                                 <% if(request.getAttribute("usuarios")!=null) {
                %>
            <%    java.util.Collection <proyecto.modelo.Usuario> usuarios= (java.util.Collection)request.getAttribute("usuarios");
                    for (proyecto.modelo.Usuario art : usuarios) {
            %>
            <tr>
                <td><% out.print(art.getCo_Usuario());%></td>
                <td><%  out.print(art.getClave());%></td>
           
                <td><a href="usuarios_editar.htm?metodo=obtener&codigo=<%=art.getCo_Usuario()%>&clave=<%=art.getClave()%>">Editar</a></td><td><a href="usuarios_mantener.htm?metodo=eliminar&codigo=<%=art.getCo_Usuario()%>">Eliminar</a> </td>
            </tr>
            <% }%>
           <% }%>
                            </table>
                            
                            </form>
                        </body>
                        </html>

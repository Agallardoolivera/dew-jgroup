<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Sistema de Cotizaciones On Line </title>
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
        <p><strong>Mantenimiento de Invitaciones</strong></p>
        <form name="form1" method="post" action="invitacion.htm">
            <input type="hidden" name="metodo" value="insertar"/>
            <table width="44%" border="1">
                <tr>
                    <td><div align="right"><span class="Estilo4">Numero de Invitacion</span></div></td>
                    <td><label>
                            <input name="Nu_Invitacion" type="text" id="Nu_Invitacion">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Fecha de Invitacion: (YYYY-MM-DD)</span></div></td>
                    <td width="72%"><label>
                            <input name="Fe_Invitacion" type="text" id="Fe_Invitacion">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Descripcion</span></div></td>
                    <td><label>
                            <input name="Tx_Descripcion" type="text" id="Tx_Descripcion">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Generador de Usuario</span></div></td>
                    <td><label>
                            <input name="Tx_GeneradorUsuario" type="text" id="Tx_GeneradorUsuario">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Codigo de Usuario</span></div></td>
                    <td><label>
                            <input name="Usuario_Co_Usuario" type="text" id="Usuario_Co_Usuario">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Orden de Compra</span></div></td>
                    <td><label>
                            <input name="OrdenCompra_Nu_OrdenCompra" type="text" id="OrdenCompra_Nu_OrdenCompra">
                        </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Guardar">
                        </label>
                        <label>
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='portada.htm'">

                        </label></td>
                </tr>
            </table>
        </form>

        <form name="form1" method="post" action="invitacion.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            Buscar:
            <label>
                <input name="Descripcion" type="text" id="Descripcion">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
            </label>
            <label>
                <input name="btnnuevo" type="button" id="btnnuevo" value="Nuevo" onclick="window.location='invitacion.htm?metodo=nuevo'">
            </label>
        <table width="70%" border="1">
            <tr>
                <th>Numero de Invitacion</th>
                <th>Fecha de Invitacion</th>
                <th>Generador de Usuario</th>
                <th>Descripci&oacute;n</th>
                <th>Usuario</th>
                <th>Numero de Orden</th>
                <th>Acciones</th>
            </tr>

            <% if (request.getAttribute("invitaciones") != null) {
            %>
            <%    java.util.Collection<proyecto.modelo.Invitacion> invitaciones = (java.util.Collection) request.getAttribute("invitaciones");
                 for (proyecto.modelo.Invitacion inv : invitaciones) {
            %>
            <tr>
                <th><% out.print(inv.getNu_Invitacion());%></th>
                <th><%  out.print(inv.getFe_Invitacion());%></th>
                <th><%  out.print(inv.getTx_GeneradorUsuario());%></th>
                <th><%  out.print(inv.getTx_Descripcion());%></th>
                <th><%  out.print(inv.getUsuario_Co_Usuario());%></th>
                <th><%  out.print(inv.getOrdenCompra_Nu_OrdenCompra());%></th>
                <th><a href="invitacion.htm?metodo=obtener&Nu_Invitacion=<%=inv.getNu_Invitacion()%>&Fe_Invitacion=<%=inv.getFe_Invitacion()%>&Gen_Usuario=<%=inv.getTx_GeneradorUsuario()%>&Descripcion=<%=inv.getTx_Descripcion()%>&Usuario=<%=inv.getUsuario_Co_Usuario()%>&Orden_Compra=<%=inv.getOrdenCompra_Nu_OrdenCompra()%>">Editar</a> -
                    <a href="invitacion.htm?metodo=eliminar&Nu_Invitacion=<%=inv.getNu_Invitacion()%>">Eliminar</a> - <a href="detalleinvitacion.htm?metodo=index&Nu_Invitacion=<%=inv.getNu_Invitacion()%>">Agregar Detalle Invitacion</a> - <a href="cotizaciones.htm?metodo=index&Nu_Invitacion=<%=inv.getNu_Invitacion()%>&Des_Invitacion=<%=inv.getTx_Descripcion()%>">Generar Cotizacion</a> </th>
            </tr>
            <% }%>
            <% }%>

             
        </table>

    </body>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="articulo" scope="page" class="proyecto.modelo.Articulo" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <script type="text/javascript" src="<%=request.getContextPath()%>/js/util.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>::- Sistema de Pedidos On Line -::</title>
        <link type="image/x-icon" href="../favicon.ico" rel="icon" />
        <link type="image/x-icon" href="../favicon.ico" rel="shortcut icon" />
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/efc.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/cf.css"/>
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
        <title>JSP Page</title>
    </head>
     <body topmargin="0" leftmargin="0" rightmargin="0">

  <div id="basecont">
            <div id="header">
                <table border="0" cellpadding="2" cellspacing="2" width="100%">
                    <tr>
                        <td width="1%"></td>
                        <td width="12%" align="left" id="logoefc"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="130" height="85">
                          <param name="movie" value="images/logoefc_chico.swf" />
                          <param name="quality" value="high" />
                          <embed src="images/logoefc_chico.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="111" height="66"></embed>
                        </object>
                        <td width="3%" align="left" id="logoefc">
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

                        <td width="10%"><p align="center"><a href="retornaMenu.htm?metodo=Menu"><img src="<%=request.getContextPath()%>/images/Browser History.png" width="70" height="40" border="0" align="middle" title="Usuario"/></a></p>
                            <p align="center" class="Estilo3">Retornar al Men&uacute; </p></td>
                        <td width="0%" style=" text-align:left;">
                        </td>
                    </tr>
                </table>
            </div>
            <div style="background:#99CC33;"></div>
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:350px;">
                        </head>
                        
    <body>
        <p><strong>Mantenimiento de Articulos</strong></p>
        <form name="form1" method="post" action="articulo.htm">
            <input type="hidden" name="metodo" value="insertar"/>
            <table width="44%" border="1" align="center">
                <tr>
                    <td><div align="right"><span class="Estilo4">Codigo</span></div></td>
                    <td><label>
                            <input name="codigo" id="codigo">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Nombre:</span></div></td>
                    <td width="72%"><label>
                            <input name="nombre" type="text" id="nombre">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Unidad de Medida</span></div></td>
                    <td><label>
                            <select name="UM" size="1" id="UM">
                                <option value="PZA">PZA</option>
                                <option value="KGR">KGR</option>
                                <option value="LTR">LTR</option>
                                <option value="MTR">MTR</option>
                                <option value="DOC">DOC</option>
                                <option value="JGO">JGO</option>
                                <option value="CJA">CJA</option>
                                <option value="MLL">MLL</option>
                                <option value="CTO">CTO</option>
                            </select>
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

        <form name="form2" method="post" action="articulo.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            <table border="1" align="center"><tr><td>
                        Articulo:</td><td>
            <label>
                <input name="nombre" type="text" id="nombre"></td>
                    </label><td>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
            </label></td></tr>
            </table>
            <table width="60%" border="1" align="center">
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Unidad de Medida</th>
                <th>Acciones</th>
            </tr>
            <% if(request.getAttribute("articulos")!=null) {
                %>
            <%    java.util.Collection <proyecto.modelo.Articulo> articulos= (java.util.Collection)request.getAttribute("articulos");
                    for (proyecto.modelo.Articulo art : articulos) {
            %>
            <tr>
                <td><% out.print(art.getCo_Articulo());%></td>
                <td><%  out.print(art.getNo_Articulo());%></td>
                <td><%  out.print(art.getUM());%></td>
                <td><a href="articulo.htm?metodo=obtener&codigo=<%=art.getCo_Articulo()%>&nombre=<%=art.getNo_Articulo()%>&um=<%=art.getUM()%>">Editar</a> - <a href="articulo.htm?metodo=eliminar&codigo=<%=art.getCo_Articulo()%>">Bloquear</a> </td>
            </tr>
            <% }%>
           <% }%>

            </table>
       </form>
    </body>
</html>
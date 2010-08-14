<%--
    Document   : categorias_editar
    Created on : 06/07/2010, 12:32:10 PM
    Author     : rcondezo
--%>

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
                    <div style="height:350px;">
    </head>
    <body>

        <p><strong>Mantenimiento de Articulos - Editar</strong></p>

<% String CoArticulo = request.getParameter("codigo");
   String NoArticulo = request.getParameter("nombre");
   String UM = request.getParameter("um");
%>
                <form name="form1" method="post" action="articulo.htm">
            <input type="hidden" name="metodo" value="actualizar"/>

            <table width="44%" border="1" align="center">

                <tr>
                    <td class="Estilo4"><div align="right">C&oacute;digo</div></td>
                    <td><label>
                            <input name="codigo" type="text" id="codigo" readonly="readonly" value="<%out.println(CoArticulo);%>">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Nombre:</span></div></td>
                    <td width="72%"><label>
                            <input name="nombre" type="text" id="nombre" value="<%out.println(NoArticulo);%>">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Unidad de Medida</span></div></td>
                    <td><label>
                            <select name="um" size="1" id="um">
                                <option value="<%out.println(UM);%>"><%out.println(UM);%></option>
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
                        </label></td></td>
                </tr>
                <tr>
                   
                    <td align="center"><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Guardar">
                        </label></td><td align="center">
                        <label>
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='articulo.htm'">
                        </label></td>
                </tr>
                
            </table>
        </form>

    </body>
</html>

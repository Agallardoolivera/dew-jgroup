<%-- 
    Document   : ReglasNegocio
    Created on : 11/08/2010, 11:28:37 PM
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
        <title>JSP Page</title>
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
          <form name="form1" method="post" action="reglas.htm">
              <input type="hidden" name="metodo" value="ListarPropuestas"/>
            Numero de Invitacion:
            <label>
                <input name="N_Invitacion" type="text" id="N_Invitacion">
            </label>
            <label>
                <input name="btnlistar" type="submit" id="btnlistar" value="Listar">
            </label>
        </form>

         <table width="100%" border="1">
            <tr>
                <th>Numero de Cotizacion</th>
                <th>Codigo del Proveedor</th>
                <th>Fecha de Entrega</th>
            </tr>

            <% if (request.getAttribute("cotizaciones") != null) {
            %>
            <%    java.util.Collection<proyecto.modelo.Cotizacion> cotizaciones = (java.util.Collection) request.getAttribute("cotizaciones");
                 for (proyecto.modelo.Cotizacion cot : cotizaciones) {
            %>
            <tr>
                <th><% out.print(cot.getNu_Cotizacion());%></th>
                <th><%  out.print(cot.getCo_Proveedor());%></th>
                <th><%  out.print(cot.getFe_Entrega());%></th>
            </tr>
            <% }%>
            <% }%>


        </table>



          <form name="form2" method="post" action="reglas.htm">
              <input type="hidden" name="metodo" value="AnalisisPropuestas"/>
            Elegir Ganador:
            <label>
                <input name="Nu_Invitacion" type="text" id="Nu_Invitacion">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Enviar">
            </label>
        </form>

         <table width="100%" border="1">
            <tr>
                <th>Proveedor Ganador</th>
            

            <% if (request.getAttribute("ProveedorGanador") != null) {
            %>
            <%    String proveedor = request.getAttribute("ProveedorGanador").toString();
            %>
           
                <th><% out.print(proveedor);%></th>
            
                </th>
            <% }%>

            </tr>
        </table>
    </body>
</html>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Documento sin t&iacute;tulo</title>

<script language="javascript1.5" type="text/javascript">
//funcion para mostrar u ocultar el submenu
function fn_mostrar_ocultar_submenu(submenu,imagen)
{	if(document.getElementById(submenu).style.display=="inline")
	{	document.getElementById(submenu).style.display="none";
		document.getElementById(imagen).src="images/mas.png";	
	}
	else
	{	document.getElementById(submenu).style.display="inline";	
		document.getElementById(imagen).src="images/menos.png";	
	}
}
</script>
<style type="text/css">
<!--
.Estilo1 {font-size: 10px}
.Estilo2 {font-size: 14px; }
.Estilo3 {font-size: 18px; text-align:left;}
.Estilo4 {font-size: 16px}
.Estilo31 {font-size: 12px;
                font-style: italic;
                font-weight: bold;
}
-->
</style>
</head>
<body>
<table border="0" cellpadding="0" cellspacing="0" width="773">
  <tr>
    <td style="vertical-align:top;"><input type="hidden" name="idusuario" id="idusuario" value="" />
        <input type="hidden" name="idempresa" id="idempresa" value="" />
        <input type="hidden" name="idarea" id="idarea" value="" />
        <div id="basecont">
          <div id="header">
            <table border="0" cellpadding="2" cellspacing="2" width="100%">
              <tr>
                <td width="1%"></td>
                <td width="12%" align="left" id="logoefc"><script type="text/javascript">
                                // <![CDATA[
                                var so = new SWFObject("logoefc_chico.swf", "EFC", "180", "95", "9", "#999999");
                                //so.addVariable("flashVarText", "this is passed in via FlashVars for example only"); // this line is optional, but this example uses the variable and displays this text inside the flash movie
                                so.write("logoefc");
                                // ]]>
                            </script>
                </td>
                <td width="77%" align="left"><span class="titlelogo">proveedores <br />
                  &nbsp;industriales</span><br />
                  <br />
                  <span class="textlogo" style="font-size:11px;">Soluciones integrales de Abastecimiento</span> </td>
                <td width="10%"><p align="center"><a href="retornaMenu.htm?metodo=Menu"><img src="<%=request.getContextPath()%>/images/Browser History.png" alt="" width="49" height="40" border="0" align="middle" title="Usuario"/></a></p>
                    <p align="center" class="Estilo31">Retornar al Men&uacute; </p></td>
                <td width="0%" style=" text-align:left;">

                </td>
              </tr>
            </table>
          </div>
          <div style="background:#99CC33;">&nbsp;
              <?php //include("menu.php");?>
          </div>
          <div id="basemedio">
            <div id="contenido" align="center">
              <div style="height:350px;">
                <p></p>
                <table width="922" border="0">
                    <form id="form1" name="form1" method="post" action="criterio.htm">
                    <input type="hidden" name="metodo" value="insertar"/>
                  <tr>
                    <td width="296" align="left">&nbsp;</td>
                    <td width="193" align="left">Codigo de Criterio</td>
                    <td width="419" align="center"><div align="left">
                        <input name="txtCodigo" type="text" id="txtCodigo" size="10" />
                    </div></td>
                  </tr>
                  <tr>
                    <td align="right">&nbsp;</td>
                    <td align="left">Tipo de dato</td>
                    <td align="left">
                        <label>
                        <select name="tipoDato" id="tipoDato">
                          <option value="Numerico">Numerico</option>
                          <option value="Fecha">Fecha</option>
                        </select>
                        </label>                      
                    </td>
                  </tr>
                  <tr>
                    <td align="right">&nbsp;</td>
                    <td height="74" align="left">Descripci&oacute;n</td>
                    <td align="left">
                        <label for="txtDescripcion"></label>
                        <textarea name="txtDescripcion" id="txtDescripcion" cols="21" rows="5"></textarea>
                      </td>
                  </tr>
                  <tr align="center">
                    <td colspan="3"><input type="submit" name="btnIngresarCriterios" id="btnIngresarCriterios" value="Registrar" />
                  </tr>
                  </form>
                </table>

                                                          <form name="form2" method="post" action="criterio.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            Tipo de Criterio:
            <label>
                <input name="tipo" type="text" id="tipo">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
            </label>

<table width="100%" border="1">
            <tr>
                <th>Codigo</th>
                <th>Tipo de Dato</th>
                <th>Descripcion</th>
                <th>Acciones</th>
            </tr>
            <% if(request.getAttribute("criterios")!=null) {
                %>
            <%    java.util.Collection <proyecto.modelo.CriterioEvaluacion> criterios= (java.util.Collection)request.getAttribute("criterios");
                    for (proyecto.modelo.CriterioEvaluacion crit : criterios) {
            %>
            <tr>
                <td><% out.print(crit.getCo_Criterio());%></td>
                <td><%  out.print(crit.getTipo_Dato());%></td>
                <td><%  out.print(crit.getTx_DescCriterioEvaluacion());%></td>
                <td><a href="criterio.htm?metodo=obtener&codigo=<%=crit.getCo_Criterio()%>&tipo=<%=crit.getTipo_Dato()%>&descripcion=<%=crit.getTx_DescCriterioEvaluacion()%>">Editar</a> - <a href="criterio.htm?metodo=eliminar&codigo=<%=crit.getCo_Criterio()%>">Eliminar</a> </td>
            </tr>
            <% }%>
           <% }%>

            </table>
       </form>
              </div>
            </div>
          </div>
        </div>
      <p>&nbsp;</p>
      <p>&nbsp;</p></td>
  </tr>
</table>
</body>
</html>

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
                            <span class="textlogo" style="font-size:11px;">Soluciones integrales de Abastecimiento</span>
                        </td>
                        <td width="10%"><p align="center"><a href="retornaMenu.htm?metodo=Menu"><img src="<%=request.getContextPath()%>/images/Browser History.png" width="49" height="40" border="0" align="middle" title="Usuario"/></a></p>
                            <p align="center" class="Estilo3">Retornar al Men&uacute; </p></td>
                        <td width="0%" style=" text-align:left;">

                            <!--<img src="../iconos/nombrepeq.gif" />
                            <table border="0" cellpadding="0" cellspacing="0" width="100%">
            	<tr>
                	<td colspan="2" style="text-align:right; color:#FFFFFF; font-weight:bold;">&nbsp;</td>
                	<td colspan="2" style="text-align:right; color:#FFFFFF; font-weight:bold;">Datos de Usuario</td>
                                </tr>
                                <tr>
                	<td colspan="2" style="text-align:right; color:#FFFFFF; font-weight:bold;">&nbsp;</td>
                	<td colspan="2" style="text-align:right; color:#FFFFFF; font-weight:bold;"></td>
                                </tr>
                                <tr>
                	<td colspan="2" style="text-align:right; color:#FFFFFF; font-weight:bold;">&nbsp;</td>
                	<td colspan="2" style="text-align:right; color:#FFFFFF; font-weight:bold;">&nbsp;</td>
                                </tr>
                            </table>
                            <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tr>
                	<td style="text-align:right; width:10px;"></td>
                                    <td style="text-align:right; width:10px;"></td>
                	<td style="text-align:rleft; color:#FFFFFF; font-weight:bold;">Datos de Empresa</td>
                	<td style="text-align:right; color:#FFFFFF; width:70px; font-weight:bold;"></td>
                                    <td style="text-align:right; width:10px;"></td>
                                </tr>
            	<tr>
                	<td style="text-align:right; width:10px;"></td>
                                    <td style="text-align:right; width:10px;"></td>
                	<td style="text-align:left; color:#FFFFFF;">Raz.Soc: </td>
                                    <td style="text-align:right; color:#FFFFFF; width:70px; font-weight:bold;"></td>
                                    <td style="text-align:right; width:10px;"></td>
                                </tr>
                                <tr>
                	<td style="text-align:right; width:10px;"></td>
                                    <td style="text-align:right; width:10px;"></td>
                	<td style="text-align:left; color:#FFFFFF;">Direcci&oacute;n: </td>
                                    <td style="text-align:right; color:#FFFFFF; width:70px; font-weight:bold;"></td>
                                    <td style="text-align:right; width:10px;"></td>
                                </tr>
                            </table>-->            </td>
                    </tr>
                </table>
            </div>
            <div style="background:#99CC33;">&nbsp;<?php //include("menu.php");?></div>
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:350px;">
                      <p>&nbsp;</p>
                      <hr />
					  <br><br>
                      <form id="registroProveedor" name="registroProveedor" method="post" action="">
<label></label><p>&nbsp;</p>
<div align="left"><p>INGRESO DE PROVEEDOR </p></div>

<table width="356" border="1" align="left" bordercolor="#FFFFFF">
    <tr>
      <td width="150">Raz&oacute;n Social </td>
      <td width="190"><input name="ruc" type="text" id="ruc" /></td>
    </tr>
    <tr>
      <td>RUC</td>
      <td><input name="direccion" type="text" id="direccion" /></td>
    </tr>
    <tr>
      <td>Direcci&oacute;n</td>
      <td><input name="correo" type="text" id="correo" /></td>
    </tr>
    <tr>
      <td>Correo</td>
      <td><input name="telefono" type="text" id="telefono" /></td>
    </tr>

    <tr>
      <td>Tel&eacute;fono</td>
      <td><input name="contacto" type="text" id="contacto" /></td>
    </tr>
    <tr>
      <td>Contacto</td>
      <td><input name="contacto2" type="text" id="contacto2" /></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><label>
        <input name="Limpiar" type="reset" id="Limpiar" value="Limpiar" />
      </label>
        <input name="registrar" type="button" value="Registrar" /> </td>
    </tr>
  </table>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p><br>
  </p>
</form>

<form action="" method="post" name="buscarProveedor" id="buscarProveedor">
  <div align="left"><p>&nbsp;</p>
    <p>BUSCAR PROVEEDOR </p>
  </div>

  <table width="273" border="1" align="left">
  <tr>
    <td width="102">Codigo</td>
    <td width="155"><label>
      <input name="Co_Proveedor" type="text" id="Co_Proveedor" />
    </label></td>
  </tr>
</table>

<p>&nbsp;</p>
<table width="274" align="left">
  <tr>
    <td width="196">&nbsp;</td>
    <td width="66"><input name="Buscar" type="button" id="Buscar" value="Buscar" /></td>
  </tr>
</table>
<p>&nbsp;</p>
</form>


<form id="StatusProveedor" name="StatusProveedor" method="get" action="" >
  <div align="left"><p>&nbsp;</p>
    <p>STATUS PROVEEDOR </p>
  </div>

  <table border="1" align="left">
    <tr>
      <td width="164"><div align="left"> Estado de Proveedor </div></td>
      <td width="221"><label>
        <input name="estado" type="text" id="estado" value="" />
      </label></td>
    </tr>
  </table>

  <p>&nbsp;</p>
  <p>&nbsp;</p>
</form>


<p>&nbsp;</p>

    <form id="DatosProveedor" name="DatosProveedor" method="get" action="">
      <div align="left"><p>&nbsp;</p>
        <p>DATOS PROVEEDOR </p>
      </div>

    <table width="1093" border="1" align="left">
  <tr>
    <th width="47" scope="col">Codigo</th>
    <th width="212" scope="col">Razon Social </th>
    <th width="80" scope="col">RUC</th>
    <th width="233" scope="col">Direcci&oacute;n</th>
    <th width="201" scope="col">Correo</th>
    <th width="59" scope="col">Tel&eacute;fono</th>
    <th width="83" scope="col">Contacto</th>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <br>
</table>
<div align="center">
  <p><br>
  </p>
  <table width="1095" align="left">
    <tr>
      <td width="1015">&nbsp;</td>
      <td width="65"><input name="Modificar" type="submit" id="Modificar" value="Modificar" />      </td>
      <td width="65"><input name="Eliminar" type="submit" id="Eliminar" value="Eliminar" /></td>
      <td width="65"><input name="Aceptar4" type="submit" id="Aceptar4" value="Aceptar" /></td>
    </tr>
  </table>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p><br>
    <br>
  </p>
  </div>
</form>

    </body>
</html>


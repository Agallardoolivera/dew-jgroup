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
                <td width="0%" style=" text-align:left;"><!--<img src="../iconos/nombrepeq.gif" />
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
                            </table>-->
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
                <table width="719" border="0">
                  <tr>
                    <td width="154" height="21"><label></label></td>
                    <td width="367">&nbsp;</td>
                    <td width="184">&nbsp;</td>
                  </tr>
                  <tr>
                    <td><label>C&oacute;digo</label></td>
                    <td><form id="form1" name="form1" method="post" action="">
                        <label></label>
                        <input name="Tx_Codart" type="text" size="15" />
                    </form></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td><label>Descripci&oacute;n</label>
                      &nbsp;</td>
                    <td><input name="Tx_Desart" type="text" size="50" /></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td><label>Unidad de Medida </label></td>
                    <td><form id="form2" name="form2" method="post" action="">
                        <select name="Lst_ArtUm" size="1" id="Lst_ArtUm">
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
                    </form></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>Descripci&oacute;n Larga </td>
                    <td><form id="form3" name="form3" method="post" action="">
                        <textarea name="textarea" cols="50" rows="10"></textarea>
                    </form></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><form id="form4" name="form4" method="post" action="">
                        <table width="367" border="0">
                          <tr>
                            <td width="84">&nbsp;</td>
                            <td width="84"><input type="button" name="Cmd_Grabar" value="  Grabar  " /></td>
                            <td width="91">&nbsp;</td>
                            <td width="90">&nbsp;</td>
                          </tr>
                        </table>
                    </form></td>
                    <td>&nbsp;</td>
                  </tr>
                </table>
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

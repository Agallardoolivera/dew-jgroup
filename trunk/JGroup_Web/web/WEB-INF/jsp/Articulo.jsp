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
-->
</style>
</head>
<body>
<table border="0" cellpadding="0" cellspacing="0" width="773">
    <tr>
    
      <td style="vertical-align:top;"><hr />
        <table width="720" border="0">
          <tr>
            <td width="156" height="21"><label></label></td>
            <td width="361">&nbsp;</td>
            <td width="189">&nbsp;</td>
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
            </form>    </td>
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
            </form>    </td>
            <td>&nbsp;</td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <p>&nbsp;</p>        </td>
    </tr>
</table>
</body>
</html>

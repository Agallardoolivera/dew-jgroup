<link rel="StyleSheet" type="text/css" href="style/efc.css"/>
<link rel="stylesheet" type="text/css" href="style/Progress.css" >
<link rel="stylesheet" type="text/css" href="style/ext-all.css">
<link rel="stylesheet" type="text/css" href="style/cf.css">
<link type="image/x-icon" href="favicon.ico" rel="icon" />
<link type="image/x-icon" href="favicon.ico" rel="shortcut icon" />
<script language="JavaScript" src="js/jquery-1.2.3.js"></script>
<script language="JavaScript" src="js/jquery.maskedinput-1.1.2.pack.js"></script>
<script language="JavaScript" src="js/jquery.numeric.pack.js"></script>
<script language="JavaScript" src="js/jquery.floatnumber.js"></script>
<script language="JavaScript" src="js/swfobject.js"></script>
<script language="JavaScript" src="js/funcion_cont.js"></script>
<script type="text/javascript">
	ColdFusion.Ajax.importTag('CFWINDOW');
	var _cf_window_init_1214415540790=function()
	{	var _cf_window=ColdFusion.Window.create('cf_windowpass','','',{x:15,y:250, modal:false, closable:true, divid:'cf_windowpass', draggable:false, resizable:false, fixedcenter:false, width:350, height:170, shadow:true, callfromtag:true, minwidth:0, minheight:0, initshow:false});	};
	ColdFusion.Event.registerOnLoad(_cf_window_init_1214415540790);
</script>
<script>
$(document).ready(function(){
	$('#idorg').focus();
});
</script>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>
    
    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
          <tt>index.jsp</tt> <i>, or create your own welcome page then change
          the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
          welcome page and also update the welcome-file setting in</i>
          <tt>web.xml</tt>.</p>
        <div id="base">
	<div id="barleft">
		<table border="0" cellpadding="0" cellspacing="0" width="100%">
			<tr>
				<td id="logoefc">
                <script type="text/javascript">
					// <![CDATA[
					var so = new SWFObject("logoefc.swf", "EFC", "230", "150", "9", "");
					//so.addVariable("flashVarText", "this is passed in via FlashVars for example only"); // this line is optional, but this example uses the variable and displays this text inside the flash movie
					so.write("logoefc");
					// ]]>
				</script>
                </td>
                <td>
                <p>
				<span class="titlelogo">proveedores industriales</span>
				</p>
                </td>
			</tr>
            <tr>
            	<td colspan="2">&nbsp;</td>
            </tr>
            <tr>
            	<td colspan="2"><span class="textlogo">Soluciones Integrales de Abastecimiento</span></td>
            </tr>
            <tr>
            	<td colspan="2">&nbsp;</td>
            </tr>
			<tr>
				<td colspan="2" align="left" class="subtitleing" valign="middle">&nbsp;&nbsp;&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" valign="top" align="center">
                <fieldset style="background:#FFFFFF;">
                <input type="hidden" name="idempresa" id="idempresa" value="" />
                <input type="hidden" name="idarea" id="idarea" value="" />
                <input type="hidden" name="idusuario" id="idusuario" value="" />
                <table border="0" cellpadding="3" cellspacing="3" width="250px">
                	<tr>
						<td align="right">Empresa</td>
						<td><input type="text" name="idorg" id="idorg" style="width:100px;" class="cajatexto" onkeypress="press_acceso(event);" /></td>
					</tr>
					<tr>
						<td align="right">Usuario</td>
						<td><input type="text" name="usuarioing" id="usuarioing" style="width:100px;" class="cajatexto" onkeypress="press_acceso(event);"  /></td>
					</tr>
					<tr>
						<td align="right">Contrase&ntilde;a</td>
						<td><input type="password" name="passwording" id="passwording" style="width:100px;" class="cajatexto" onkeypress="press_acceso(event);"  /></td>
					</tr>
                     <tr>
					 <td colspan="2"><a href="contenido/index.php"><button name="ingresar" id="ingresar" class="btnsis" >Ingresar</button></a></td>
                       <!-- <td colspan="2"><button name="ingresar" id="ingresar" onClick="validaingresar();" class="btnsis" >Ingresar</button></td>-->
                    </tr>
				</table>
                </fieldset>
				</td>
			</tr>
		</table>
	</div>
	<div id="barright">
		<div id="barrighttop">
        	<div>
            <table border="0" cellpadding="2" cellspacing="2" width="100%">
                <tr>
                	<td width="2%"></td>
                    <td height="350px" align="right" style="padding-left:10px; padding-right:20px;">
                    <span style=" font-family:Arial, Helvetica, sans-serif; font-size:60px; color:#00CC00; text-align:right; width:100%;">Sistema de Pedidos</span><br />
                    <span style=" font-family:Arial, Helvetica, sans-serif; font-size:30px; color:#000000; text-align:right; width:100%;">On Line</span></td>
                    <td width="2%"></td>
                </tr>
                <tr>
                	<td width="2%"></td>
                    <td height="100px" align="right" class="footing">Av. Rep&uacute;blica de Panam&aacute; 5364<br />Surquillo - Lima 34 Per&uacute;<br />Central Telef&oacute;nica: (511) 213 6700<br />Email: marketing@efc.com.pe<br />Web: www.efc.com.pe</td>
                    <td width="2%"></td>
                </tr>
            </table>
            </div>
        </div>
	</div>
</div>

<!-- para cambiar a nueva contraseña -->
<div class="yuiextdlg" id="cf_windowpass" style="display:none;">
<div class="x-dlg-hd"  id="cf_windowpass_title"><img src="iconos/seguridad.gif" border="0" />&nbsp;&nbsp;Nueva Contase&ntilde;a</div>
<div class="x-dlg-bd"  id="cf_windowpass_body">
<table border="0" cellpadding="3" cellspacing="3" width="100%">
    <tr style="height:2px;">
        <td colspan="2" style="text-align:center; font-weight:bold;">Ingrese y confirme la nueva contrase&ntilde;a.</td>
    </tr>
    <tr style="height:2px;">
        <td colspan="2" style="text-align:center;"><hr /></td>
    </tr>
    <tr>
        <td style="text-align:right;">Contrase&ntilde;a</td>
        <td style="text-align:left;"><input type="password" id="clave" name="clave" onkeypress="press_cambiarpass(event,'grabarpassword.php');" class="cajatexto" /></td>
    </tr>
    <tr>
        <td style="text-align:right;">Confirmar</td>
        <td style="text-align:left;"><input type="password" id="confirmar" name="confirmar" onkeypress="press_cambiarpass(event,'grabarpassword.php');" class="cajatexto" /></td>
    </tr>
     <tr>
        <td colspan="2" style="text-align:center;"><button name="confirmar" id="confirmar"  onclick="grabarpassword('grabarpassword.php');" class="btnsis" >Aceptar</button></td>
    </tr>
</table>
</div>
</div>
<!--Mensaje de carga-->
<div id="pnlPopup" class="progress" style="position: absolute; left: 40%; bottom: 0; display: none;">
<div class="container">
    <div class="header">Imgresando, espere un momento por favor...</div>
    <div class="body">
        <img src="../images/activity.gif">
    </div>
</div>
</div>
<body>
    </body>
</html>

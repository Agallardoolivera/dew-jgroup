<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*" errorPage=""%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/efc.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/cf.css"/>


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

  <body>
       <form action="menu.htm" method="post">
<!--<script language="JavaScript" src="<%=request.getContextPath()%>/js/jquery-1.2.3.js"></script>
<script language="JavaScript" src="<%=request.getContextPath()%>/js/jquery.maskedinput-1.1.2.pack.js"></script>-->

<script>
    $(document).ready(function(){
        $('#idorg').focus();
    });
</script>
        <div id="base">
            <div id="barleft">
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td id="logoefc">
                            <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,19,0" width="230" height="150" title="jj">
    <param name="movie" value="<%=request.getContextPath()%>/images/logoefc.swf" />
    <param name="quality" value="high" />
    <embed src="<%=request.getContextPath()%>/images/logoefc.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="230" height="150"></embed>
  </object>
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
                                        <td><input type="text" name="idUsuario" id="idUsuario" style="width:100px;" class="cajatexto"/></td>
                                    </tr>
                                    <tr>
                                        <td align="right">Contrase&ntilde;a</td>
                                        <td><input type="password" name="clave" id="clave" style="width:100px;" class="cajatexto"/></td>
                                    </tr>
                                    <tr>
                                        <td colspan="2"><input type="submit" value="Iniciar sesión" class="btnsis"/></td>
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
                    <img src=".images/activity.gif">
                </div>
            </div>
        </div>
       </form>
    </body>
</html>

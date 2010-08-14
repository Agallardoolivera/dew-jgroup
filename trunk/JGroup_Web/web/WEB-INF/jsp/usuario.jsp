<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <head>
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
    </head>
    <body topmargin="0" leftmargin="0" rightmargin="0">



        <input type="hidden" name="idusuario" id="idusuario" value="" />
        <input type="hidden" name="idempresa" id="idempresa" value="" />
        <input type="hidden" name="idarea" id="idarea" value="" />
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

                        <td width="10%"><p align="center"><a href="retornaMenu.htm?metodo=Menu"><img src="<%=request.getContextPath()%>/images/Browser History.png" alt="" width="49" height="40" border="0" align="middle" title="Usuario"/></a></p>
                            <p align="center" class="Estilo31">Retornar al Men&uacute; </p></td>
                        <td width="0%" style=" text-align:left;">
                        </td>
                    </tr>
                </table>
            </div>
            <div style="background:#99CC33;">&nbsp;<?php //include("menu.php");?></div>
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:350px;">
                        <p>&nbsp;</p>





                        <div align="justify"></div>
                    </div>
                </div>
            </div>
            <table width="500" border="1" align="center">
                <tr><td width="127"><span class="Estilo1">Ingrese Nombres</span></td>
                    <td colspan="3"><input type="text" name="txt_nom" value=""/></td>
                <tr><td><span class="Estilo1">Ingrese Apellidos</span></td>
                    <td colspan="3"><input type="text" name="txt_ape" value="" /></td>
                <tr><td><span class="Estilo1">Ingrese DNI</span></td>
                    <td colspan="3"><input type="text" name="txt_dni" maxlength="8" value="" /></td>
                <tr><td><span class="Estilo1">Ingrese Usuario</span></td>
                    <td colspan="3"><input type="text" name="txt_usu" value="" maxlength="20" /></td>
                <tr><td><span class="Estilo1">Ingrese Contrasena</span></td>
                    <td colspan="3"><input type="password" name="txt_contra" size="15" value="" maxlength="20"/>
                        <span class="Estilo1">Confirma: </span>
                        <input type="password" name="password2" size="20" maxlength="15" value="" /></td>
                <tr><td><span class="Estilo1">Tipo Usuario</span></td>
                    <td width="114">Administrador:
                        <input name="rbttipusu" type="radio" value="1"/>
                    </td>
                    <td width="101">Avanzado:
                        <input name="rbttipusu" type="radio" value="2" />
                    </td>
                    <td width="104">Usuario:
                        <input name="rbttipusu" type="radio" value="3" checked="checked"/>
                    </td>
            </table>
            <table width="500" border="1" align="center">
                <tr><td width="260" align="center"><input type="submit" name="btn_grab" value="Registrar"/></td>
                    <td width="224" align="center"><input type="submit" name="btn_canc" value="Cancelar" /></td></tr>
            </table>
            <div id="foot">
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td id="tblfoot" align="left">&nbsp;</td>
                        <td id="tblfoot">Av. Rep&uacute;blica de Panam&aacute; 5364 Surquillo</td>
                    </tr>
                </table>
            </div>
        </div>
        <div id="pnlPopup" class="progress" style="position: absolute; left: 40%; bottom: 0; display: none;">
            <div class="container">
                <div class="header">Cargando, espere un momento por favor...</div>
                <div class="body">
                    <img src="../images/activity.gif">
                </div>
            </div>
        </div>

        <!-- ventanas de busqueda con CFWINDOW -->
        <!--<DIV class="yuiextdlg" id="cf_window1214415540789">
        <DIV class="x-dlg-hd"  id="cf_window1214415540789_title">Buscar Art&iacute;culos</DIV>
        <DIV class="x-dlg-bd"  id="cf_window1214415540789_body">-->

        <!-- para buscar articulos -->
        <div class="yuiextdlg" id="cf_windowbartped" style="display:none;">
            <div class="x-dlg-hd"  id="cf_windowbartped_title">Buscar Art&iacute;culos</div>
            <div class="x-dlg-bd"  id="cf_windowbartped_body">
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td align="left" style=" background-color:#FFFFFF;">
                            <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tr>
                                    <td style="text-align:right;">C&oacute;digo</td>
                                    <td><input type="text" name="codart" id="codart" style="width:100px;" class="cajatexto" onkeypress="press_buscararticulo(event,'pedido/resultbus.php','cuerpo');" /></td>
                                    <td style="text-align:right;">Art&iacute;culo</td>
                                    <td><input type="text" name="articulo" id="articulo" style="width:250px;" class="cajatexto" onkeypress="press_buscararticulo(event,'pedido/resultbus.php','cuerpo');" /></td>
                                    <td style="text-align:right;"><button name="buscarart" id="buscarart" class="btnproc" onclick="buscarart('pedido/resultbus.php','cuerpo');" style="width:120px;" >Buscar</button></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td style="padding-left:5px; padding-right:5px;">
                            <div class="contenedor">
                                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                    <thead>
                                        <tr>
                                            <th style="width:8%">Foto</th>
                                            <th style="width:15%">C&oacute;digo</th>
                                            <th style="width:65%">Descripci&oacute;n</th>
                                            <th style="width:10%">Uni.Med</th>
                                            <th style="width:2%">&nbsp;</th>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                            <div id="cuerpo" style="height:200px; background:#F5F5F5; overflow:scroll; text-align:center;">
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
        </div>

        <!-- para buscar centro de costo -->
        <div class="yuiextdlg" id="cf_windowbccostoped" style="display:none;">
            <div class="x-dlg-hd"  id="cf_windowbccostoped_title">Buscar Centro de Costo</div>
            <div class="x-dlg-bd"  id="cf_windowbccostoped_body">
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr style="height:2px;">
                        <td style="padding-left:5px; padding-right:5px; text-align:left;">Nombre&nbsp;<input type="text" id="nomarea" name="nomarea" class="cajatexto"  onkeypress="press_buscararea(event,'pedido/datosarea.php','cuerpoarea');" style=" width:300px;" />&nbsp;<button name="buscararea" id="buscararea" class="btnproc" onclick="buscararea('pedido/datosarea.php','cuerpoarea');" style="width:120px;" >Buscar</button></td>
                    </tr>
                    <tr>
                        <td style="padding-left:5px; padding-right:5px;">
                            <div class="contenedor">
                                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                    <thead>
                                        <tr>
                                            <th width="10%">C&oacute;digo</th>
                                            <th width="86%">Descripci&oacute;n</th>
                                            <th width="4%">&nbsp;</th>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                            <div id="cuerpoarea" style="height:200px; background:#F5F5F5; overflow:scroll;">
                                <table border="0" cellpadding="0" cellspacing="0" width="96%" id="tbldatos">

                                </table>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
        </div>

        <!-- para buscar lista -->
        <div class="yuiextdlg" id="cf_windowblistaped" style="display:none;">
            <div class="x-dlg-hd"  id="cf_windowblistaped_title">Mi Lista</div>
            <div class="x-dlg-bd"  id="cf_windowblistaped_body">
                <table border="0" cellpadding="0" cellspacing="0" width="102%">
                    <tr>
                        <td style="padding-left:5px; padding-right:5px;">
                            <div class="contenedor">
                                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                    <thead>
                                        <tr>
                                            <th width="5%">#</th>
                                            <th width="48%">C.Costo</th>
                                            <th width="30%">Nombre</th>
                                            <th width="15%">Fecha</th>
                                            <th width="2%">&nbsp;</th>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                            <div id="cuerpolista" style="height:200px; background:#F5F5F5; overflow:scroll;">
                                <table border="0" cellpadding="0" cellspacing="0" width="98%" id="tbldatos">

                                </table>
                            </div>
                        </td>
                    </tr>
                </table>

                <!-- para buscar lista de direccion -->
                <div class="yuiextdlg" id="cf_windowblistadir" style="display:none;">
                    <div class="x-dlg-hd"  id="cf_windowblistadir_title">Mi Lista</div>
                    <div class="x-dlg-bd"  id="cf_windowblistadir_body">
                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr>
                                <td style="padding-left:5px; padding-right:5px;">
                                    <div class="contenedor">
                                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                            <thead>
                                                <tr>
                                                    <th width="5%">#</th>
                                                    <th width="58%">Direcci&oacute;n</th>
                                                    <th width="35%">Distrito</th>
                                                    <th width="2%">&nbsp;</th>
                                                </tr>
                                            </thead>
                                        </table>
                                    </div>
                                    <div id="cuerpodir" style="height:200px; background:#F5F5F5; overflow:scroll;">
                                        <table border="0" cellpadding="0" cellspacing="0" width="98%">

                                        </table>
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
                <!-- para la ventana popup-->
                <script type="text/javascript">_cf_contextpath="";</script>
                <script type="text/javascript" src="../window/yahoo-dom-event.js"></script>
                <script type="text/javascript" src="../window/cfmessage.js"></script>
                <script type="text/javascript" src="../window/cfajax.js"></script>
                <script type="text/javascript" src="../window/animation-min.js"></script>
                <script type="text/javascript" src="../window/ext-yui-adapter.js" ></script>
                <script type="text/javascript" src="../window/ext-core.js"></script>
                <script type="text/javascript" src="../window/resizable.js"></script>
                <script type="text/javascript" src="../window/dragdrop.js"></script>
                <script type="text/javascript" src="../window/util.js"></script>
                <script type="text/javascript" src="../window/State-min.js"></script>
                <script type="text/javascript" src="../window/widget-core.js"></script>
                <script type="text/javascript" src="../window/dialogs.js"></script>
                <script type="text/javascript" src="../window/cfwindow.js"></script>
                <script type="text/javascript">
                    ColdFusion.Ajax.importTag('CFWINDOW');
                </script>
                <script type="text/javascript">
                    var _cf_window_init_1214415540790=function()
                    {	var _cf_window=ColdFusion.Window.create('cf_windowbartped','','',{ modal:false, closable:true, divid:'cf_windowbartped', draggable:true, resizable:false, fixedcenter:true, width:650, height:320, shadow:true, callfromtag:true, minwidth:0, minheight:0, initshow:false});
                        var _cf_window1=ColdFusion.Window.create('cf_windowbccostoped','','',{ modal:false, closable:true, divid:'cf_windowbccostoped', draggable:true, resizable:false, fixedcenter:true, width:550, height:320, shadow:true, callfromtag:true, minwidth:0, minheight:0, initshow:false});
                        var _cf_window3=ColdFusion.Window.create('cf_windowblistaped','','',{ modal:false, closable:true, divid:'cf_windowblistaped', draggable:true, resizable:false, fixedcenter:true, width:650, height:290, shadow:true, callfromtag:true, minwidth:0, minheight:0, initshow:false});
                        var _cf_window2=ColdFusion.Window.create('cf_windowblistadir','','',{ modal:false, closable:true, divid:'cf_windowblistadir', draggable:true, resizable:false, fixedcenter:true, width:650, height:290, shadow:true, callfromtag:true, minwidth:0, minheight:0, initshow:false});
                    };
                    ColdFusion.Event.registerOnLoad(_cf_window_init_1214415540790);
                </script>


                </body>
                </html>

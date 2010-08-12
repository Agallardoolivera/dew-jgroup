<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <%String Nu_Invitacion = request.getParameter("Nu_Invitacion"); %>
     <%String Des_Invitacion = request.getParameter("Des_Invitacion"); %>
    <head>



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
    </head>
    <body topmargin="0" leftmargin="0" rightmargin="0">



        <input type="hidden" name="idusuario" id="idusuario" value="" />
        <input type="hidden" name="idempresa" id="idempresa" value="" />
        <input type="hidden" name="idarea" id="idarea" value="" />
        <div id="basecont">
            <div id="header">
                <table border="0" cellpadding="2" cellspacing="2" width="80%">
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
            <div style="background:#99CC33;">&nbsp;<?php //include("menu.php");?></div>
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:350px;">
                      <table width="575" border="0">
                        <!--DWLayoutTable-->
                        <tr>
                          <td width="89" height="24" valign="top"><span class="Estilo11">N&uacute;mero</span></td>
                          <td width="148" valign="top"><input type="text" name="Tx_NumCot" /></td>
                          <td width="32"></td>
                          <td width="264" valign="top"><!-- #BeginDate format:fcSw1a -->Mi&eacute;rcoles, 11 Agosto, 2010 11:05 PM<!-- #EndDate --></td>
                        <td width="20"></td>
                        </tr>
                        <tr>
                          <td height="34" valign="top" class="Estilo11">Invitaci&oacute;n</td>
                          <td valign="top"><input type="text" name="Tx_NumInvitacion" value="<%out.println(Nu_Invitacion);%>" /></td>
                          <td colspan="2" valign="top"><input name="Tx_DesCortaInv" type="text" size="50" value="<%out.println(Des_Invitacion);%>" /></td>
                          <td></td>
                        </tr>
                      </table>
                      <table width="576" border="0">
                        <!--DWLayoutTable-->
                        <tr>
                          <td height="24" class="Estilo11">Proveedor</td>
                          <td width="123" valign="top"><input name="Tx_CoProveedor" type="text" size="20"/></td>
                          <td width="327" valign="top"><input name="Tx_NomProveedor" type="text" size="50"/></td>
                        <td width="3">&nbsp;</td>
                        </tr>
                        <tr>
                          <td width="94" height="56" class="Estilo11">Observaci&oacute;n</td>
                          <td colspan="2" bordercolor="0">
                              <form id="form1" name="form1" method="post" action="cotizaciones.htm">
                               <input type="hidden" name="metodo" value="insertar"/>
                              <textarea name="Tx_ObsCotizacion" cols="72.5" wrap="soft"></textarea>
                          </form></td>
                          <td>&nbsp;</td>
                        </tr>
                      </table>
                      <p>
                        <input name="Cmd_NuevoItem2" type="button" value="Grabar" size="" />
                      </p>
                      <table width="640" border="1">
                        <tr>
                          <th width="53" scope="col">Item</th>
                          <th width="79" scope="col">Codigo</th>
                          <th width="269" scope="col">Descripci&oacute;n del Articulo </th>
                          <th width="47" scope="col">UM</th>
                          <th width="68" scope="col">Cant</th>
                          <th width="84" scope="col">Precio</th>
                        </tr>
                        <tr>
                          <th scope="row">&nbsp;</th>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <th scope="row">&nbsp;</th>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <th scope="row">&nbsp;</th>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <th scope="row">&nbsp;</th>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                      </table>
                      <p>&nbsp;</p>
                      <table width="686" border="0">
                        <tr>
                          <td width="102"><form action="" method="post" name="form3" id="form3">
                              <input name="Cmd_NuevoItem" type="button" value=" Nuevo Item" size="" />
                          </form></td>
                          <td width="101"><input name="Cmd_Grabar" type="button" value="Grabar Item" size="" /></td>
                          <td width="116"><input name="Cmd_Modificar" type="button" value=" Modificar Item" size="" /></td>
                          <td width="82"><input name="Cmd_Eliminar" type="button" value=" Eliminar Item" size="" /></td>
                          <td width="83"><input name="Cmd_AgregarCriterio" type="button" value="Agregar Criterio" size="" /></td>
                        </tr>
                      </table>
                      <p>&nbsp;</p>
                      <div align="justify"></div>
                    </div>
              </div>
            </div>
            <div id="foot"></div>
    </div>
        <div id="pnlPopup" class="progress" style="position: absolute; left: 40%; bottom: 0; display: none;">
            <div class="container">
                <div class="header">Cargando, espere un momento por favor...</div>
                <div class="body">
                    <img src="../images/activity.gif">
                </div>
            </div>
        </div>

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
        <div class="yuiextdlg" id="cf_windowblistaped" style="display:none;"><div class="x-dlg-bd"  id="cf_windowblistaped_body">
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
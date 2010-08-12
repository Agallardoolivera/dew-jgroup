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

                        <td width="10%"><p align="center"><a href="index.htm"><img src="<%=request.getContextPath()%>/images/Browser History.png" width="49" height="40" border="0" align="middle"/></a></p>
                            <p align="center" class="Estilo3">Logearse de nuevo</p></td>
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
                        <table width="48%" border="2" align="center" bordercolor="#003300" class="subtitleing" >
                            <tr>
                                <td width="49%" rowspan="16" align="center" valign="middle"><p class="Estilo1"><em>MENU </em></p>
                                    <p class="Estilo1"><em>DE </em></p>
                                    <p class="Estilo1"><em>SISTEMA</em></p>
                                    <p class="Estilo2">Sistemas de Cotizaciones </p></td>

                                <td width="17%" rowspan="3"><img src="<%=request.getContextPath()%>/images/Menu.png" width="75" height="68" border="0" title="Mantenimientos"/></td>
                                <td width="26%"><div align="left">Articulos</div></td>
                                <td width="8%"><div align="center"><a href="articulo.htm"><img src="<%=request.getContextPath()%>/images/kate.gif" width="26" height="16" border="0" align="middle" title="Articulo"/></a></div></td>
                            </tr>
                            <tr>
                                <td><div align="left">Proveedor <br>
                                       <!-- Objeto Usuario -->

                                    </div></td>
                                <td><div align="center"><a href="proveedor.htm"><img src="<%=request.getContextPath()%>/images/women.gif" width="26" height="16" border="0" align="middle" title="Proveedor" /></a></div></td>
                            </tr>
                            <tr><td><div align="left">Usuario</div></td>
                                <td><div align="center"><a href="usuarios_mantener.htm"><img src="<%=request.getContextPath()%>/images/male.gif" width="26" height="16" border="0" align="middle" title="Usuario"/></a></div></td></tr>
                            <tr>
                                <td rowspan="3"><img src="<%=request.getContextPath()%>/images/Visualizacion.png" width="75" height="68" title="Visualizacion"/></td>
                                <td><div align="left">Auditoria</div></td>
                                <td><div align="center"><a href="auditoria.htm?metodo=Auditoria" style="visibility:<? echo $visible;?>"><img src="<%=request.getContextPath()%>/images/Avance.gif" width="26" height="16" border="0" align="middle" title="Auditoria" /></a></div></td>
                            </tr>

                            <tr>
                                <td><div align="left">Reporte Gerencia </div></td>
                                <td><div align="center"><a href="reporteg.htm?metodo=ReporteG" style="">
                                    <img src="<%=request.getContextPath()%>/images/Busqueda.gif" width="26" height="16" border="0" align="middle" title="Reporte" /></a>
                                </div></td>
                            </tr>
                            <tr>
                                <td><div align="left">Criterios</div></td>
                                <td><div align="center"><a href="criterios.htm?metodo=Criterios" style="visibility:<? echo $visible;?>"><img src="<%=request.getContextPath()%>/images/Avance.gif" width="26" height="16" border="0" align="middle" title="Auditoria" /></a></div></td>
                            </tr>

                            <tr>
                                <td rowspan="3"><img src="<%=request.getContextPath()%>/images/AreaRango.png" width="75" height="68" border="0" title="Delimitacion" /></td>

                                <%-- <c:set var="area" value="${user.area}"/>
                                <c:if test='${area=="Gerencia"}'>
                                --%>
                                <td><div align="left">Invitacion</div></td>
                                <td><div align="center"><a href="invitacion.htm"><img src="<%=request.getContextPath()%>/images/Vista.gif" width="26" height="16" border="0" align="middle" title="Invitacion" /></a></div></td>
                           <%--   </c:if>--%>
                                </tr>

                            <tr>
                              <td><div align="left">Analisis de Cotizacion </div></td>
                              <td><div align="center"><a href="analisis.htm?metodo=Analisis"" style="visibility:<? echo $visible;?>"><img src="<%=request.getContextPath()%>/images/Vista.gif" width="26" height="16" border="0" align="middle" title="Analisis" /></a></div></td>
                            </tr>
                            <tr>
                                <td><div align="left">Ofertas</div></td>
                                <td><div align="center"><a href="ofertas.htm?metodo=Ofertas" style="visibility:<? echo $visible;?>"><img src="<%=request.getContextPath()%>/images/Vista.gif" width="26" height="16" border="0" align="middle" title="Ofertas" /></a></div></td>
                            </tr>
                            <tr>
                                <td rowspan="3"><img src="<%=request.getContextPath()%>/images/Reportes.png" width="75" height="68" title="Reportes" /></td>
                                <td><div align="left">Orden de Compra </div></td>
                                <td><div align="center"><a href="ordenCompra.htm?metodo=OrdenCompra" style="visibility:<? echo $visible;?>"><img src="Images/Diferencias.gif" width="26" height="16" border="0" align="middle" title="Orden" /></a></div></td>
                            </tr>
                            <tr>
                                <td><div align="left">Reglas</div></td>
                                <td><div align="center"><a href="cotizaciones.htm?metodo=Cotizaciones" style="visibility:<? echo $visible;?>"><img src="<%=request.getContextPath()%>/images/Diferencias.gif" width="26" height="16" border="0" align="middle" title="cotizacion" /></a></div></td>
                            </tr>
                            <tr>                            </tr>
                            <tr> </tr>
                        </table>
                      <div align="justify"></div>
                    </div>
                </div>
            </div>
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
                    <img src="<%=request.getContextPath()%>/images/activity.gif">
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

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <jsp:useBean id="proveedor" scope="page" class="proyecto.modelo.Proveedor" />

    <head>

      

        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>::- Sistema de Pedidos On Line -::</title>
        <link type="image/x-icon" href="../favicon.ico" rel="icon" />
        <link type="image/x-icon" href="../favicon.ico" rel="shortcut icon" />
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/efc.css"/>
        <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/style/cf.css"/>
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
      


        <div id="basecont">
            <div id="header">
                <table border="0" cellpadding="2" cellspacing="2" width="100%">
                    <tr>
                        <td width="1%"></td>
                        <td width="12%" align="left" id="logoefc">
                            <script type="text/javascript">
                                // <![CDATA[
                                var so = new SWFObject("logoefc_chico.swf", "EFC", "180", "95", "9", "#999999");
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
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:450px;">
  
                        <form name="form1" method="post" action="proveedor.htm">
                        <input type="hidden" name="metodo" value="insertar"/>
                        <div align="center">
                          <p>INGRESO DE PROVEEDOR </p>
                        </div>
                        <table width="356" border="1" align="center">
                          <tr>
                            <td>Codigo</td>
                            <td><input name="codigo" type="text" id="codigo" /></td>
                          </tr>
                          <tr>
                            <td>Raz&oacute;n Social </td>
                            <td><input name="rznsoc" type="text" id="rznsoc" /></td>
                          </tr>
                          <tr>
                            <td>RUC</td>
                            <td><input name="ruc" type="text" id="ruc" /></td>
                          </tr>
                          
                          <tr>
                            <td>Correo</td>
                            <td><input name="correo" type="text" id="correo" /></td>
                          </tr>
                          <tr>
                            <td>Clave Acceso</td>
                            <td><input name="clave" type="text" id="clave" /></td>
                          </tr>                          
                              <td align="center"><input name="Limpiar" type="reset" id="Limpiar" value="Limpiar"/>                              </td>
                              <td align="center"><input name="Limpiar" type="submit" id="registrar" value="Registrar"/></td>
                        </table>
</form>
                        <%--
  <form name="form2" method="post" action="proveedor.htm">
            <input type="hidden" name="metodo" value="buscar"/>
                        <div align="center">
                          <p>DATOS PROVEEDOR </p>
                        </div>
                        <table width="389" height="50" border="1" align="center">
                          <tr>
                            <td>Razon Social</td>
                            <input name="razonsoc" type="text" id="razonsoc" />
                          </tr>
                                         <label>
                    <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
                </label>

                        </table>
                        <p>&nbsp;</p>
                        <table width="1093" border="1" align="center">
                          <tr>
                            <th width="47" scope="col">Codigo</th>
                            <th width="212" scope="col">Razon Social </th>
                            <th width="80" scope="col">RUC</th>
                            <th width="201" scope="col">Correo</th>
                            <th width="83" scope="col">Clave</th>
                          </tr>
                      <% if(request.getAttribute("proveedores")!=null) {
                %>
            <%    java.util.Collection <proyecto.modelo.Proveedor> proveedores= (java.util.Collection)request.getAttribute("proveedores");
                    for (proyecto.modelo.Proveedor prov : proveedores) {
            %>
            <tr>
                <td><% out.print(prov.getCo_Proveedor());%></td>
                <td><%  out.print(prov.getNo_RazonSocialProveedor());%></td>
                <td><%  out.print(prov.getNu_RucProveedor());%></td>
                <td><%  out.print(prov.getTx_CorreoProveedor());%></td>
                <td><%  out.print(prov.getTx_ClaveAccesoProveedor());%></td>

                <td><a href="proveedor.htm?metodo=obtener&codigo=<%=prov.getCo_Proveedor()%>&rznsoc=<%=prov.getNo_RazonSocialProveedor()%>&ruc=<%=prov.getNu_RucProveedor()%>&correo=<%=prov.getTx_CorreoProveedor()%>&clave=<%=prov.getTx_ClaveAccesoProveedor()%>">Editar</a> - <a href="proveedor.htm?metodo=eliminar&codigo=<%=prov.getCo_Proveedor()%>">Eliminar</a> </td>
            </tr>
            <% }%>
           <% }%>


                        </table>
                           <table width="245" align="center" border="1">
                            <tr>
                              
                              <td width="65"><input name="Modificar" type="submit" id="Modificar" value="Modificar" />
                              </td>
                              <td width="65"><input name="Eliminar" type="submit" id="Eliminar" value="Eliminar" /></td>
                              <td width="65"><input name="Aceptar4" type="submit" id="Aceptar4" value="Aceptar" /></td>
                            </tr>
                          </table>
                      </form>
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
                        --%>

  <form name="form2" method="post" action="proveedor.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            Articulo:
            <label>
                <input name="nombre" type="text" id="nombre">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
            </label>

<table width="100%" border="1">
            <tr>
                <th>Codigo</th>
                <th>RazonSocial</th>
                <th>RUC</th>
                <th>Correo</th>
                <th>Clave</th>

            </tr>
            <% if(request.getAttribute("proveedores")!=null) {
                %>
            <%    java.util.Collection <proyecto.modelo.Proveedor> proveedores= (java.util.Collection)request.getAttribute("proveedores");
                    for (proyecto.modelo.Proveedor prov: proveedores) {
            %>
            <tr>
                <td><% out.print(prov.getCo_Proveedor());%></td>
                <td><%  out.print(prov.getNo_RazonSocialProveedor());%></td>
                <td><%  out.print(prov.getNu_RucProveedor());%></td>
                <td><%  out.print(prov.getTx_CorreoProveedor());%></td>
                <td><%  out.print(prov.getTx_ClaveAccesoProveedor());%></td>

                <td><a href="proveedor.htm?metodo=eliminar&codigo=<%=prov.getCo_Proveedor()%>">Eliminar</a> </td>
            </tr>
            <% }%>
           <% }%>

</table>

  </form>



    </body>
</html>
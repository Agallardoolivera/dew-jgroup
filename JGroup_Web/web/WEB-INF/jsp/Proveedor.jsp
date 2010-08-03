<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <jsp:useBean id="proveedor" scope="page" class="proyecto.modelo.Proveedor" />
    <head>

      

        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>::- Sistema de Cotizaciones -::</title>
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
                      <form action="" method="post" name="buscarProveedor" id="buscarProveedor">
                        <div align="center">
                          <p>BUSCAR PROVEEDOR </p>
                        </div>
                        <table width="273" border="1" align="center">
                          <tr>
                            <td width="102">Codigo</td>
                            <td><input name="Co_Proveedor" type="text" id="Co_Proveedor" /></td>
                            <td width="66"><input name="Buscar" type="button" id="Buscar" value="Buscar" /></td>
                          </tr>
                        </table>
                      </form>
                      
                        <form id="registroProveedor" name="registroProveedor" method="post" action="">
                        <div align="center">
                          <p>INGRESO DE PROVEEDOR </p>
                        </div>
                        <table width="356" border="1" align="center">
                          <tr>
                            <td width="150">Raz&oacute;n Social </td>
                            <td width="190"><input name="razonsocial" type="text" id="razonsocial" /></td>
                          </tr>
                          <tr>
                            <td>RUC</td>
                            <td><input name="ruc" type="text" id="ruc" /></td>
                          </tr>
                          <tr>
                            <td>Direcci&oacute;n</td>
                            <td><input name="direccion" type="text" id="direccion" /></td>
                          </tr>
                          <tr>
                            <td>Correo</td>
                            <td><input name="correo" type="text" id="correo" /></td>
                          </tr>
                          <tr>
                            <td>Tel&eacute;fono</td>
                            <td><input name="telefono" type="text" id="telefono" /></td>
                          </tr>
                          <tr>
                            <td>Contacto</td>
                            <td><input name="contacto" type="text" id="contacto" /></td>
                          </tr>
                          <tr>
                              <td align="center"><input name="Limpiar" type="reset" id="Limpiar" value="Limpiar"/></td>
                              <td align="center">
                                <input name="registrar" type="button" value="Registrar"/>
                            </td>
                          </tr>
                        </table>
                      </form>
                       <form id="DatosProveedor" name="DatosProveedor" method="get" action="">
                        <div align="center">
                          <p>DATOS PROVEEDOR </p>
                        </div>
                        <table width="1093" border="1" align="center">
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
    
              
                </body>
                </html>
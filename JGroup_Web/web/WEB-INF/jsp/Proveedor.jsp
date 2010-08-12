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
        <script language="JavaScript" src="../js/graphs.js"></script>
        <script language="JavaScript" src="../js/swfobject.js"></script>
        <script language="JavaScript" src="../js/funcion_cont.js"></script>
    </head>
    <body topmargin="0" leftmargin="0" rightmargin="0">

        <div id="basecont">
            <div id="header">
                <table border="0" cellpadding="2" cellspacing="2" width="100%">
                    <tr>
                        <td width="3%"></td>
                        <td width="3%" align="left" id="logoefc">
                            <script type="text/javascript">

                                var so = new SWFObject("logoefc_chico.swf", "EFC", "180", "95", "9", "#999999");
                                so.write("logoefc");

                            </script>
                      </td>
                        <td width="82%" align="left">
                            <span class="titlelogo">proveedores <br />
                          &nbsp;industriales</span><br /><br />
                            <span class="textlogo" style="font-size:11px;">Soluciones integrales de Abastecimiento</span>
                      </td>
                        <td width="9%"><p align="center"><a href="retornaMenu.htm?metodo=Menu"><img src="<%=request.getContextPath()%>/images/Browser History.png" width="49" height="40" border="0" align="middle" title="Usuario"/></a></p>
                      <p align="center" class="Estilo3">Retornar al Men&uacute; </p></td>
                        <td width="3%" style=" text-align:left;"></td>
                    </tr>
                </table>
            </div>
            <div id="basemedio">
                <div id="contenido" align="center">
                    <div style="height:390px;">

                        <form name="form1" method="post" action="proveedor.htm">
                        <input type="hidden" name="metodo" value="insertar"/>
                        <div align="center">
                          <p>INGRESO DE PROVEEDOR </p>
                        </div>
                        <table width="356" border="1" align="center">
                          <tr>
                            <td width="148"><div align="left">Codigo</div></td>
                            <td width="150"><div align="left">
                              <input name="codigo" type="text" id="codigo" />
                            </div></td>
                          </tr>
                          <tr>
                            <td><div align="left">Raz&oacute;n Social </div></td>
                            <td><div align="left">
                              <input name="rznsoc" type="text" id="rznsoc" />
                            </div></td>
                          </tr>
                          <tr>
                            <td><div align="left">RUC</div></td>
                            <td><div align="left">
                              <input name="ruc" type="text" id="ruc" />
                            </div></td>
                          </tr>

                          <tr>
                            <td><div align="left">Correo</div></td>
                            <td><div align="left">
                              <input name="correo" type="text" id="correo" />
                            </div></td>
                          </tr>
                          <tr>
                            <td><div align="left">Clave Acceso</div></td>
                            <td><div align="left">
                              <input name="clave" type="text" id="clave" />
                            </div></td>
                          </tr>
                              <td align="center"><input name="Limpiar2" type="submit" id="registrar" value="Registrar"/></td>
                                <td align="center"><input name="Limpiar" type="reset" id="Limpiar" value="Limpiar"/></td>
                              </table>
</form>

  <form name="form2" method="post" action="proveedor.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            <label></label>
            <label></label>

            <table width="352" border="1" align="center">
              <tr>
                <th scope="col">Articulo:</th>
                <th scope="col"><input name="nombre" type="text" id="nombre" /></th>
                <th scope="col"><input name="btnenviar" type="submit" id="btnenviar" value="Buscar" /></th>
              </tr>
            </table>
    <table width="75%" border="1" align="center">
            <tr>
                <th width="10%">Codigo</th>
                <th width="25%">RazonSocial</th>
                <th width="12%">RUC</th>
                <th width="22%">Correo</th>
                <th width="17%">Clave</th>
                <th width="14%">Acciones</th>
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

                <td><a href="proveedor.htm?metodo=eliminar&codigo=<%=prov.getCo_Proveedor()%>">Dar de Baja</a> </td>
            </tr>
            <% }%>
           <% }%>

    </table>
    </form>
    </body>
</html>
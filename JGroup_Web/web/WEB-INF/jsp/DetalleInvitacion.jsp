<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Sistema de Cotizaciones On Line </title>
            <script src="SpryAssets/SpryValidationSelect.js" type="text/javascript"></script>
            <link href="SpryAssets/SpryValidationSelect.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <p><strong>Mantenimiento de Invitaciones</strong></p>
            <form name="form1" method="post" action="detalleinvitacion.htm">
            <table width="44%" border="0">
                <tr>
                    <td><div align="right"><span class="Estilo4">Numero de Invitacion</span></div></td>
                    <td><label>
                            <input name="Nu_Invitacion" type="text" id="Nu_Invitacion">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Item</span></div></td>
                    <td width="72%"><label>
                            <input name="Nu_Item" type="text" id="Nu_Item">
                        </label></td>
                </tr>
                <tr>
                    <td height="27"><div align="right"><span class="Estilo4"> Articulo</span></div></td>
                  <td><label><span id="spryselect1">
                  <select name="articulo" id="articulo">
                          <option>Seleccione Articulo</option>
           <% if (request.getAttribute("articulos") != null) {
            %>
            <%    java.util.Collection<proyecto.modelo.Articulo> articulos = (java.util.Collection) request.getAttribute("articulos");
                 for (proyecto.modelo.Articulo inv : articulos) {
            %>
            <option value=<% out.print(inv.getCo_Articulo());%>><% out.print(inv.getNo_Articulo());%></option>
            <% }%>
            <% }%>
                  </select>
                  </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Cantidad</span></div></td>
                    <td><label>
                            <input name="Tx_Cantidad" type="text" id="Tx_Cantidad">
                        </label></td>
                </tr>
                
                <tr>
                    <td><div align="right"><span class="Estilo4">Observacion</span></div></td>
                    <td><label>
                    <textarea name="Tx_Obs" id="Tx_Obs"  cols="72.5" wrap="soft"></textarea>
                  </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Guardar">
                        </label>
                        <label>
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='portada.htm'">
                        </label></td>
                </tr>
            </table>
    </form>

        <form name="form1" method="post" action="invitacion.htm">
            <input type="hidden" name="metodo" value="buscar"/>
            Buscar:
            <label>
                <input name="Descripcion" type="text" id="Descripcion">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
            </label>
            <label>
                <input name="btnnuevo" type="button" id="btnnuevo" value="Nuevo" onclick="window.location='invitacion.htm?metodo=nuevo'">
            </label>
            <label>
                <input name="btnnuevo" type="button" id="btnnuevo" value="Regresar" onclick="window.location='portada.htm'">
            </label>
    </form>
        <table width="100%" border="1">
            <tr>
                <th>Numero de Invitacion</th>
                <th>Fecha de Invitacion</th>
                <th>Generador de Usuario</th>
                <th>Descripci&oacute;n</th>
                <th>Usuario</th>
                <th>Numero de Orden</th>
                <th>Acciones</th>
            </tr>

            <% if (request.getAttribute("invitaciones") != null) {
            %>
            <%    java.util.Collection<proyecto.modelo.Invitacion> invitaciones = (java.util.Collection) request.getAttribute("invitaciones");
                 for (proyecto.modelo.Invitacion inv : invitaciones) {
            %>
            <tr>
                <th><% out.print(inv.getNu_Invitacion());%></th>
                <th><%  out.print(inv.getFe_Invitacion());%></th>
                <th><%  out.print(inv.getTx_GeneradorUsuario());%></th>
                <th><%  out.print(inv.getTx_Descripcion());%></th>
                <th><%  out.print(inv.getUsuario_Co_Usuario());%></th>
                <th><%  out.print(inv.getOrdenCompra_Nu_OrdenCompra());%></th>
                <th><a href="invitacion.htm?metodo=obtener&Nu_Invitacion=<%=inv.getNu_Invitacion()%>&Fe_Invitacion=<%=inv.getFe_Invitacion()%>&Gen_Usuario=<%=inv.getTx_GeneradorUsuario()%>&Descripcion=<%=inv.getTx_Descripcion()%>&Usuario=<%=inv.getUsuario_Co_Usuario()%>&Orden_Compra=<%=inv.getOrdenCompra_Nu_OrdenCompra()%>">Editar</a> -
                    <a href="invitacion.htm?metodo=eliminar&Nu_Invitacion=<%=inv.getNu_Invitacion()%>">Eliminar</a> - <a href="cotizaciones.htm?metodo=index&Nu_Invitacion=<%=inv.getNu_Invitacion()%>&Des_Invitacion=<%=inv.getTx_Descripcion()%>">Generar Cotizacion</a> </th>
            </tr>
            <% }%>
            <% }%>

             
        </table>

        <script type="text/javascript">
<!--
var spryselect1 = new Spry.Widget.ValidationSelect("spryselect1");
//-->
        </script>
</body>
</html>
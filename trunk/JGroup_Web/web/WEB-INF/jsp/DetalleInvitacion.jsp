<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Sistema de Cotizaciones On Line </title>
    </head>
    <body>
        <p><strong>Detalle de Invitacion</strong></p>
        <form name="form1" method="post" action="detalleinvitacion.htm?metodo=insertar2">
            <input type="hidden" name="metodo" value="insertar2"/>
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
<tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Cantidad</span></div></td>
                    <td><label>
                            <input name="Tx_Cantidad" type="text" id="Tx_Cantidad">
                    </label></td>
                        <td width="327" valign="top">&nbsp;</td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Observaci&oacute;n</span></div></td>
                    <td><label>
                            <textarea name="Tx_Obs" id="Tx_Obs"  cols="72.5" wrap="soft"></textarea>
                        </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Grabar"onclick="window.location='detalleinvitacion.htm?metodo=insertar2'">
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='invitacion.htm'">

                        </label>
                </table>
    </form>

    </body>
</html>
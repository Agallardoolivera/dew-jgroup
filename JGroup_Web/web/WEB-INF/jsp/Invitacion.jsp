<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
    </head>
    <body>
        <p><strong>Mantenimiento de Invitaciones</strong></p>
        <form name="form1" method="post" action="invitacion.htm">
            <input type="hidden" name="metodo" value="insertar"/>
            <table width="44%" border="0">
                <tr>
                    <td><div align="right"><span class="Estilo4">Numero de Invitacion</span></div></td>
                    <td><label>
                            <input name="Nu_Invitacion" type="text" id="Nu_Invitacion">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Fecha de Invitacion:</span></div></td>
                    <td width="72%"><label>
                            <input name="Fe_Invitacion" type="text" id="Fe_Invitacion">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Descripcion</span></div></td>
                    <td><label>
                            <input name="Tx_Descripcion" type="text" id="Tx_Descripcion">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Generador de Usuario</span></div></td>
                    <td><label>
                            <input name="Tx_GeneradorUsuario" type="text" id="Tx_GeneradorUsuario">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Codigo de Usuario</span></div></td>
                    <td><label>
                            <input name="Usuario_Co_Usuario" type="text" id="Usuario_Co_Usuario">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Orden de Compra</span></div></td>
                    <td><label>
                            <input name="OrdenCompra_Nu_OrdenCompra" type="text" id="OrdenCompra_Nu_OrdenCompra">
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
                <input name="Tx_Descripcion" type="text" id="Tx_Descripcion">
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
                <th>Id</th>
                <th>Numero de Invitacion</th>
                <th>Fecha de Invitacion</th>
                <th>Generador de Usuario</th>
                <th>Descripci&oacute;n</th>
                <th>Usuario</th>
                <th>Numero de Orden</th>
            </tr>
               <% if(request.getAttribute("invitaciones")!=null) {
                %>
            <%    java.util.Collection <proyecto.modelo.Invitacion> invitaciones= (java.util.Collection)request.getAttribute("invitaciones");
                    for (proyecto.modelo.Invitacion inv : invitaciones) {
            %>
            <tr>
                <td><% out.print(inv.getNu_Invitacion());%></td>
                <td><%  out.print(inv.getFe_Invitacion());%></td>
                <td><%  out.print(inv.getTx_GeneradorUsuario());%></td>
                <td><%  out.print(inv.getTx_Descripcion());%></td>
                <td><%  out.print(inv.getUsuario_Co_Usuario());%></td>
                <td><%  out.print(inv.getOrdenCompra_Nu_OrdenCompra());%></td>
                <td><a href="invitacion.htm?metodo=obtener&Nu_Invitacion=<%=inv.getNu_Invitacion()%>">Editar</a> - <a href="invitacion.htm?metodo=eliminar&Nu_Invitacion=<%=inv.getNu_Invitacion()%>">Eliminar</a> </td>
            </tr>
            <% }%>
           <% }%>
        </table>

    </body>
</html>
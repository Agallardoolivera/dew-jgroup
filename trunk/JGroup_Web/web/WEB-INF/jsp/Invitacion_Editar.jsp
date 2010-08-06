<%-- 
    Document   : Invitacion_Editar
    Created on : 03/08/2010, 07:12:46 PM
    Author     : Alfredo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <p><strong>Mantenimiento de Categor&iacute;as &gt; Editar</strong></p>

        <%  String Nu_Invitacion = request.getParameter("Nu_Invitacion");
            String Fe_Invitacion = request.getParameter("Fe_Invitacion");
            String Gen_Usuario = request.getParameter("Gen_Usuario");
            String Descripcion = request.getParameter("Descripcion");
            String Usuario = request.getParameter("Usuario");
            String Orden_Compra = request.getParameter("Orden_Compra");
        %>
            <form name="form1" method="post" action="invitacion.htm">
            <input type="hidden" name="metodo" value="actualizar"/>

            <table width="44%" border="0">

                <tr>
                    <td class="Estilo4"><div align="right">Numero de Invitacion:</div></td>
                    <td><label>
                            <input name="Nu_Invitacion" type="text" id="Nu_Invitacion" readonly="readonly" value="<%out.println(Nu_Invitacion);%>">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Fecha de Invitacion:</span></div></td>
                    <td width="72%"><label>
                            <input name="Fe_Invitacion" type="text" id="Fe_Invitacion" value="<%out.println(Fe_Invitacion);%>">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Descripci&oacute;n:</span></div></td>
                    <td><label>
                            <input name="Tx_Descripcion" id="Tx_Descripcion" value="<%out.println(Descripcion);%>">
                        </label></td>
                </tr>

                    <tr>
                    <td class="Estilo4"><div align="right">Generador Usuario:</div></td>
                    <td><label>
                            <input name="Tx_GeneradorUsuario" type="text" id="Tx_GeneradorUsuario"  value="<%out.println(Gen_Usuario);%>">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Codigo de Usuario:</span></div></td>
                    <td width="72%"><label>
                            <input name="Usuario_Co_Usuario" type="text" id="Usuario_Co_Usuario" value="<%out.println(Usuario);%>">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Numero de Orden:</span></div></td>
                     <td width="72%"><label>
                            <input name="OrdenCompra_Nu_OrdenCompra" type="text" id="OrdenCompra_Nu_OrdenCompra" value="<%out.println(Orden_Compra);%>">
                        </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Guardar">
                        </label>
                        <label>
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='invitacion.htm'">
                        </label></td>
                </tr>

            </table>
        </form>

    </body>
</html>

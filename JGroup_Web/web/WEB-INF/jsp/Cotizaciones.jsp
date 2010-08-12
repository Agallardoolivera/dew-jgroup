<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%String Nu_Invitacion = request.getParameter("Nu_Invitacion"); %>
<%String Des_Invitacion = request.getParameter("Des_Invitacion"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Sistema de Cotizaciones On Line </title>
    </head>
    <body>
        <p><strong>Mantenimiento de Cotizaciones</strong></p>
        <form name="form1" method="post" action="cotizaciones.htm">
            <input type="hidden" name="metodo" value="insertar"/>
            <table width="44%" border="0">
                <tr>
                    <td><div align="right"><span class="Estilo4">Numero de Cotizacion</span></div></td>
                    <td><label>
                            <input name="Tx_NumCot" type="text" id="Tx_NumCot">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Fecha de Entrega: (YYYY-MM-DD)</span></div></td>
                    <td width="72%"><label>
                            <input name="Tx_Feccot" type="text" id="Tx_Feccot">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Invitaci&oacute;n</span></div></td>
                    <td><label>
                            <input name="Tx_NumInvitacion" type="text" id="Tx_NumInvitacion" value="<%out.println(Nu_Invitacion);%>" >
                        </label></td>
                </tr>
                <tr>
                    <td><label>
                            <input name="Tx_DesCortaInv" type="text" id="Tx_DesCortaInv" size="50" value="<%out.println(Des_Invitacion);%>" />>
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Proveedor</span></div></td>
                    <td><label>
                            <input name="Tx_CoProveedor" type="text" id="Tx_CoProveedor">
                        </label></td>
                        <td width="327" valign="top"><input name="Tx_NomProveedor" id="Tx_NomProveedor"  type="text" size="50"/></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Observaci&oacute;n</span></div></td>
                    <td><label>
                            <textarea name="Tx_ObsCotizacion" id="Tx_ObsCotizacion"  cols="72.5" wrap="soft"></textarea>
                        </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Grabar"onclick="window.location='cotizaciones.htm?metodo=insertar'">
                        </label>
                  tr>
            </table>
        </form>

    </body>
</html>
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
            <c:forEach items="${invitaciones}" var="i">
                <tr>
                    <td>${i.Nu_Invitacion}</td>
                    <td>${i.Fe_Invitacion}</td>
                    <td>${i.Tx_GeneradorUsuario}</td>
                    <td>${i.Tx_Descripcion}</td>
                    <td>${i.Usuario_Co_Usuario}</td>
                    <td>${i.Orden_Nu_Orden}</td>
                    <td><a href="invitacion.htm?metodo=obtener&Nu_Invitacion=${i.Nu_Invitacion}">Editar</a> - <a href="invitacion.htm?metodo=eliminar&Nu_Invitacion=${i.Nu_Invitacion}">Eliminar</a> </td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
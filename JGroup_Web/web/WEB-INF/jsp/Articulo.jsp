<%-- 
    Document   : menu
    Created on : 17/06/2010, 02:32:03 AM
    Author     : Oscar
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><strong>Mantenimiento de Articulos</strong></p>
        <form name="form1" method="post" action="articulo.htm">
            <input type="hidden" name="metodo" value="insertar"/>
            <table width="44%" border="0">
                <tr>
                    <td><div align="right"><span class="Estilo4">Codigo</span></div></td>
                    <td><label>
                            <input name="codigo" id="codigo">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Nombre:</span></div></td>
                    <td width="72%"><label>
                            <input name="nombre" type="text" id="nombre">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Unidad de Medida</span></div></td>
                    <td><label>
                            <select name="UM" size="1" id="UM">
                                <option value="PZA">PZA</option>
                                <option value="KGR">KGR</option>
                                <option value="LTR">LTR</option>
                                <option value="MTR">MTR</option>
                                <option value="DOC">DOC</option>
                                <option value="JGO">JGO</option>
                                <option value="CJA">CJA</option>
                                <option value="MLL">MLL</option>
                                <option value="CTO">CTO</option>
                            </select>
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

  <form name="form1" method="post" action="articulo.htm">
    <input type="hidden" name="metodo" value="buscar"/>
  Buscar:
  <label>
  <input name="nombre" type="text" id="nombre">
  </label>
  <label>
  <input name="btnenviar" type="submit" id="btnenviar" value="Buscar">
  </label>
  <label>
  <input name="btnnuevo" type="button" id="btnnuevo" value="Regresar" onclick="window.location='portada.htm'">
  </label>

</form>
<table width="100%" border="1">
  <tr>
    <th>Codigo</th>
    <th>Nombre</th>
    <th>Unidad de Medida</th>
    <th>Acciones</th>
  </tr>
  <c:forEach items="${articulos}" var="c">
  <tr>
    <td>${c.Co_Articulo}</td>
    <td>${c.No_Articulo}</td>
    <td>${c.UM}</td>
    <td><a href="articulo.htm?metodo=obtener&Co_Articulo=${c.Co_Articulo}">Editar</a> - <a href="articulo.htm?metodo=eliminar&Co_Articulo=${c.Co_Articulo}">Eliminar</a> </td>
  </tr>
</c:forEach>
</table>
    </body>
</html>
<%--
    Document   : categorias_editar
    Created on : 06/07/2010, 12:32:10 PM
    Author     : rcondezo
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

<% String CoArticulo = request.getParameter("codigo");
   String NoArticulo = request.getParameter("nombre");
   String UM = request.getParameter("um");
%>
                <form name="form1" method="post" action="articulo.htm">
            <input type="hidden" name="metodo" value="actualizar"/>

            <table width="44%" border="0">

                <tr>
                    <td class="Estilo4"><div align="right">C&oacute;digo</div></td>
                    <td><label>
                            <input name="codigo" type="text" id="codigo" readonly="readonly" value="<%out.println(CoArticulo);%>">
                        </label></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Nombre:</span></div></td>
                    <td width="72%"><label>
                            <input name="nombre" type="text" id="nombre" value="<%out.println(NoArticulo);%>">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Unidad de Medida</span></div></td>
                    <td><label>
                            <select name="um" size="1" id="um">
                                <option value="<%out.println(UM);%>"><%out.println(UM);%></option>
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
                        </label></td></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Guardar">
                        </label>
                        <label>
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='articulo.htm'">
                        </label></td>
                </tr>
                
            </table>
        </form>

    </body>
</html>

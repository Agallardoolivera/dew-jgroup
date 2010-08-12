<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <p><strong>Mantenimiento de Criterios - Editar</strong></p>

<% String CoCriterioEvaluacion = request.getParameter("codigo");
   String TipoDato = request.getParameter("tipo");
   String Descripcion = request.getParameter("descripcion");
%>
                <form name="form1" method="post" action="criterio.htm">
            <input type="hidden" name="metodo" value="actualizar"/>

            <table width="44%" border="0">

                <tr>
                    <td class="Estilo4"><div align="right">C&oacute;digo</div></td>
                    <td><label>
                            <input name="codigo" type="text" id="codigo" readonly="readonly" value="<%out.println(CoCriterioEvaluacion);%>">
                        </label></td>
                </tr>
                <tr>
                    <td><div align="right"><span class="Estilo4">Tipo de Dato</span></div></td>
                    <td><label>
                      <select name="tipoDato" size="1" id="tipoDato">
                          <option value="<%out.println(TipoDato);%>"><%out.println(TipoDato);%></option>
                          <option value="Numerico">Numerico</option>
                          <option value="Fecha">Fecha</option>
                      </select>
                      </label></td></td>
                </tr>
                <tr>
                    <td width="28%"><div align="right"><span class="Estilo4">Descripcion:</span></div></td>
                    <td width="72%"><label>
                            <textarea name="descripcion" type="text" id="descripcion" value="<%out.println(Descripcion);%>"><%out.println(Descripcion);%></textarea>
                            </label></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td><label>
                            <input name="btnguardar" type="submit" id="btnguardar" value="Guardar">
                        </label>
                        <label>
                            <input name="btnretornar" type="button" id="btnretornar" value="Regresar" onClick="window.location='criterio.htm'">
                        </label></td>
                </tr>

            </table>
        </form>

    </body>
</html>

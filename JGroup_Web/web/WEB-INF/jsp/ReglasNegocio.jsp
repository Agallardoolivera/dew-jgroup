<%-- 
    Document   : ReglasNegocio
    Created on : 11/08/2010, 11:28:37 PM
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

          <form name="form1" method="post" action="reglas.htm">
              <input type="hidden" name="metodo" value="ListarPropuestas"/>
            Numero de Invitacion:
            <label>
                <input name="N_Invitacion" type="text" id="N_Invitacion">
            </label>
            <label>
                <input name="btnlistar" type="submit" id="btnlistar" value="Listar">
            </label>
        </form>

         <table width="100%" border="1">
            <tr>
                <th>Numero de Cotizacion</th>
                <th>Codigo del Proveedor</th>
                <th>Fecha de Entrega</th>
            </tr>

            <% if (request.getAttribute("cotizaciones") != null) {
            %>
            <%    java.util.Collection<proyecto.modelo.Cotizacion> cotizaciones = (java.util.Collection) request.getAttribute("cotizaciones");
                 for (proyecto.modelo.Cotizacion cot : cotizaciones) {
            %>
            <tr>
                <th><% out.print(cot.getNu_Cotizacion());%></th>
                <th><%  out.print(cot.getCo_Proveedor());%></th>
                <th><%  out.print(cot.getFe_Entrega());%></th>
            </tr>
            <% }%>
            <% }%>


        </table>



          <form name="form2" method="post" action="reglas.htm">
              <input type="hidden" name="metodo" value="AnalisisPropuestas"/>
            Elegir Ganador:
            <label>
                <input name="Nu_Invitacion" type="text" id="Nu_Invitacion">
            </label>
            <label>
                <input name="btnenviar" type="submit" id="btnenviar" value="Enviar">
            </label>
        </form>

         <table width="100%" border="1">
            <tr>
                <th>Proveedor Ganador</th>
            

            <% if (request.getAttribute("ProveedorGanador") != null) {
            %>
            <%    String proveedor = request.getAttribute("ProveedorGanador").toString();
            %>
           
                <th><% out.print(proveedor);%></th>
            
                </th>
            <% }%>

            </tr>
        </table>
    </body>
</html>

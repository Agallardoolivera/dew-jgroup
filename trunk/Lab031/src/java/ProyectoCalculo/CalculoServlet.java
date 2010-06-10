/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoCalculo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Formulas.Formulas;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author U201000432
 */
public class CalculoServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      String op1 = request.getParameter("operador1");
String op2 = request.getParameter("operador2");
String op3 = request.getParameter("operador3");
double d1 = Double.parseDouble(op1);
double d2 = Double.parseDouble(op2);
double d3 = Double.parseDouble(op3);
Formulas f1 = new Formulas(d1, d2,d3);
Collection<Formulas> c = new ArrayList<Formulas>();
c.add(f1);
request.setAttribute("formulas", c);
RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
rd.forward(request, response);

        //(-(d2)+ Math.sqrt((d2*d2-(4*(d1*d3)))))/2*d1;
//PrintWriter pw = response.getWriter();
//pw.println("<html><body>");
//pw.println("El resultado X1 es: " + resultado1);
//pw.println("El resultado X2 es: " + resultado2);
//pw.println("</body></html>");
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

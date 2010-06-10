/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author U820901
 */
public class Cuadratica extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String A = request.getParameter("A");
        String B = request.getParameter("B");
        String C = request.getParameter("C");
        Double  Resultado1=0.0,Resultado2=0.0,Nominador1=0.0,Nominador2=0.0;

        Nominador1=-Double.valueOf(B)+
                   (Math.sqrt(Math.pow(Double.valueOf(B), 2)-
                   (4*Double.valueOf(A)*Double.valueOf(C))));

        Nominador2= -Double.valueOf(B)+
                   (Math.sqrt(Math.pow(Double.valueOf(B), 2)+
                   (4*Double.valueOf(A)*Double.valueOf(C))));

        Resultado1= Nominador1/(2* Double.valueOf(A));
        Resultado2= Nominador2/(2* Double.valueOf(A));

        PrintWriter pw = response.getWriter();
        pw.println("<html><body>");
        pw.println("1: " + Resultado1);
        pw.println("2: " + Resultado2);

      
        pw.println("</body></html>");


        
        Collection<Resultado> c = new ArrayList<Resultado>();
        /* c.add(Resultado1);
         c.add(Resultado2);*/
         request.setAttribute("Resultado", c);
         RequestDispatcher rd = request.getRequestDispatcher("MostrarCuadratica.jsp");
         rd.forward(request, response);
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

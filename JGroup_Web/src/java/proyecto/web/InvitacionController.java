/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Invitacion;
import proyecto.service.InvitacionService;
import java.util.*;
import java.text.*;

/**
 *
 * @author Alfredo
 */
public class InvitacionController extends MultiActionController{

    private InvitacionService invitacionService;

    public InvitacionService getInvitacionService() {
        return invitacionService;
    }

    public void setInvitacionService(InvitacionService invitacionService) {
        this.invitacionService = invitacionService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Invitacion");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response)
            throws ParseException {
        DateFormat formatter;
        Date date;
        formatter = new SimpleDateFormat("yyyy-MM-dd");       
        Invitacion vo = new Invitacion();
        vo.setNu_Invitacion(Integer.parseInt(request.getParameter("Nu_Invitacion")));
        date = (Date) formatter.parse(request.getParameter("Fe_Invitacion"));
        vo.setFe_Invitacion(date);
        vo.setTx_Descripcion(request.getParameter("Tx_Descripcion"));
        vo.setTx_GeneradorUsuario(request.getParameter("Tx_GeneradorUsuario"));
        vo.setUsuario_Co_Usuario(Integer.parseInt(request.getParameter("Usuario_Co_Usuario")));
        //vo.setNu_OrdenCompra(1);
        vo.setOrdenCompra_Nu_OrdenCompra(Integer.parseInt(request.getParameter("OrdenCompra_Nu_Ordencompra")));
        try {
            invitacionService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("redirect:/invitacion.htm");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
       String descripcion = request.getParameter("Tx_Descripcion");
        try {
            Collection<Invitacion> invitaciones = invitacionService.buscarPorNombre(descripcion);
             for(Invitacion inv : invitaciones){
		System.out.println(inv.getNu_Invitacion());
                System.out.println(inv.getFe_Invitacion());
                System.out.println(inv.getTx_Descripcion());
                System.out.println(inv.getTx_GeneradorUsuario());
                System.out.println(inv.getUsuario_Co_Usuario());
                System.out.println(inv.getOrdenCompra_Nu_OrdenCompra());
              }
            request.setAttribute("Invitaciones", invitaciones);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("/Invitacion");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/Invitacion");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
       /* String nu_invitacion = request.getParameter("Nu_Invitacion");
        try {
            invitacionService.eliminar(Integer.parseInt(nu_invitacion));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }*/
        return new ModelAndView("redirect:/Invitacion.htm");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
       /* int id = Integer.parseInt(request.getParameter("Nu_Invitacion"));
        Invitacion vo;
        try {
            vo = invitacionService.obtener(id);
            request.setAttribute("Invitacion", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }*/
        return new ModelAndView("/Invitacion");
    }

    public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response) throws ParseException {
       /* DateFormat formatter;
        Date date;
        formatter = new SimpleDateFormat("yyyy-MM-dd");

        int Nu_Invitacion = Integer.parseInt(request.getParameter("Nu_Invitacion"));
        Invitacion vo = new Invitacion();

        vo.setNu_Invitacion(Nu_Invitacion);
        date = (Date) formatter.parse(request.getParameter("Fe_Invitacion"));
        vo.setFe_Invitacion(date);
        vo.setTx_GeneradorUsuario(request.getParameter("Tx_GeneradorUsuario"));
        vo.setTx_Descripcion(request.getParameter("Tx_descripcion"));
        vo.setNu_OrdenCompra(Integer.parseInt(request.getParameter("OrderCompra_Co_OrdenCompra")));
        vo.setCo_Usuario(Integer.parseInt(request.getParameter("Usuario_Co_Usuario")));
        try {
            invitacionService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }*/
        return new ModelAndView("redirect:/Invitacion.htm");
    }

}

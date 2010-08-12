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
import proyecto.modelo.Articulo;
import proyecto.service.ArticuloService;
//import proyecto.modelo.DetalleInvitacion;

import java.util.*;
import java.text.*;

/**
 *
 * @author Alfredo
 */
public class InvitacionDetalleController extends MultiActionController{

    private InvitacionService invitacionService;
    private ArticuloService articuloService;

    public InvitacionService getInvitacionService() {
        return invitacionService;
    }

    public ArticuloService getArticuloService() {
        return articuloService;
    }

    public void setInvitacionService(InvitacionService invitacionService) {
        this.invitacionService = invitacionService;
    }

    public void setArticuloService(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        try {
            Collection<Articulo> articulos = articuloService.listar();
             for(Articulo inv : articulos){
		System.out.println(inv.getCo_Articulo());
                System.out.println(inv.getNo_Articulo());
              }
            request.setAttribute("articulos", articulos);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }

        return new ModelAndView("DetalleInvitacion");

    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response)
            throws ParseException {


        Invitacion vo = new Invitacion();
        vo.setNu_Invitacion(Integer.parseInt(request.getParameter("Nu_Invitacion")));
        System.out.println("Fecha de Invitacion = "+request.getParameter("Fe_Invitacion") );
        
        vo.setFe_Invitacion(request.getParameter("Fe_Invitacion"));
        vo.setTx_Descripcion(request.getParameter("Tx_Descripcion"));
        vo.setTx_GeneradorUsuario(request.getParameter("Tx_GeneradorUsuario"));
        vo.setUsuario_Co_Usuario(Integer.parseInt(request.getParameter("Usuario_Co_Usuario")));
        vo.setOrdenCompra_Nu_OrdenCompra(Integer.parseInt(request.getParameter("OrdenCompra_Nu_OrdenCompra")));
        try {
            invitacionService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("redirect:/invitacion.htm");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
       String descripcion = request.getParameter("Descripcion");
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
            request.setAttribute("invitaciones", invitaciones);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("/Invitacion");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/Invitacion");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
       String Nu_Invitacion = request.getParameter("Nu_Invitacion");
        try {
            invitacionService.eliminar(Integer.parseInt(Nu_Invitacion));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Invitacion");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
       int id = Integer.parseInt(request.getParameter("Nu_Invitacion"));
        Invitacion vo;
        try {
            vo = invitacionService.obtener(id);
            request.setAttribute("Invitacion", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("/Invitacion_Editar");
    }



}

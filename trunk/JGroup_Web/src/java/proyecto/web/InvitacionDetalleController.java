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
import proyecto.modelo.DetalleInvitacion;
import proyecto.service.InvitacionDetalleService;
import java.util.*;
import java.text.*;

/**
 *
 * @author Alfredo
 */
public class InvitacionDetalleController extends MultiActionController{

    private InvitacionService invitacionService;
    private ArticuloService articuloService;
    private InvitacionDetalleService invitacionDetalleService;
    public InvitacionService getInvitacionService() {
        return invitacionService;
    }

    public ArticuloService getArticuloService() {
        return articuloService;
    }

    public InvitacionDetalleService getInvitacionDetalleService() {
        return invitacionDetalleService;
    }

    public void setInvitacionService(InvitacionService invitacionService) {
        this.invitacionService = invitacionService;
    }

    public void setArticuloService(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    public void setInvitacionDetalleService(InvitacionDetalleService invitacionDetalleService) {
        this.invitacionDetalleService = invitacionDetalleService;
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

    public ModelAndView insertar2(HttpServletRequest request, HttpServletResponse response)
            throws ParseException {


        DetalleInvitacion vo = new DetalleInvitacion();
        vo.setNu_invitacion(Integer.parseInt(request.getParameter("Nu_Invitacion")));
        vo.setNu_Item(Integer.parseInt(request.getParameter("Nu_Item")));
        vo.setCo_Articulo(Integer.parseInt(request.getParameter("articulo")));
        vo.setNu_cantidad(Integer.parseInt(request.getParameter("Tx_Cantidad")));
        vo.setTx_Observacion(request.getParameter("Tx_Obs"));
        //vo.setNu_invitacion(2);
   //     vo.setNu_Item(1);
      //  vo.setCo_Articulo(3);
    //    vo.setNu_cantidad(3);
  //      vo.setTx_Observacion("asasas");

        try {
            invitacionDetalleService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("redirect:/detalleinvitacion.htm");
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
        return new ModelAndView("/DetalleInvitacion");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
       String Nu_Invitacion = request.getParameter("Nu_Invitacion");
        try {
            invitacionDetalleService.eliminar(Integer.parseInt(Nu_Invitacion));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("DetalleInvitacion");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
       int id = Integer.parseInt(request.getParameter("Nu_Invitacion"));
        DetalleInvitacion vo;
        try {
            vo = invitacionDetalleService.obtener(id);
            request.setAttribute("detalleInvitacion", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("/DetalleInvitacion");
    }



}

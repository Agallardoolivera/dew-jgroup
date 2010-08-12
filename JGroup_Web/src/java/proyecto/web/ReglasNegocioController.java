/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.web;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.service.ReglasNegocioService;
import proyecto.modelo.Cotizacion;

/**
 *
 * @author Alfredo
 */
public class ReglasNegocioController extends MultiActionController{

    public ReglasNegocioController() {

    }
    
   private ReglasNegocioService reglasNegocioService;

    public ReglasNegocioService getNegocioService() {
        return reglasNegocioService;
    }

    public void setReglasNegocioService(ReglasNegocioService reglasNegocioService) {
        this.reglasNegocioService = reglasNegocioService;
    }

     public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("ReglasNegocio");
    }

    public ModelAndView AnalisisPropuestas(HttpServletRequest request, HttpServletResponse response) {
            String nu_invitacion = request.getParameter("Nu_Invitacion");
            try {
                Collection<Cotizacion> cotizaciones = reglasNegocioService.ListarCotizacions(Integer.parseInt(nu_invitacion));
                for (Cotizacion cot : cotizaciones) {
                    System.out.println(cot.getNu_Cotizacion());
                    System.out.println(cot.getCo_Proveedor());
                    System.out.println(cot.getNu_Invitacion());
                    System.out.println(cot.getTx_EstadoCot());
                    System.out.println(cot.getFe_Entrega());
                }
            } catch (DAOExcepcion ex) {
                System.err.println(ex.toString());
            }

            return new ModelAndView("Reglas");
        }
}

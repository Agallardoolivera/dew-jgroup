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
import proyecto.modelo.DetalleCotizacion;

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

            DetalleCotizacion dCotizacion;
            Collection<Cotizacion> cotizaciones;
            int indice=0,campo=0;
            Double monto=0.0;
            String nu_invitacion = request.getParameter("Nu_Invitacion");

            String [][] Proveedor = new String [1000][30];
            try {
                 cotizaciones = reglasNegocioService.ListarCotizacions(Integer.parseInt(nu_invitacion));

                for (Cotizacion cot : cotizaciones) {
                  
                        Proveedor[indice][campo] = Integer.toString(cot.getNu_Cotizacion());
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        Proveedor[indice][campo]=Integer.toString(cot.getCo_Proveedor());
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        Proveedor[indice][campo]=Integer.toString(cot.getNu_Invitacion());
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        Proveedor[indice][campo]=cot.getTx_EstadoCot();
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        Proveedor[indice][campo]=cot.getFe_Entrega();
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        dCotizacion = reglasNegocioService.Detalle_por_Cotizacion(cot.getNu_Cotizacion());
                        Proveedor[indice][campo]=Integer.toString(dCotizacion.getArticulo_Co_Articulo());
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        Proveedor[indice][campo]=Integer.toString(dCotizacion.getNu_Cantidad());
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        Proveedor[indice][campo]=Double.toString(dCotizacion.getSs_PrecioUnitario());
                        System.out.println(Proveedor[indice][campo]);
                        campo++;
                        monto= dCotizacion.getSs_PrecioUnitario() * dCotizacion.getNu_Cantidad();
                        Proveedor[indice][campo]=Double.toString(monto);
                        System.out.println(Proveedor[indice][campo]);
                        indice++;campo=0;
                        System.out.println("Fin ="+indice);
                    }
            } catch (DAOExcepcion ex) {
                System.err.println(ex.toString());
            }

            return new ModelAndView("Reglas");
        }
}

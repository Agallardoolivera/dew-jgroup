/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.service.ReglasNegocioService;
import proyecto.modelo.Cotizacion;
import proyecto.modelo.CriterioInvitacion;
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

    public ModelAndView AnalisisPropuestas(HttpServletRequest request, HttpServletResponse response) throws ParseException {

            int indice=0,campo=0,indiceMejorMonto=0,indiceMejorFecha=0,indiceCriterio=0;
            Double monto=0.0;
            int puntajeMejorMonto=0,puntajeMejorFecha=0;
            String ProveedorGanador=null;

            DetalleCotizacion dCotizacion;
            Collection<Cotizacion> cotizaciones;
          

            String nu_invitacion = request.getParameter("Nu_Invitacion");

            String  [][] Proveedor = new String [1000][30];
           

            try {
                 cotizaciones = reglasNegocioService.ListarCotizaciones(Integer.parseInt(nu_invitacion));

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
                    }

                    //Criterios
                    puntajeMejorMonto = reglasNegocioService.buscarPuntajePorNombre("Monto",Integer.parseInt(nu_invitacion));
                    puntajeMejorFecha = reglasNegocioService.buscarPuntajePorNombre("Fecha",Integer.parseInt(nu_invitacion));
                    System.out.println("Puntaje Monto ="+puntajeMejorMonto);
                    System.out.println("Puntaje Fecha =" +puntajeMejorFecha);

                    indiceMejorMonto=Calcular_MejorMonto(Proveedor,indice,puntajeMejorMonto);
                    indiceMejorFecha=Calcular_MejorFecha(Proveedor,indice,puntajeMejorFecha) ;

                    System.out.println("Mejor Monto ="+Proveedor[indiceMejorMonto][0]);
                    System.out.println("Mejor Fecha ="+Proveedor[indiceMejorFecha][0]);

                    ProveedorGanador=reglasNegocioService.ProveedorGanador(Integer.parseInt(nu_invitacion));

                    System.out.println("Proveedor Ganador =" +ProveedorGanador );

                    
            } catch (DAOExcepcion ex) {
                System.err.println(ex.toString());
            }
            
            return new ModelAndView("ReglasNegocio");
        }




        public int Calcular_MejorMonto(String [][] Proveedor,int indice,int puntaje) throws DAOExcepcion{
            int cod_ganador=0;
            Double monto_mayor=0.0;

            for (int i=0;i < indice;i++)  {
                System.out.println("Montos = "+Proveedor[i][8]);
                if (Double.parseDouble(Proveedor[i][8]) > monto_mayor){
                    monto_mayor=Double.parseDouble(Proveedor[i][8]);
                    cod_ganador=i;
                }
            }
            System.out.println("Codigo Ganador = "+cod_ganador + "- Monto Mayor= "+monto_mayor);
            reglasNegocioService.AsignarPuntaje(Integer.parseInt(Proveedor[cod_ganador][0]), puntaje);
            return cod_ganador;
        }

    public int Calcular_MejorFecha(String[][] Proveedor, int indice,int puntaje) throws ParseException, DAOExcepcion {
        int cod_ganador = 0;
        //Date fecha_menor=null;
        String DATE_FORMAT = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        Date fecha_menor=sdf.parse("2050-10-10");
        /*
        Date c1= sdf.parse("12/12/2001");
        Date c2= sdf.parse("13/01/2002");

        if (c1.before(c2)) {
        System.out.print(" es antes ");
        }
        if (c1.after(c2)) {
        System.out.print(" es despues ");
        }
        if (c1.equals(c2)) {
        System.out.print(" es el mismo ");
        }
        */
        for (int i = 0; i < indice; i++) {
            System.out.println("Fechas = " + Proveedor[i][4]);
            Date c=sdf.parse(Proveedor[i][4]);
            if (c.before(fecha_menor)){
                 fecha_menor =  c;
                 cod_ganador=i;
             }
        }
        System.out.println("Codigo Ganador = "+cod_ganador + "- Fecha Menor= "+Proveedor[cod_ganador][4]);
        reglasNegocioService.AsignarPuntaje(Integer.parseInt(Proveedor[cod_ganador][0]), puntaje);
         return cod_ganador;
    }


     public ModelAndView ListarPropuestas(HttpServletRequest request, HttpServletResponse response) {
       String nu_invitacion = request.getParameter("N_Invitacion");
       Collection<Cotizacion> cotizaciones;
        try {
             cotizaciones = reglasNegocioService.ListarCotizaciones(Integer.parseInt(nu_invitacion));
             for(Cotizacion cot : cotizaciones){
		System.out.println(cot.getFe_Entrega());
                System.out.println(cot.getCo_Proveedor());
                System.out.println(cot.getNu_Cotizacion());
              }
            request.setAttribute("cotizaciones", cotizaciones);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("/ReglasNegocio");
    }
}

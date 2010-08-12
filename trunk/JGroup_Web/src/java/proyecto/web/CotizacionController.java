package proyecto.web;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Cotizacion;
import proyecto.modelo.ConsultacotiCab1;
import proyecto.service.CotizacionService;

public class CotizacionController extends MultiActionController{

    private CotizacionService cotizacionService;

    public CotizacionService getCotizacionService() {
        return cotizacionService;
    }

    public void setCotizacionService(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Cotizaciones");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response)
            {
        Cotizacion vo = new Cotizacion();
        vo.setNu_Cotizacion(Integer.parseInt(request.getParameter("Tx_NumCot")));
        vo.setFe_Entrega(request.getParameter("Tx_Feccot"));
        vo.setNu_Invitacion(Integer.parseInt(request.getParameter("Tx_NumInvitacion")));
        vo.setCo_Proveedor(Integer.parseInt(request.getParameter("Tx_CoProveedor")));
        vo.setTX_Observacion(request.getParameter("Tx_ObsCotizacion"));

        try {
            cotizacionService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("/Cotizaciones");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
       int invitacion = Integer.parseInt(request.getParameter("Tx_NumInvitacion"));
       int codpro = Integer.parseInt(request.getParameter("Tx_CoProveedor"));
        try {
            Collection<ConsultacotiCab1> consultacotiCab1 = cotizacionService.buscarPorNombre(invitacion,codpro);
             for(ConsultacotiCab1 inv : consultacotiCab1){
		System.out.println(inv.getFe_Entrega());
                System.out.println(inv.getNo_RazonSocialProveedor());
                System.out.println(inv.getNu_Cotizacion());
                System.out.println(inv.getNu_Invitacion());
                System.out.println(inv.getTX_Observacion());
                System.out.println(inv.getTx_Descripcion());
              }
            request.setAttribute("consultacotiCab1", consultacotiCab1);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Cotizaciones");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Cotizaciones");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
       int Co_Cotizacion = Integer.parseInt(request.getParameter("codigo"));
        try {
            cotizacionService.eliminar(Co_Cotizacion);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Cotizaciones");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
       int invitacion = Integer.parseInt(request.getParameter("cotizacion"));
       int codpro= Integer.parseInt(request.getParameter("proveedor"));
        ConsultacotiCab1     vo;
        try {
            vo = cotizacionService.obtener(invitacion,codpro);
            request.setAttribute("proveedor", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("Cotizaciones");
    }

    public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response)  {

        int Cotizacion = Integer.parseInt(request.getParameter("Tx_NumInvitacion"));
        Cotizacion vo = new Cotizacion();

        vo.setNu_Cotizacion(Cotizacion);
        vo.setTX_Observacion(request.getParameter("Tx_ObsCotizacion"));
        try {
            cotizacionService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("redirect:/cotizaciones.htm");
    }

}

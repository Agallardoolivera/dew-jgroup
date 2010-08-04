package proyecto.web;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Proveedor;
import proyecto.service.ProveedorService;

public class ProveedorController extends MultiActionController {

    private ProveedorService proveedorService;

    public ProveedorService getProveedorService() {
        return proveedorService;
    }

    public void setProveedorService(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Proveedor");
    }
    /**
    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
        Proveedor vo = new Proveedor();
        vo.setCo_Proveedor(Integer.parseInt(request.getParameter("Co_Proveedor")));
        vo.setNu_RucProveedor(request.getParameter("Nu_RucProveedor"));
        vo.setNo_RazonSocialProveedor(request.getParameter("No_RazonSocialProveedor"));
        vo.setTx_CorreoProveedor(request.getParameter("Tx_CorreoProveedor"));
        vo.setTx_ClaveAccesoProveedor(request.getParameter("Tx_ClaveAccesoProveedor"));
        try {
            articuloService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("/Proveedor");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
        String nombres = request.getParameter("nombre");
        try {
            Collection<Proveedor> articulos = proveedorService.buscarPorNombre(nombres);
             for(Proveedor art : articulos){
		System.out.println(art.getCo_Articulo());
                System.out.println(art.getNo_Articulo());
                System.out.println(art.getUM());
              }
            request.setAttribute("articulos", articulos);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Proveedor");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Proveedor");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
        String codigo = request.getParameter("codigo");
        try {
            proveedorService.eliminar(Integer.parseInt(codigo));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Proveedor");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("codigo"));
        Articulo vo;
        try {
            vo = proveedorService.obtener(id);
            request.setAttribute("Articulo", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("Proveedor");
    }

    public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("Co_Articulo"));
        Proveedor vo = new Proveedor();
        vo.setCo_Articulo(id);
        vo.setNo_Articulo(request.getParameter("No_Articulo"));
        vo.setUM(request.getParameter("UM"));
        try {
            proveedorService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("redirect:/articulo.htm");
    }

 */

}

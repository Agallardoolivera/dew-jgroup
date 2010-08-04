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

public class ProveedorController extends MultiActionController{

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

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response)
            {
        Proveedor vo = new Proveedor();
        vo.setCo_Proveedor(Integer.parseInt(request.getParameter("codigo")));
        vo.setNu_RucProveedor(request.getParameter("ruc"));
        vo.setNo_RazonSocialProveedor(request.getParameter("rznsoc"));
        vo.setTx_CorreoProveedor(request.getParameter("correo"));
        vo.setTx_ClaveAccesoProveedor(request.getParameter("clave"));
        try {
            proveedorService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("/Proveedor");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
       String descripcion = request.getParameter("Tx_Descripcion");
        try {
            Collection<Proveedor> proveedores = proveedorService.buscarPorNombre(descripcion);
             for(Proveedor inv : proveedores){
		System.out.println(inv.getCo_Proveedor());
                System.out.println(inv.getNu_RucProveedor());
                System.out.println(inv.getNo_RazonSocialProveedor());
                System.out.println(inv.getTx_CorreoProveedor());
                System.out.println(inv.getTx_ClaveAccesoProveedor());
              }
            request.setAttribute("proveedores", proveedores);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Proveedor");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Proveedor");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
       String Co_Proveedor = request.getParameter("Co_Proveedor");
        try {
            proveedorService.eliminar(Integer.parseInt(Co_Proveedor));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Proveedor");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
       int id = Integer.parseInt(request.getParameter("Co_Proveedor"));
        Proveedor vo;
        try {
            vo = proveedorService.obtener(id);
            request.setAttribute("proveedor", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("Proveedor");
    }

    public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response)  {

        int Co_Proveedor = Integer.parseInt(request.getParameter("Co_Proveedor"));
        Proveedor vo = new Proveedor();

        vo.setCo_Proveedor(Co_Proveedor);
        vo.setNu_RucProveedor(request.getParameter("Nu_RucProveedor"));
        vo.setNo_RazonSocialProveedor(request.getParameter("No_RazonSocialProveedor"));
        vo.setTx_CorreoProveedor(request.getParameter("Tx_CorreoProveedor"));
        vo.setTx_ClaveAccesoProveedor(request.getParameter("Tx_ClaveAccesoProveedor"));
        try {
            proveedorService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("redirect:/proveedor.htm");
    }

}

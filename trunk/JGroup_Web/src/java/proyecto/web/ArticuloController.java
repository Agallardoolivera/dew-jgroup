package proyecto.web;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;
import proyecto.service.ArticuloService;

public class ArticuloController extends MultiActionController {

    private ArticuloService articuloService;

    public ArticuloService getArticuloService() {
        return articuloService;
    }

    public void setArticuloService(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/articulo");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
        String nombres = request.getParameter("nombre");
        try {
            Collection<Articulo> articulo = articuloService.buscarPorNombre(nombres);
            System.out.println(articulo);
            request.setAttribute("articulo", articulo);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("/articulo");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/admin/categorias_nuevo");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
        Articulo vo = new Articulo();
        vo.setNo_Articulo(request.getParameter("No_Articulo"));
        vo.setUM(request.getParameter("UM"));
        try {
            articuloService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("redirect:/articulo.htm");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
        String Co_Articulo = request.getParameter("Co_Articulo");
        try {
            articuloService.eliminar(Integer.parseInt(Co_Articulo));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("redirect:/articulo.htm");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("Co_Articulo"));
        Articulo vo;
        try {
            vo = articuloService.obtener(id);
            request.setAttribute("Articulo", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("/admin/categorias_editar");
    }

    public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("Co_Articulo"));
        Articulo vo = new Articulo();
        vo.setCo_Articulo(id);
        vo.setNo_Articulo(request.getParameter("nombre"));
        vo.setUM(request.getParameter("descripcion"));
        try {
            articuloService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("redirect:/articulo.htm");
    }
}

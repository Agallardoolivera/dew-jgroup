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
         return new ModelAndView("/admin/Articulo");
    }

   
}

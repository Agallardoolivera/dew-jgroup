package proyecto.web;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.excepcion.LoginExcepcion;
import proyecto.modelo.Usuario;
import proyecto.service.UsuarioService;

public class LoginController extends SimpleFormController {

    private UsuarioService usuarioService;

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = null;

        int u = Integer.parseInt(request.getParameter("Co_Usuario"));
        String p = request.getParameter("clave");
        System.out.println(u);
        System.out.println(p);
        try {
            Usuario vo = usuarioService.validar(u, p);
            HttpSession session = request.getSession();
            session.setAttribute("USUARIO_ACTUAL", vo);
            mv = new ModelAndView("redirect:/portada.htm");
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
            mv = new ModelAndView("error");
        } catch (LoginExcepcion ex) {
            System.out.println(ex.toString());
            mv = new ModelAndView("error");
        }
        return mv;
    }
}

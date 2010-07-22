/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;
import proyecto.modelo.Usuario;
import proyecto.service.UsuarioService;

/**
 *
 * @author rcondezo
 */
public class UsuariosController extends MultiActionController {

    public UsuariosController() {
    
    }
//   
    private UsuarioService usuarioService;

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println(usuarioDAO.listar().size());
//        request.setAttribute("usuarios", usuarioDAO.listar());
        return new ModelAndView("/admin/usuarios_mantener");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/admin/usuarios_insertar");
    }

    public ModelAndView doInsertar(HttpServletRequest request, HttpServletResponse response) {
        Usuario vo = new Usuario();
        //vo.setCo_Usuario(request.getParameter("co_Usuario"));
        vo.setClave(request.getParameter("clave"));
        vo.setNombres(request.getParameter("nombres"));
//        usuarioDAO.insertar(vo);
        return new ModelAndView(new RedirectView("usuarios_mantener.htm", true));
    }

    public ModelAndView doInsertar2(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doInsertar2...");
        Usuario vo = new Usuario();
        //vo.setCo_Usuario(request.getParameter("co_Usuario"));
        vo.setClave(request.getParameter("clave"));
        vo.setNombres(request.getParameter("nombres"));
//        usuarioDAO.insertar(vo);
        try {
            PrintWriter out = response.getWriter();
            out.println("Se insert&oacute; correctamente");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
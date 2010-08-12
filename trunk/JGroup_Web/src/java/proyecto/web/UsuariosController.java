/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.web;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import proyecto.excepcion.DAOExcepcion;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        vo.setCo_Usuario(Integer.parseInt(request.getParameter("usuario")));
        vo.setClave(request.getParameter("contra"));
        try {
            usuarioService.insertar(vo);
            
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        
        return new ModelAndView(new RedirectView("usuarios_mantener.htm", true));
    }

    public ModelAndView doInsertar2(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doInsertar2...");
        Usuario vo = new Usuario();
        //vo.setCo_Usuario(request.getParameter("co_Usuario"));
        vo.setClave(request.getParameter("clave"));
       
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

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
        String nombres = request.getParameter("nombre");
        try {
            Collection<Usuario> Usuarios = usuarioService.buscarPorNombre(nombres);
             for(Usuario art : Usuarios){
		System.out.println(art.getCo_Usuario());
                System.out.println(art.getClave());
              }
                request.setAttribute("usuarios", Usuarios);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("admin/usuarios_mantener");
    }

     public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("codigo"));
        Usuario vo;
        try {
            vo = usuarioService.obtener(id);
            
            request.setAttribute("Usuario", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("admin/usuarios_editar");
    }

public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("usuario"));
        Usuario vo = new Usuario();
        vo.setCo_Usuario(id);
        vo.setClave(request.getParameter("contra"));
        try {
            usuarioService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("redirect:/usuarios_mantener.htm");
    }

 public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        try {
            usuarioService.eliminar(codigo);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("admin/usuarios_mantener");
    }

    }
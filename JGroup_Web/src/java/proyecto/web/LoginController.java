/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.web;

import java.util.Collection;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import proyecto.dao.UsuarioDAO;
import proyecto.modelo.Usuario;

/** 
 *
 * @author pcsidrod
 */
public class LoginController extends SimpleFormController {

    public LoginController() {
        //Initialize controller properties here or 
        //in the Web Application Context
        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }

    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
    HttpServletRequest request,
    HttpServletResponse response,
    Object command,
    BindException errors) throws Exception {
    ModelAndView mv = new ModelAndView(getSuccessView());
    //Do something...
    return mv;
    }
     */
    public ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) {

        UsuarioDAO uDao;
        Collection<Usuario> usuarios_lista;

        uDao=new UsuarioDAO();

        String u = request.getParameter("idUsuario");
        String p = request.getParameter("clave");

        usuarios_lista =  uDao.listar();
       
        for(Usuario user:usuarios_lista  ){
            System.out.println("ID = "+ user.getIdUsuario());
            System.out.println("Nombres = "+ user.getNombres());
            System.out.println("Clave = "+ user.getClave());
            System.out.println("Area = "+ user.getArea());

            if (user.getIdUsuario().equals(u) && user.getClave().equals(p)) {
                return new ModelAndView("menu");
            }
        }
        return new ModelAndView("error");
    }
    /*
      public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String accion = req.getParameter("accion");
        System.out.println("accion: " + accion);
        ModelAndView miModelAndView = new ModelAndView();
        if (accion.equals("elegirProceso")) {
            miModelAndView = elegirProceso(req, resp);
        } else if (accion.equals("loginVotacion")) {
            miModelAndView = loginVotacion(req, resp);
        } else if (accion.equals("logueoVotacion")) {
            miModelAndView = logueoVotacion(req, resp);
        } else if (accion.equals("cedulaVotacion")) {
            miModelAndView = cedulaVotacion(req, resp);
        } else if (accion.equals("votar")) {
            miModelAndView = votar(req, resp);
        } else if (accion.equals("confirmar")) {
            miModelAndView = confirmar(req, resp);
        }
        return miModelAndView;
    }*/
}

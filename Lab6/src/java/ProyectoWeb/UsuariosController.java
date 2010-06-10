package ProyectoWeb;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Proyecto.modelo.Usuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;
/** 
 *
 * @author u814305
 */
public class UsuariosController extends MultiActionController {

    public UsuariosController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }
    
   // @Override
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
public ModelAndView index(HttpServletRequest request, HttpServletResponse
response) {
return new ModelAndView("/admin/usuarios_mantener");
}

public ModelAndView insertar(HttpServletRequest request, HttpServletResponse
response) {
return new ModelAndView("/admin/usuarios_insertar");
}

public ModelAndView doInsertar(HttpServletRequest request, HttpServletResponse
response) {
Usuario vo = new Usuario();
vo.setIdUsuario(request.getParameter("idUsuario"));
vo.setClave(request.getParameter("clave"));
vo.setNombres(request.getParameter("nombres"));
return new ModelAndView(new RedirectView("usuarios_mantener.htm", true));
}
}
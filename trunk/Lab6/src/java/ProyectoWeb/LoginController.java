/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoWeb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/** 
 *
 * @author u814305
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
    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) {
        ModelAndView mv = null;
        String u = request.getParameter("idUsuario");
        String p = request.getParameter("clave");
        System.out.println(u);
        System.out.println(p);
        if ("david".equals(u) && "java".equals(p)) {
            mv = new ModelAndView("portada");
        } else {
            mv = new ModelAndView("error");
        }
        return mv;
    }
}

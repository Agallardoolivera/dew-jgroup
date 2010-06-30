package proyecto.web;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;
import proyecto.dao.UsuarioDAO;
import proyecto.modelo.Usuario;

/** 
 *
 * @author pcsidrod
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

    //  @Override
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
    private UsuarioDAO usuarioDAO;

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("Usuarios", usuarioDAO.listar());
        return new ModelAndView("/admin/usuarios_mantener");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/admin/usuarios_mantener");
    }

    public ModelAndView doInsertar(HttpServletRequest request, HttpServletResponse response) {
        Usuario vo = new Usuario();
        vo.setTxt_nom(request.getParameter("txt_nom"));
        vo.setTxt_ape(request.getParameter("txt_ape"));
        vo.setTxt_dni(request.getParameter("txt_dni"));
        vo.setTxt_ape(request.getParameter("txt_usu"));
        vo.setTxt_dni(request.getParameter("txt_contra"));

        usuarioDAO.insertar(vo);

        return new ModelAndView(new RedirectView("usuarios_mantener.htm", true));
    }

    public ModelAndView doInsertar2(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doInsertar2...");
        Usuario vo = new Usuario();
        vo.setTxt_nom(request.getParameter("txt_nom"));
        vo.setTxt_ape(request.getParameter("txt_ape"));
        vo.setTxt_dni(request.getParameter("txt_dni"));
        vo.setTxt_ape(request.getParameter("txt_usu"));
        vo.setTxt_dni(request.getParameter("txt_contra"));
        usuarioDAO.insertar(vo);
        try {
            PrintWriter out = response.getWriter();
            out.println(request.getParameter("txt_nom"));
            out.println(request.getParameter("txt_ape"));
            out.println(request.getParameter("txt_dni"));
            out.println(request.getParameter("txt_usu"));
            out.println(request.getParameter("txt_contra"));
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return null;
    }
}

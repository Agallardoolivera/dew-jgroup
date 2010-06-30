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
/** 
 *
 * @author pcsidrod
 */

public class AccesosMenuP extends MultiActionController {

    public AccesosMenuP() {
        //Initialize controller properties here or 
        //in the Web Application Context
        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");

    }

  public ModelAndView Articulo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Articulo");
    }
    public ModelAndView Proveedor(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Proveedor");
    }
    public ModelAndView ListadoOfertas(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("ListadoOfertas");
    }
    public ModelAndView ReporteGerencial(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("ReporteGerencial");
    }
    public ModelAndView Invitacion(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Invitacion");
    }
 public ModelAndView Cotizaciones(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Cotizaciones");
    }
 public ModelAndView Analisis(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Analisis Cotizaciones");
    }
public ModelAndView Menu(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("menu");
    }
public ModelAndView Ofertas(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("ListadoOfertas");
    }
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }
 public ModelAndView ConsultaCotizacion(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Cotizaciones_consulta");
    }
  public ModelAndView ConsultaCotizacion2(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Cotizaciones_consulta2");
    }
 public ModelAndView ListaOferta(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("ListadoTodasOfertas");
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


 public ModelAndView Usuarios_mantener(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Usuarios_mantener");
    }

}

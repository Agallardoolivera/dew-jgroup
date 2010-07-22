package proyecto.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class PortadaController extends SimpleFormController {

    @Override
    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
       return new ModelAndView("portada");
    }

}


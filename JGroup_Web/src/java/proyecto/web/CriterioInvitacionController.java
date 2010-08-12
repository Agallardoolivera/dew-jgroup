/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.web;

import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.CriterioInvitacion;
import proyecto.service.CriterioInvitacionService;

/**
 *
 * @author Alfredo
 */
public class CriterioInvitacionController extends MultiActionController {

        private CriterioInvitacionService criterioInvitacionService;

    public CriterioInvitacionService getCriterioInvitacionService() {
        return criterioInvitacionService;
    }

    public void setCriterioInvitacionService(CriterioInvitacionService criterioEvaluacionService) {
        this.criterioInvitacionService = criterioInvitacionService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Criterio");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
        CriterioInvitacion vo = new CriterioInvitacion();
        vo.setCriterioevaluacion_Co_Criterio(Integer.parseInt(request.getParameter("txtCodigo")));
        vo.setInvitacion_Nu_Invitacion(Integer.parseInt(request.getParameter("tipoDato")));
        vo.setNu_puntaje(Integer.parseInt(request.getParameter("txtDescripcion")));
        try {
            criterioInvitacionService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("/Criterio");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Criterio");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
        int codigo = Integer.parseInt(request.getParameter("txtCodigo"));
        try {
            criterioInvitacionService.eliminar(codigo);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Criterio");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("txtCodigo"));
        CriterioInvitacion vo;
        try {
            vo = criterioInvitacionService.obtener(id);
            request.setAttribute("Criterio", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("Criterio_Editar");
    }

}
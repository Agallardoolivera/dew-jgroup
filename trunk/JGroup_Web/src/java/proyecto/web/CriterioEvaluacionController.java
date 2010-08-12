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
import proyecto.modelo.CriterioEvaluacion;
import proyecto.service.CriterioEvaluacionService;

/**
 *
 * @author Alfredo
 */
public class CriterioEvaluacionController extends MultiActionController {

        private CriterioEvaluacionService criterioEvaluacionService;

    public CriterioEvaluacionService getCriterioEvaluacionService() {
        return criterioEvaluacionService;
    }

    public void setCriterioEvaluacionService(CriterioEvaluacionService criterioEvaluacionService) {
        this.criterioEvaluacionService = criterioEvaluacionService;
    }

    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Criterio");
    }

    public ModelAndView buscar(HttpServletRequest request, HttpServletResponse response) {
        String tipo = request.getParameter("tipo");
        try {
            Collection<CriterioEvaluacion> tipos = criterioEvaluacionService.buscarPorNombre (tipo);
             for(CriterioEvaluacion tip : tipos){
		System.out.println(tip.getCo_Criterio());
                System.out.println(tip.getTipo_Dato());
                System.out.println(tip.getTx_DescCriterioEvaluacion());
              }
            request.setAttribute("criterios", tipos);
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Criterio");
    }

    public ModelAndView insertar(HttpServletRequest request, HttpServletResponse response) {
        CriterioEvaluacion vo = new CriterioEvaluacion();
        vo.setCo_Criterio(Integer.parseInt(request.getParameter("txtCodigo")));
        vo.setTipo_Dato(request.getParameter("tipoDato"));
        vo.setTx_DescCriterioEvaluacion(request.getParameter("txtDescripcion"));
        try {
            criterioEvaluacionService.insertar(vo);
        } catch (DAOExcepcion e) {
            System.err.println(e.toString());
        }
        return new ModelAndView("/Criterio");
    }

    public ModelAndView nuevo(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("Criterio");
    }

    public ModelAndView eliminar(HttpServletRequest request, HttpServletResponse response) {
        String codigo = request.getParameter("txtCodigo");
        try {
            criterioEvaluacionService.eliminar(Integer.parseInt(codigo));
        } catch (DAOExcepcion ex) {
            System.err.println(ex.toString());
        }
        return new ModelAndView("Criterio");
    }

    public ModelAndView obtener(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("txtCodigo"));
        CriterioEvaluacion vo;
        try {
            vo = criterioEvaluacionService.obtener(id);
            request.setAttribute("Criterio", vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("Criterio_Editar");
    }

    public ModelAndView actualizar(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("txtCodigo"));
        CriterioEvaluacion vo = new CriterioEvaluacion();
        vo.setCo_Criterio(id);
        vo.setTipo_Dato(request.getParameter("tipoDato"));
        vo.setTx_DescCriterioEvaluacion(request.getParameter("txtDescripcion"));
        try {
            criterioEvaluacionService.actualizar(vo);
        } catch (DAOExcepcion e) {
            System.err.println("Error");
        }
        return new ModelAndView("redirect:/criterio.htm");
    }

}
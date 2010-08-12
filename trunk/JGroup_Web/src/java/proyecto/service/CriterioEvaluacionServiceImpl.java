/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;

import java.util.Collection;
import proyecto.dao.CriterioEvaluacionDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.CriterioEvaluacion;

/**
 *
 * @author Alfredo
 *
 */
    public class CriterioEvaluacionServiceImpl implements CriterioEvaluacionService{

     private CriterioEvaluacionDAO criterioEvaluacionDAO;

    public CriterioEvaluacionDAO getCriterioEvaluacionDAO() {
        return criterioEvaluacionDAO;
    }

    public void setCriterioEvaluacionDAO(CriterioEvaluacionDAO criterioEvaluacionDAO) {
        this.criterioEvaluacionDAO = criterioEvaluacionDAO;
    }
   
        public CriterioEvaluacion insertar(CriterioEvaluacion vo) throws DAOExcepcion {
        return criterioEvaluacionDAO.insertar(vo);
    }

    public Collection<CriterioEvaluacion> buscarPorNombre(String tipo) throws DAOExcepcion {
        return criterioEvaluacionDAO.buscarPorNombre(tipo);
    }

    public Collection<CriterioEvaluacion> listar() throws DAOExcepcion {
        return criterioEvaluacionDAO.listar();
    }

    public CriterioEvaluacion obtener(int codigo) throws DAOExcepcion {
        return criterioEvaluacionDAO.obtener(codigo);
    }

    public void eliminar(int codigo) throws DAOExcepcion {
        criterioEvaluacionDAO.eliminar(codigo);
    }

    public CriterioEvaluacion actualizar(CriterioEvaluacion vo) throws DAOExcepcion {
        return criterioEvaluacionDAO.actualizar(vo);
    }
}

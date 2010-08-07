/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.CriterioEvaluacion;

/**
 *
 * @author Alfredo
 */
public interface CriterioEvaluacionDAO {

     public Collection<CriterioEvaluacion> buscarPorNombre(String nombres) throws DAOExcepcion;

    public CriterioEvaluacion insertar(CriterioEvaluacion vo) throws DAOExcepcion;

    public Collection<CriterioEvaluacion> listar() throws DAOExcepcion;

    public CriterioEvaluacion obtener(int codigo) throws DAOExcepcion;

    public void eliminar(int codigo) throws DAOExcepcion;

    public CriterioEvaluacion actualizar(CriterioEvaluacion vo) throws DAOExcepcion;
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.CriterioInvitacion;

/**
 *
 * @author Alfredo
 */
public interface CriterioInvitacionDAO {

    public CriterioInvitacion insertar(CriterioInvitacion vo) throws DAOExcepcion;

    public Collection<CriterioInvitacion> listar() throws DAOExcepcion;

    public CriterioInvitacion obtener(int codigo) throws DAOExcepcion;

    public void eliminar(int codigo) throws DAOExcepcion;

}

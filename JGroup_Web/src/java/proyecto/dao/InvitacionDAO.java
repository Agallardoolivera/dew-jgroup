/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Invitacion;
/**
 *
 * @author Alfredo
 */
public interface InvitacionDAO {
    public Collection<Invitacion> buscarPorNombre(String No_Invitacion) throws DAOExcepcion;

    public Invitacion insertar(Invitacion vo) throws DAOExcepcion;

    public Collection<Invitacion> listar() throws DAOExcepcion;

    public Invitacion obtener(int Co_Invitacion) throws DAOExcepcion;

    public void eliminar(int Co_Invitacion) throws DAOExcepcion;

    public Invitacion actualizar(Invitacion vo) throws DAOExcepcion;
}

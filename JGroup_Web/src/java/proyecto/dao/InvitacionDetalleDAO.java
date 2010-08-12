/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.DetalleInvitacion;
/**
 *
 * @author Alfredo
 */
public interface InvitacionDetalleDAO {
    public Collection<DetalleInvitacion> buscarPorNombre(int No_Invitacion) throws DAOExcepcion;

    public DetalleInvitacion insertar(DetalleInvitacion vo) throws DAOExcepcion;

    public Collection<DetalleInvitacion> listar() throws DAOExcepcion;

    public DetalleInvitacion obtener(int Co_Invitacion) throws DAOExcepcion;

    public void eliminar(int Co_Invitacion) throws DAOExcepcion;
}

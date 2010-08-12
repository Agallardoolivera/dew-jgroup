/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.dao.InvitacionDetalleDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.DetalleInvitacion;

/**
 *
 * @author Alfredo
 */
public class InvitacionDetalleServiceImpl implements InvitacionDetalleService {

      private InvitacionDetalleDAO InvitacionDetalleDAO;

    public InvitacionDetalleDAO getInvitacionDetalleDAO() {
        return InvitacionDetalleDAO;
    }

    public void setInvitacionDAO(InvitacionDetalleDAO InvitacionDetalleDAO) {
        this.InvitacionDetalleDAO = InvitacionDetalleDAO;
    }

    public DetalleInvitacion insertar(DetalleInvitacion vo) throws DAOExcepcion {
        return InvitacionDetalleDAO.insertar(vo);
    }

    public Collection<DetalleInvitacion> buscarPorNombre(int No_Invitacion) throws DAOExcepcion {
        return InvitacionDetalleDAO.buscarPorNombre(No_Invitacion);
    }

    public Collection<DetalleInvitacion> listar() throws DAOExcepcion {
        return InvitacionDetalleDAO.listar();
    }

    public DetalleInvitacion obtener(int Co_Invitacion) throws DAOExcepcion {
        return InvitacionDetalleDAO.obtener(Co_Invitacion);
    }

    public void eliminar(int Co_Invitacion) throws DAOExcepcion {
        InvitacionDetalleDAO.eliminar(Co_Invitacion);
    }

}

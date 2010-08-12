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
public class InvitacionDetalleServiceImpl implements InvitacionDetalleService{

      private InvitacionDetalleDAO invitacionDetalleDAO;

    public InvitacionDetalleDAO getInvitacionDetalleDAO() {
        return invitacionDetalleDAO;
    }

    public void setInvitacionDetalleDAO(InvitacionDetalleDAO invitacionDetalleDAO) {
        this.invitacionDetalleDAO = invitacionDetalleDAO;
    }

    public DetalleInvitacion insertar(DetalleInvitacion vo) throws DAOExcepcion {
        return invitacionDetalleDAO.insertar(vo);
    }

    public Collection<DetalleInvitacion> buscarPorNombre(int No_Invitacion) throws DAOExcepcion {
        return invitacionDetalleDAO.buscarPorNombre(No_Invitacion);
    }

    public Collection<DetalleInvitacion> listar() throws DAOExcepcion {
        return invitacionDetalleDAO.listar();
    }

    public DetalleInvitacion obtener(int Co_Invitacion) throws DAOExcepcion {
        return invitacionDetalleDAO.obtener(Co_Invitacion);
    }

    public void eliminar(int Co_Invitacion) throws DAOExcepcion {
        invitacionDetalleDAO.eliminar(Co_Invitacion);
    }

}

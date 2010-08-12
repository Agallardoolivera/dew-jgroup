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
        this.InvitacionDAO = InvitacionDAO;
    }

    public Invitacion insertar(Invitacion vo) throws DAOExcepcion {
        return InvitacionDAO.insertar(vo);
    }

    public Collection<Invitacion> buscarPorNombre(String No_Invitacion) throws DAOExcepcion {
        return InvitacionDAO.buscarPorNombre(No_Invitacion);
    }

    public Collection<Invitacion> listar() throws DAOExcepcion {
        return InvitacionDAO.listar();
    }

    public Invitacion obtener(int Co_Invitacion) throws DAOExcepcion {
        return InvitacionDAO.obtener(Co_Invitacion);
    }

    public void eliminar(int Co_Invitacion) throws DAOExcepcion {
        InvitacionDAO.eliminar(Co_Invitacion);
    }

    public Invitacion actualizar(Invitacion vo) throws DAOExcepcion {
        return InvitacionDAO.actualizar(vo);
    }
}

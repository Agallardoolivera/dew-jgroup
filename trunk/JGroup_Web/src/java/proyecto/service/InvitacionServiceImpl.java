/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.dao.InvitacionDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Invitacion;

/**
 *
 * @author Alfredo
 */
public class InvitacionServiceImpl implements InvitacionService {

      private InvitacionDAO InvitacionDAO;

    public InvitacionDAO getInvitacionDAO() {
        return InvitacionDAO;
    }

    public void setInvitacionDAO(InvitacionDAO InvitacionDAO) {
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

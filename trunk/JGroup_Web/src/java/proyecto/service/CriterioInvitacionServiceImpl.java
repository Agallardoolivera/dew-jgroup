/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;

import java.util.Collection;
import proyecto.dao.CriterioInvitacionDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.CriterioInvitacion;

/**
 *
 * @author Alfredo
 *
 */
    public class CriterioInvitacionServiceImpl implements CriterioInvitacionService{

     private CriterioInvitacionDAO criterioInvitacionDAO;

    public CriterioInvitacionDAO getCriterioInvitacionDAO() {
        return criterioInvitacionDAO;
    }

    public void setCriterioInvitacionDAO(CriterioInvitacionDAO criterioInvitacionDAO) {
        this.criterioInvitacionDAO = criterioInvitacionDAO;
    }
   
        public CriterioInvitacion insertar(CriterioInvitacion vo) throws DAOExcepcion {
        return criterioInvitacionDAO.insertar(vo);
    }

    public Collection<CriterioInvitacion> listar() throws DAOExcepcion {
        return criterioInvitacionDAO.listar();
    }

    public CriterioInvitacion obtener(int codigo) throws DAOExcepcion {
        return criterioInvitacionDAO.obtener(codigo);
    }

    public void eliminar(int codigo) throws DAOExcepcion {
        criterioInvitacionDAO.eliminar(codigo);
    }


}

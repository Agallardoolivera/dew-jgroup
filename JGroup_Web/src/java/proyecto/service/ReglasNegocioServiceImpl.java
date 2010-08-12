/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.dao.ReglasNegocioDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Cotizacion;
import proyecto.modelo.DetalleCotizacion;
import proyecto.modelo.CriterioInvitacion;
/**
 *
 * @author Alfredo
 */
public class ReglasNegocioServiceImpl implements ReglasNegocioService {


    private ReglasNegocioDAO reglasNegocioDAO;

    public ReglasNegocioDAO getReglasNegocioDAO() {
        return reglasNegocioDAO;
    }

    public void setReglasNegocioDAO(ReglasNegocioDAO reglasNegocioDAO) {
        this.reglasNegocioDAO = reglasNegocioDAO;
    }

    public Collection<Cotizacion> ListarCotizaciones(int Nu_Invitacion) throws DAOExcepcion {
        return reglasNegocioDAO.ListarCotizaciones(Nu_Invitacion);
    }

    public DetalleCotizacion Detalle_por_Cotizacion(int Cotizacion_Nu_Cotizacion) throws DAOExcepcion {
        return reglasNegocioDAO.Detalle_por_Cotizacion(Cotizacion_Nu_Cotizacion);
    }

    public Collection<CriterioInvitacion> ListarCriterios(int Nu_Invitacion) throws DAOExcepcion{
        return reglasNegocioDAO.ListarCriterios(Nu_Invitacion);
    }

    public int buscarPuntajePorNombre(String Tx_CriterioDescripcion,int Nu_Invitacion) throws DAOExcepcion{
        return reglasNegocioDAO.buscarPuntajePorNombre(Tx_CriterioDescripcion, Nu_Invitacion);
    }
}

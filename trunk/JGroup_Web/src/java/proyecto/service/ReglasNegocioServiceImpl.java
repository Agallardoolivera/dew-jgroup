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

    public Collection<Cotizacion> ListarCotizacions(int Nu_Invitacion) throws DAOExcepcion {
        return reglasNegocioDAO.ListarCotizacions(Nu_Invitacion);
    }

    public DetalleCotizacion Detalle_por_Cotizacion(int Cotizacion_Nu_Cotizacion) throws DAOExcepcion {
        return reglasNegocioDAO.Detalle_por_Cotizacion(Cotizacion_Nu_Cotizacion);
    }
}

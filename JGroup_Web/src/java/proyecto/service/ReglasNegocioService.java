/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Cotizacion;
import proyecto.modelo.DetalleCotizacion;
import proyecto.modelo.CriterioInvitacion;


/**
 *
 * @author Alfredo
 */
public interface ReglasNegocioService {

     public Collection<Cotizacion> ListarCotizaciones(int Nu_Invitacion) throws DAOExcepcion ;
     public Collection<CriterioInvitacion> ListarCriterios(int Nu_Invitacion) throws DAOExcepcion ;
     public DetalleCotizacion Detalle_por_Cotizacion(int Cotizacion_Nu_Cotizacion) throws DAOExcepcion;
     public int buscarPuntajePorNombre(String Tx_CriterioDescripcion,int Nu_Invitacion) throws DAOExcepcion;
     public void AsignarPuntaje(int co_cotizacion,int puntaje) throws DAOExcepcion;
}

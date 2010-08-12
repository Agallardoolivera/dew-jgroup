/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Cotizacion;


/**
 *
 * @author Alfredo
 */
public interface ReglasNegocioService {

     public Collection<Cotizacion> ListarCotizacions(int Nu_Invitacion) throws DAOExcepcion ;
}

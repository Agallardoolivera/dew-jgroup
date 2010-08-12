package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Cotizacion;
import proyecto.modelo.ConsultacotiCab1;

public interface CotizacionCabDAO {

    public Collection<ConsultacotiCab1> buscarPorNombre(int invitacion,int codpro) throws DAOExcepcion;

    public Cotizacion insertar(Cotizacion vo) throws DAOExcepcion;

    public Collection<ConsultacotiCab1> listar() throws DAOExcepcion;

    public ConsultacotiCab1 obtener(int invitacion,int codpro) throws DAOExcepcion;

    public void eliminar(int codigo) throws DAOExcepcion;

    public Cotizacion actualizar(Cotizacion vo) throws DAOExcepcion;

}

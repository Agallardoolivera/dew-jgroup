package proyecto.service;

import java.util.Collection;
import proyecto.dao.CotizacionCabDAO;

import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Cotizacion;
import proyecto.modelo.ConsultacotiCab1;

public class CotizacionServiceImpl implements CotizacionService {

    private CotizacionCabDAO cotizacionCabDAO;

    public CotizacionCabDAO getArticuloDAO() {
        return cotizacionCabDAO;
    }

    public void setCotizacionCabDAO(CotizacionCabDAO cotizacionCabDAO) {
        this.cotizacionCabDAO = cotizacionCabDAO;
    }

    public Cotizacion insertar(Cotizacion vo) throws DAOExcepcion {
        return cotizacionCabDAO.insertar(vo);
    }

    public Collection<ConsultacotiCab1> buscarPorNombre(int invitacion,int codpro) throws DAOExcepcion {
        return cotizacionCabDAO.buscarPorNombre(invitacion,codpro);
    }

    public Collection<ConsultacotiCab1> listar() throws DAOExcepcion {
        return cotizacionCabDAO.listar();
    }

    public ConsultacotiCab1 obtener(int invitacion,int codpro) throws DAOExcepcion {
        return cotizacionCabDAO.obtener(invitacion,codpro);
    }

    public void eliminar(int codigo) throws DAOExcepcion {
        cotizacionCabDAO.eliminar(codigo);
    }

    public Cotizacion actualizar(Cotizacion vo) throws DAOExcepcion {
        return cotizacionCabDAO.actualizar(vo);
    }

}

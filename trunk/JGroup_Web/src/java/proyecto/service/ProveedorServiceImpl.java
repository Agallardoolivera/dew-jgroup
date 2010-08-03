/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.dao.ProveedorDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Proveedor;

/**
 *
 * @author Alfredo
 */
public class ProveedorServiceImpl implements ProveedorService {

      private ProveedorDAO ProveedorDAO;

    public ProveedorDAO getProveedorDAO() {
        return ProveedorDAO;
    }

    public void setProveedorDAO(ProveedorDAO ProveedorDAO) {
        this.ProveedorDAO = ProveedorDAO;
    }

    public Proveedor insertar(Proveedor vo) throws DAOExcepcion {
        return ProveedorDAO.insertar(vo);
    }

    public Collection<Proveedor> buscarPorNombre(String No_Proveedor) throws DAOExcepcion {
        return ProveedorDAO.buscarPorNombre(No_Proveedor);
    }

    public Collection<Proveedor> listar() throws DAOExcepcion {
        return ProveedorDAO.listar();
    }

    public Proveedor obtener(int Co_Proveedor) throws DAOExcepcion {
        return ProveedorDAO.obtener(Co_Proveedor);
    }

    public void eliminar(int Co_Proveedor) throws DAOExcepcion {
        ProveedorDAO.eliminar(Co_Proveedor);
    }

    public Proveedor actualizar(Proveedor vo) throws DAOExcepcion {
        return ProveedorDAO.actualizar(vo);
    }
}

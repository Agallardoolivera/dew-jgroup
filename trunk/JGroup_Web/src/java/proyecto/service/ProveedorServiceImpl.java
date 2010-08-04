package proyecto.service;

import java.util.Collection;
import proyecto.dao.ProveedorDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Proveedor;

public class ProveedorServiceImpl implements ProveedorService {

    private ProveedorDAO proveedorDAO;

    public ProveedorDAO getArticuloDAO() {
        return proveedorDAO;
    }

    public void setProveedorDAO(ProveedorDAO proveedorDAO) {
        this.proveedorDAO = proveedorDAO;
    }

    public Proveedor insertar(Proveedor vo) throws DAOExcepcion {
        return proveedorDAO.insertar(vo);
    }

    public Collection<Proveedor> buscarPorNombre(String nombres) throws DAOExcepcion {
        return proveedorDAO.buscarPorNombre(nombres);
    }

    public Collection<Proveedor> listar() throws DAOExcepcion {
        return proveedorDAO.listar();
    }

    public Proveedor obtener(int codigo) throws DAOExcepcion {
        return proveedorDAO.obtener(codigo);
    }

    public void eliminar(int codigo) throws DAOExcepcion {
        proveedorDAO.eliminar(codigo);
    }

    public Proveedor actualizar(Proveedor vo) throws DAOExcepcion {
        return proveedorDAO.actualizar(vo);
    }

}

package proyecto.service;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Proveedor;

public interface ProveedorService {

    public Collection<Proveedor> buscarPorNombre(String nombres) throws DAOExcepcion;

    public Proveedor insertar(Proveedor vo) throws DAOExcepcion;

    public Collection<Proveedor> listar() throws DAOExcepcion;

    public Proveedor obtener(int codigo) throws DAOExcepcion;

    public void eliminar(int codigo) throws DAOExcepcion;

    public Proveedor actualizar(Proveedor vo) throws DAOExcepcion;

}
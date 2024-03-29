package proyecto.service;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;

public interface ArticuloService {

    public Collection<Articulo> buscarPorNombre(String nombres) throws DAOExcepcion;

    public Articulo insertar(Articulo vo) throws DAOExcepcion;

    public Collection<Articulo> listar() throws DAOExcepcion;

    public Articulo obtener(int codigo) throws DAOExcepcion;

    public void eliminar(int codigo) throws DAOExcepcion;

    public Articulo actualizar(Articulo vo) throws DAOExcepcion;

}

package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;

public interface ArticuloDAO {

    public Collection<Articulo> buscarPorNombre(String nombre) throws DAOExcepcion;

    public Articulo insertar(Articulo vo) throws DAOExcepcion;

    public Articulo obtener(int idCategoria) throws DAOExcepcion;

    public void eliminar(int idCategoria) throws DAOExcepcion;

    public Articulo actualizar(Articulo vo) throws DAOExcepcion;

    public Collection<Articulo> listar() throws DAOExcepcion;
}

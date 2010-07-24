package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;

public interface ArticuloDAO {

    public Collection<Articulo> buscarPorNombre(String nombre) throws DAOExcepcion;

    public Collection<Articulo> listar() throws DAOExcepcion;
}

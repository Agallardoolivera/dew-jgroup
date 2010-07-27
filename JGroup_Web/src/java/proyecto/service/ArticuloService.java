package proyecto.service;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;

public interface ArticuloService {

    public Collection<Articulo> buscarPorNombre(String nombre) throws DAOExcepcion;

    public Articulo insertar(Articulo vo) throws DAOExcepcion;

    public Collection<Articulo> listar() throws DAOExcepcion;
}

package proyecto.service;

import java.util.Collection;
import proyecto.dao.ArticuloDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;

public class ArticuloServiceImpl implements ArticuloService {

    private ArticuloDAO articuloDAO;

    public ArticuloDAO getArticuloDAO() {
        return articuloDAO;
    }

    public void setArticuloDAO(ArticuloDAO articuloDAO) {
        this.articuloDAO = articuloDAO;
    }

    public Collection<Articulo> buscarPorNombre(String nombre) throws DAOExcepcion {
        return articuloDAO.buscarPorNombre(nombre);
    }
            
    public Articulo insertar(Articulo vo) throws DAOExcepcion {
        return articuloDAO.insertar(vo);
    }

    public Articulo obtener(int idCategoria) throws DAOExcepcion {
        return articuloDAO.obtener(idCategoria);
    }

    public void eliminar(int idCategoria) throws DAOExcepcion {
        articuloDAO.eliminar(idCategoria);
    }

    public Articulo actualizar(Articulo vo) throws DAOExcepcion {
        return articuloDAO.actualizar(vo);
    }

    public Collection<Articulo> listar() throws DAOExcepcion {
        return articuloDAO.listar();
    }
}

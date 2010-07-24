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

    public Collection<Articulo> listar() throws DAOExcepcion {
        return articuloDAO.listar();
    }
   
}

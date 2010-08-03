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

    public Articulo insertar(Articulo vo) throws DAOExcepcion {
        return articuloDAO.insertar(vo);
    }

    public Collection<Articulo> buscarPorNombre(String nombres) throws DAOExcepcion {
        return articuloDAO.buscarPorNombre(nombres);
    }

    public Collection<Articulo> listar() throws DAOExcepcion {
        return articuloDAO.listar();
    }
    
    public Articulo obtener(int codigo) throws DAOExcepcion {
        return articuloDAO.obtener(codigo);
    }

    public void eliminar(int codigo) throws DAOExcepcion {
        articuloDAO.eliminar(codigo);
    }

    public Articulo actualizar(Articulo vo) throws DAOExcepcion {
        return articuloDAO.actualizar(vo);
    }
  
}

package proyecto.service;

import java.util.Collection;
import proyecto.dao.UsuarioDAO;
import proyecto.excepcion.DAOExcepcion;
import proyecto.excepcion.LoginExcepcion;
import proyecto.modelo.Usuario;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDAO usuarioDAO;

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public Usuario validar(int Co_Usuario, String clave) throws DAOExcepcion, LoginExcepcion {
        return usuarioDAO.validar(Co_Usuario, clave);
    }

     public Usuario insertar(Usuario vo) throws DAOExcepcion {
        return usuarioDAO.insertar(vo);
    }

    public Collection<Usuario> buscarPorNombre(String nombres) throws DAOExcepcion {
        return usuarioDAO.buscarPorNombre(nombres);
    }

    public Usuario obtener(int codigo) throws DAOExcepcion {
        return usuarioDAO.obtener(codigo);
    }

    public Usuario actualizar(Usuario vo) throws DAOExcepcion {
        return usuarioDAO.actualizar(vo);
    }

    public void eliminar(int codigo) throws DAOExcepcion {
        usuarioDAO.eliminar(codigo);
    }
}

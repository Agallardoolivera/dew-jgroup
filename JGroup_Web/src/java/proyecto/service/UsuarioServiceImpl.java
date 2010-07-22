package proyecto.service;

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

}

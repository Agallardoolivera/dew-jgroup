package proyecto.service;

import proyecto.excepcion.DAOExcepcion;
import proyecto.excepcion.LoginExcepcion;
import proyecto.modelo.Usuario;

public interface UsuarioService {

    public Usuario validar(int Co_Usuario, String clave) throws DAOExcepcion, LoginExcepcion;
}

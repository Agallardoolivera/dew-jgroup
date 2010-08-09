package proyecto.dao;

import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.excepcion.LoginExcepcion;
import proyecto.modelo.Usuario;

public interface UsuarioDAO {

    public Collection<Usuario> buscarPorNombre(String nombres) throws DAOExcepcion;
    public Usuario insertar(Usuario vo) throws DAOExcepcion;
    public Usuario obtener(int codigo) throws DAOExcepcion;
    public Usuario actualizar(Usuario vo) throws DAOExcepcion;
    public void eliminar(int codigo) throws DAOExcepcion;
    public Usuario validar(int Co_Usuario, String clave) throws DAOExcepcion, LoginExcepcion;
    
}

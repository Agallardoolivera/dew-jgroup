/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.dao;

import java.util.ArrayList;
import java.util.Collection;
import proyecto.modelo.Usuario;

/**
 *
 * @author pcsidrod
 */
public class UsuarioDAO {

    private Collection<Usuario> usuarios;

    public UsuarioDAO() {
        Usuario u ;
        usuarios = new ArrayList<Usuario>();

        u = new Usuario();
        u.setIdUsuario("jperez");
        u.setClave("patito");
        u.setNombres("Juan Perez");
        u.setArea("Gerencia");
        usuarios.add(u);

        u = new Usuario();
        u.setIdUsuario("david");
        u.setClave("java");
        u.setNombres("david rodrigues");
        u.setArea("Auditoria");
        usuarios.add(u);
    }

    public void insertar(Usuario vo) {
        this.usuarios.add(vo);
    }

    public Collection<Usuario> listar() {
        return this.usuarios;
    }
}

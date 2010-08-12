package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.ArrayList;
import javax.sql.DataSource;
import proyecto.excepcion.DAOExcepcion;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.connector.Request;
import proyecto.excepcion.LoginExcepcion;
import proyecto.modelo.Usuario;

public class UsuarioDAOImpl extends BaseDAO implements UsuarioDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Usuario validar(int Co_Usuario, String clave) throws DAOExcepcion, LoginExcepcion {
        System.out.println("UsuarioDAOImpl: validar: Co_Usuario: " + Co_Usuario + ", clave: " + clave);
        String query = "select Co_Usuario, clave from usuario where Co_Usuario=? and clave=?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario vo = new Usuario();
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Co_Usuario);
            stmt.setString(2, clave);
            rs = stmt.executeQuery();

            if (rs.next()) {
               
                vo.setClave(rs.getString("clave"));               
            } else {
                throw new LoginExcepcion("No existe");
            }
        } catch (LoginExcepcion e) {
            System.err.println(e.getMessage());
            throw e;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return vo;
    }

     public Collection<Usuario> buscarPorNombre(String nombres)
            throws DAOExcepcion {
        String query = "select Co_Usuario, clave from usuario where estado=0 and Co_Usuario like ?";
        Collection<Usuario> lista = new ArrayList<Usuario>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + nombres + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario vo = new Usuario();
                vo.setCo_Usuario(rs.getInt("Co_Usuario"));
                vo.setClave(rs.getString("clave"));
               
                lista.add(vo);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        System.out.println(lista.size());
        return lista;
    }

     public Usuario insertar(Usuario vo) throws DAOExcepcion {
        String query = "INSERT INTO usuario(Co_Usuario,clave,estado) VALUES (?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getCo_Usuario());
            stmt.setString(2, vo.getClave());
            stmt.setInt(3, vo.getEstado());
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo insertar");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return vo;
    }

     public Usuario obtener(int codigo) throws DAOExcepcion {
        Usuario vo = new Usuario();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select Co_Usuario, clave from usuario where Co_Usuario=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setCo_Usuario(rs.getInt("Co_Usuario"));
                vo.setClave(rs.getString("clave"));
                
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return vo;
    }

     public Usuario actualizar(Usuario vo) throws DAOExcepcion {
        String query = "update usuario set clave=? where Co_Usuario=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, vo.getClave());
            stmt.setInt(2, vo.getCo_Usuario());
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo actualizar");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return vo;
    }


     public void eliminar(int codigo) throws DAOExcepcion {
        String query = "update usuario set estado=1 where Co_Usuario=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, codigo);
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo eliminar");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
    }

}


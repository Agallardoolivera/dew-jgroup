package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import proyecto.excepcion.DAOExcepcion;
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
        String query = "select Co_Usuario, nombres, paterno, materno, correo, direccion, telefono, estado from usuario where Co_Usuario=? and clave=?";
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
               
                vo.setNombres(rs.getString("nombres"));
                vo.setTxt_ape(rs.getString("paterno"));
                vo.setNombres(rs.getString("materno"));
               
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
}


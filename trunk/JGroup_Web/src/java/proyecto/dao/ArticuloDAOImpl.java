package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import javax.sql.DataSource;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Articulo;

public class ArticuloDAOImpl extends BaseDAO implements ArticuloDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<Articulo> buscarPorNombre(String nombre)
            throws DAOExcepcion {
        String query = "select Co_Articulo, No_Articulo, UM from Articulo where No_Articulo like ?";
        Collection<Articulo> lista = new ArrayList<Articulo>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + nombre + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Articulo vo = new Articulo();
                vo.setCo_Articulo(rs.getInt("Co_Articulo"));
                vo.setNo_Articulo(rs.getString("No_Articulo"));
                vo.setUM(rs.getString("UM"));
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
 public Collection<Articulo> listar() throws DAOExcepcion {
        Collection<Articulo> c = new ArrayList<Articulo>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "SELECT * from articulo";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Articulo vo = new Articulo();
                vo.setCo_Articulo(rs.getInt("Co_Articulo"));
                vo.setNo_Articulo(rs.getString("No_Articulo"));
                vo.setUM(rs.getString("UM"));
                c.add(vo);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return c;
    }

    public Articulo insertar(Articulo vo) throws DAOExcepcion {
        String query = "INSERT INTO articulo(Co_Articulo,No_Articulo,UM) VALUES (?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getCo_Articulo());
            stmt.setString(2, vo.getNo_Articulo());
            stmt.setString(3, vo.getUM());
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo insertar");
            }
            // Obtener el ultimo id
            /*
            int id = 0;
            query = "SELECT LAST_INSERT_ID()";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            vo.setCo_Articulo(id);
*/
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

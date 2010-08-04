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

    public Collection<Articulo> buscarPorNombre(String nombres)
            throws DAOExcepcion {
        String query = "select Co_Articulo, No_Articulo, UM from articulo where No_Articulo like ?";
        Collection<Articulo> lista = new ArrayList<Articulo>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + nombres + "%");
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
            String query = "SELECT Co_Articulo,No_Articulo,UM from articulo";
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

        public Articulo actualizar(Articulo vo) throws DAOExcepcion {
        String query = "update articulo set No_Articulo=?,UM=? where Co_Articulo=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, vo.getNo_Articulo());
            stmt.setString(2, vo.getUM());
            stmt.setInt(3, vo.getCo_Articulo());
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
        String query = "DELETE FROM articulo WHERE Co_Articulo=?";
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

        public Articulo obtener(int codigo) throws DAOExcepcion {
        Articulo vo = new Articulo();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select Co_Articulo, No_Articulo, UM from articulo where Co_Articulo=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setCo_Articulo(rs.getInt("Co_Articulo"));
                vo.setNo_Articulo(rs.getString("No_Articulo"));
                vo.setUM(rs.getString("UM"));
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
 
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Proveedor;

/**
 *
 * @author Angela
 */
public class ProveedorDAOImpl extends BaseDAO implements ProveedorDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<Proveedor> buscarPorNombre(String Tx_Descripcion)
            throws DAOExcepcion {


        String query = "select Co_Proveedor, Nu_RucProveedor,No_RazonSocialProveedor,Tx_CorreoProveedor,Tx_ClaveAccesoProveedor from Proveedor where Tx_Descripcion like ? ";
        Collection<Proveedor> lista = new ArrayList<Proveedor>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + Tx_Descripcion + "%");
            System.out.println("Query =" +stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                Proveedor vo = new Proveedor();
                vo.setCo_Proveedor(rs.getInt("Co_Proveedor"));
                vo.setNu_RucProveedor(rs.getString("Nu_RucProveedor"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setTx_CorreoProveedor(rs.getString("Tx_CorreoProveedor"));
                vo.setTx_ClaveAccesoProveedor(rs.getString("Tx_ClaveAccesoProveedor"));
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
        System.out.println("Tamaño =" +lista.size());
        return lista;
    }

    public Collection<Proveedor> listar() throws DAOExcepcion {
        Collection<Proveedor> c = new ArrayList<Proveedor>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "SELECT * from Proveedor";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Proveedor vo = new Proveedor();
                vo.setCo_Proveedor(rs.getInt("Co_Proveedor"));
                vo.setNu_RucProveedor(rs.getString("Nu_RucProveedor"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setTx_CorreoProveedor(rs.getString("Tx_CorreoProveedor"));
                vo.setTx_ClaveAccesoProveedor(rs.getString("Tx_ClaveAccesoProveedor"));
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

    @SuppressWarnings("empty-statement")
    public Proveedor insertar(Proveedor vo) throws DAOExcepcion {
        String query = "INSERT INTO Proveedor(Co_Proveedor,Nu_RucProveedor,No_RazonSocialProveedor,Tx_CorreoProveedor,Tx_ClaveAccesoProveedor)" + " VALUES (?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getCo_Proveedor());
            stmt.setString(2, vo.getNu_RucProveedor());
            stmt.setString(3,vo.getNo_RazonSocialProveedor());
            stmt.setString(4, vo.getTx_CorreoProveedor());
            stmt.setString(5, vo.getTx_ClaveAccesoProveedor());

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
            vo.setCo_Invitacion(id);
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

    public Proveedor actualizar(Proveedor vo) throws DAOExcepcion {

        String query = "update Proveedor set Nu_RucProveedor=?, No_RazonSocialProveedor=?, Tx_CorreoProveedor=?,Tx_ClaveAccesoProveedor=?"
                       + " where Co_Proveedor=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, vo.getNu_RucProveedor());
            stmt.setString(2, vo.getNo_RazonSocialProveedor());
            stmt.setString(3, vo.getTx_CorreoProveedor());
            stmt.setString(4, vo.getTx_ClaveAccesoProveedor());
            stmt.setInt(5, vo.getCo_Proveedor());
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

    public void eliminar(int Co_Proveedor) throws DAOExcepcion {
        String query = "DELETE FROM Proveedor WHERE Co_Proveedor=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Co_Proveedor);
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

    public Proveedor obtener(int Co_Proveedor) throws DAOExcepcion {
        Proveedor vo = new Proveedor();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select Co_Proveedor, Nu_RucProveedor, No_RazonSocialProveedor,Tx_CorreoProveedor,Tx_ClaveAccesoProveedor" +
                    " from Proveedor where Co_Proveedor=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Co_Proveedor);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setCo_Proveedor(rs.getInt("Co_Proveedor"));
                vo.setNu_RucProveedor(rs.getString("Nu_RucProveedor"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setTx_CorreoProveedor(rs.getString("Tx_CorreoProveedor"));
                vo.setTx_ClaveAccesoProveedor(rs.getString("Tx_ClaveAccesoProveedor"));

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

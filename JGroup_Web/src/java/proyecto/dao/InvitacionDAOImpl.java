/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.sql.Connection;
import java.sql.Date;
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
import proyecto.modelo.Invitacion;

/**
 *
 * @author Alfredo
 */
public class InvitacionDAOImpl extends BaseDAO implements InvitacionDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<Invitacion> buscarPorNombre(String Tx_Descripcion)
            throws DAOExcepcion {


        String query = "select Nu_Invitacion, Fe_Invitacion,Tx_GeneradorUsuario,Tx_Descripcion,Usuario_Co_Usuario,OrdenCompra_Nu_OrdenCompra from Invitacion where Tx_Descripcion like ? ";
        Collection<Invitacion> lista = new ArrayList<Invitacion>();
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
                Invitacion vo = new Invitacion();
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setFe_Invitacion(rs.getString("Fe_Invitacion"));
                vo.setTx_GeneradorUsuario(rs.getString("Tx_GeneradorUsuario"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
                vo.setUsuario_Co_Usuario(rs.getInt("Usuario_Co_Usuario"));
                vo.setOrdenCompra_Nu_OrdenCompra(rs.getInt("OrdenCompra_Nu_OrdenCompra"));
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

    public Collection<Invitacion> listar() throws DAOExcepcion {
        Collection<Invitacion> c = new ArrayList<Invitacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "SELECT * from Invitacion";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Invitacion vo = new Invitacion();
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setFe_Invitacion(rs.getString("Fe_Invitacion"));
                vo.setTx_GeneradorUsuario(rs.getString("Tx_GeneradorUsuario"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
                vo.setUsuario_Co_Usuario(rs.getInt("Usuario_Co_Usuario"));
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
    public Invitacion insertar(Invitacion vo) throws DAOExcepcion {
        String query = "INSERT INTO Invitacion(Nu_Invitacion,Fe_Invitacion,Tx_Descripcion,Tx_GeneradorUsuario,Usuario_Co_Usuario,OrdenCompra_Nu_OrdenCompra)" + " VALUES (?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
       

            
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getNu_Invitacion());
            stmt.setString(2, vo.getFe_Invitacion());
            stmt.setString(3,vo.getTx_Descripcion());
            stmt.setString(4, vo.getTx_GeneradorUsuario());
            stmt.setInt(5, vo.getUsuario_Co_Usuario());
            stmt.setInt(6, vo.getOrdenCompra_Nu_OrdenCompra());

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

    public Invitacion actualizar(Invitacion vo) throws DAOExcepcion {

        String query = "update Invitacion set Nu_Invitacion=?, Fe_Invitacion=?, Tx_GeneradorUsuario=?,Tx_Descripcion=?" 
                       + ",Usuario_Co_Usuario=?,OrdenCompra_Nu_OrdenCompra=? where Nu_Invitacion=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getNu_Invitacion());
            stmt.setString(2, vo.getFe_Invitacion());
            stmt.setString(3, vo.getTx_GeneradorUsuario());
            stmt.setString(4, vo.getTx_Descripcion());
            stmt.setInt(5, vo.getUsuario_Co_Usuario());
            stmt.setInt(6, vo.getOrdenCompra_Nu_OrdenCompra());
            stmt.setInt(7, vo.getNu_Invitacion());
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

    public void eliminar(int Nu_Invitacion) throws DAOExcepcion {
        String query = "DELETE FROM Invitacion WHERE Nu_Invitacion=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
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

    public Invitacion obtener(int Nu_Invitacion) throws DAOExcepcion {
        Invitacion vo = new Invitacion();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select Nu_Invitacion, Fe_Invitacion, Tx_GeneradorUsuario,Tx_Descripcion,Usuario_Co_Usuario,OrdenCompra_Nu_OrdenCompra" +
                    " from Invitacion where Nu_Invitacion=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setFe_Invitacion(rs.getString("Fe_Invitacion"));
                vo.setTx_GeneradorUsuario(rs.getString("Tx_GeneradorUsuario"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
                vo.setUsuario_Co_Usuario(rs.getInt("Usuario_Co_Usuario"));
                vo.setOrdenCompra_Nu_OrdenCompra(rs.getInt("OrdenCompra_Nu_OrdenCompra"));

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

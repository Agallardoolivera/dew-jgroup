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
import proyecto.modelo.DetalleInvitacion;

/**
 *
 * @author Alfredo
 */
public class InvitacionDetalleDAOImpl extends BaseDAO implements InvitacionDetalleDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<DetalleInvitacion> buscarPorNombre(int invitacion)
            throws DAOExcepcion {


        String query = "select * from detalleinvitacion where invitacion_nu_invitacion = ? ";
        Collection<DetalleInvitacion> lista = new ArrayList<DetalleInvitacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, invitacion);
            System.out.println("Query =" +stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                DetalleInvitacion vo = new DetalleInvitacion();
                vo.setNu_invitacion(rs.getInt("Nu_Invitacion"));
                vo.setCo_Articulo(rs.getInt("Co_Articulo"));
                vo.setNu_Item(rs.getInt("Nu_Item"));
                vo.setNu_cantidad(rs.getInt("Nu_cantidad"));
                vo.setTx_Observacion("Tx_Observacion");
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

    public Collection<DetalleInvitacion> listar() throws DAOExcepcion {
        Collection<DetalleInvitacion> c = new ArrayList<DetalleInvitacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "SELECT * from DetalleInvitacion";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                DetalleInvitacion vo = new DetalleInvitacion();
                vo.setNu_invitacion(rs.getInt("Nu_Invitacion"));
                vo.setCo_Articulo(rs.getInt("Co_Articulo"));
                vo.setNu_Item(rs.getInt("Nu_Item"));
                vo.setNu_cantidad(rs.getInt("Nu_cantidad"));
                vo.setTx_Observacion("Tx_Observacion");
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
    public DetalleInvitacion insertar(DetalleInvitacion vo) throws DAOExcepcion {
        String query = "INSERT INTO DetalleInvitacion(Invitacion_Nu_Invitacion,Nu_item,Articulo_Co_Articulo,Tx_Observacion,Nu_Cantidad)" + " VALUES (?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
       

            
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getNu_invitacion());
            stmt.setInt(2, vo.getNu_Item());
            stmt.setInt(3,vo.getCo_Articulo());
            stmt.setString(4, vo.getTx_Observacion());
            stmt.setInt(5, vo.getNu_cantidad());
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

    
    public void eliminar(int Nu_Invitacion) throws DAOExcepcion {
        String query = "DELETE FROM DetalleInvitacion WHERE Nu_Invitacion=?";
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

    public DetalleInvitacion obtener(int Nu_Invitacion) throws DAOExcepcion {
        DetalleInvitacion vo = new DetalleInvitacion();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select * from DetalleInvitacion where Nu_Invitacion=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setNu_invitacion(rs.getInt("Nu_Invitacion"));
                vo.setCo_Articulo(rs.getInt("Co_Articulo"));
                vo.setNu_Item(rs.getInt("Nu_Item"));
                vo.setNu_cantidad(rs.getInt("Nu_cantidad"));
                vo.setTx_Observacion("Tx_Observacion");

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

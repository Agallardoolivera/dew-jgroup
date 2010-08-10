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
import proyecto.modelo.Cotizacion;
import proyecto.modelo.ConsultacotiCab1;
/**
 *
 * @author Angela
 */
public class CotizacionCabDAOImpl extends BaseDAO implements CotizacionCabDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<ConsultacotiCab1> buscarPorNombre(int invitacion,int codpro)
            throws DAOExcepcion {


        String query = "SELECT Nu_Cotizacion, Nu_Invitacion , Tx_Descripcion, No_RazonSocialProveedor  , Fe_Cotizacion ,TX_Observacion";
        query = query  + " FROM cotizacion LEFT JOIN proveedor ON co_proveedor = proveedor_co_proveedor " ;
       query = query  + " LEFT JOIN invitacion ON nu_invitacion = invitacion_nu_invitacion where invitacion_nu_invitacion=? and proveedor=?";


        Collection<ConsultacotiCab1> lista = new ArrayList<ConsultacotiCab1>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + invitacion + "%");
            stmt.setString(2, "%" + codpro + "%");
            System.out.println("Query =" +stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                ConsultacotiCab1 vo = new ConsultacotiCab1();
                vo.setNu_Cotizacion(rs.getInt("Nu_Cotizacion"));
                vo.setFe_Cotizacion(rs.getDate("Invitacion_Nu_Invitacion"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setTX_Observacion(rs.getString("TX_Observacion"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));

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

    public Collection<ConsultacotiCab1> listar() throws DAOExcepcion {
        Collection<ConsultacotiCab1> c = new ArrayList<ConsultacotiCab1>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();

        String query = "SELECT Nu_Cotizacion, Nu_Invitacion , Tx_Descripcion, No_RazonSocialProveedor  , Fe_Cotizacion ,TX_Observacion";
        query = query  + " FROM cotizacion LEFT JOIN proveedor ON co_proveedor = proveedor_co_proveedor " ;
       query = query  + " LEFT JOIN invitacion ON nu_invitacion = invitacion_nu_invitacion ";
                            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ConsultacotiCab1 vo = new ConsultacotiCab1();

                vo.setNu_Cotizacion(rs.getInt("Nu_Cotizacion"));
                vo.setFe_Cotizacion(rs.getDate("Invitacion_Nu_Invitacion"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setTX_Observacion(rs.getString("TX_Observacion"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
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
    public Cotizacion insertar(Cotizacion vo) throws DAOExcepcion {
        String query = "INSERT INTO cotizacion(Fe_Cotizacion,Invitacion_Nu_Invitacion,Proveedor_Co_Proveedor,TX_Observacion)" + " VALUES (?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, vo.getFe_Cotizacion().toString());
            stmt.setInt(2,vo.getNu_Invitacion());
            stmt.setInt(3, vo.getCo_Proveedor());
            stmt.setString(4, vo.getTX_Observacion());

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

    public Cotizacion actualizar(Cotizacion vo) throws DAOExcepcion {

        String query = "update Cotizacion set TX_Observacion=?"
                       + " where Invitacion_Nu_Invitacion=? and Co_Proveedor=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, vo.getTX_Observacion());
            stmt.setInt(2, vo.getNu_Invitacion());
            stmt.setInt(3, vo.getCo_Proveedor());
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
      //  String query = "DELETE FROM Proveedor WHERE Co_Proveedor=?";
        String query = "update cotizacion set Tx_EstadoCot='I' WHERE Invitacion_Nu_Invitacion=? and Co_Proveedor=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Co_Proveedor);
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo dar de baja");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
    }

    public ConsultacotiCab1 obtener(int invitacion,int codpro) throws DAOExcepcion {
        ConsultacotiCab1 vo = new ConsultacotiCab1();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {

        String query = "SELECT Nu_Cotizacion, Nu_Invitacion , Tx_Descripcion, No_RazonSocialProveedor  , Fe_Cotizacion ,TX_Observacion";
        query = query  + " FROM cotizacion LEFT JOIN proveedor ON co_proveedor = proveedor_co_proveedor " ;
       query = query  + " LEFT JOIN invitacion ON nu_invitacion = invitacion_nu_invitacion where invitacion_nu_invitacion=? and proveedor=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, invitacion);
            stmt.setInt(1, codpro);
            rs = stmt.executeQuery();
            if (rs.next()) {

                vo.setNu_Cotizacion(rs.getInt("Nu_Cotizacion"));
                vo.setFe_Cotizacion(rs.getDate("Invitacion_Nu_Invitacion"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setTX_Observacion(rs.getString("TX_Observacion"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));

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

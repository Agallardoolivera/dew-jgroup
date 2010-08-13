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
import proyecto.modelo.CriterioEvaluacion;
import proyecto.modelo.DetalleCotizacion;
import proyecto.modelo.CriterioInvitacion;
import proyecto.modelo.CotizacionProveedor;
/**
 *
 * @author Alfredo
 */
public class ReglasNegocioDAOImpl extends BaseDAO implements ReglasNegocioDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<Cotizacion> ListarCotizaciones(int Nu_Invitacion) throws DAOExcepcion {
        Collection<Cotizacion> c = new ArrayList<Cotizacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "SELECT * from Cotizacion C inner join Invitacion I   " +
                    "on C.Invitacion_Nu_Invitacion = I.Nu_Invitacion where I.Nu_Invitacion=?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            System.out.println("Query =" + stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cotizacion vo = new Cotizacion();
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setNu_Cotizacion(rs.getInt("Nu_Cotizacion"));
                vo.setTx_EstadoCot(rs.getString("Tx_EstadoCot"));
                vo.setFe_Entrega(rs.getString("Fe_Entrega"));
                vo.setCo_Proveedor(rs.getInt("Proveedor_Co_Proveedor"));
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

    public int buscarPuntajePorNombre(String Tx_CriterioDescripcion, int Nu_Invitacion)
            throws DAOExcepcion {

        int puntaje = 0;
        String query = "select nu_puntaje from criterioinvitacion ci inner join criterioevaluacion ce" +
                " on ce.co_criterio=ci.criterioevaluacion_co_criterio where invitacion_nu_invitacion=?" +
                " and ce.tx_desccriterioevaluacion like ?";

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            stmt.setString(2, "%" + Tx_CriterioDescripcion + "%");

            System.out.println("Query =" + stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                puntaje = rs.getInt("nu_puntaje");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }

        return puntaje;
    }

    public Collection<CriterioInvitacion> ListarCriterios(int Nu_Invitacion) throws DAOExcepcion {
        Collection<CriterioInvitacion> c = new ArrayList<CriterioInvitacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "SELECT * from CriterioInvitacion where invitacion_Nu_Invitacion=?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            System.out.println("Query =" + stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                CriterioInvitacion vo = new CriterioInvitacion();
                vo.setCriterioevaluacion_Co_Criterio(rs.getInt("criterioevaluacion_Co_Criterio"));
                vo.setNu_puntaje(rs.getInt("Nu_Puntaje"));
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

    public DetalleCotizacion Detalle_por_Cotizacion(int Nu_Cotizacion) throws DAOExcepcion {
        DetalleCotizacion vo = new DetalleCotizacion();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {

            con = dataSource.getConnection();
            String query = "SELECT * from DetalleCotizacion where Cotizacion_Nu_Cotizacion=?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Cotizacion);
            rs = stmt.executeQuery();
            while (rs.next()) {
                vo.setCo_Articulo(rs.getInt("Articulo_Co_Articulo"));
                vo.setCotizacion_Nu_Cotizacion(rs.getInt("Cotizacion_Nu_Cotizacion"));
                vo.setNu_Cantidad(rs.getInt("Nu_Cantidad"));
                vo.setSs_PrecioUnitario(rs.getInt("Ss_PrecioUnitario"));
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



     public void AsignarPuntaje(int co_cotizacion,int puntaje) throws DAOExcepcion {

        String query = "update cotizacion set nu_puntajeobtenido=nu_puntajeobtenido + ? where nu_cotizacion=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, puntaje);
            stmt.setInt(2, co_cotizacion);
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
    }



      public String ProveedorGanador(int Nu_Invitacion) throws DAOExcepcion {

          String ProveedorGanador=null;

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "select No_RazonSocialProveedor from proveedor where co_proveedor= "
                           + "(select proveedor_co_proveedor from cotizacion "
                           +" where nu_puntajeobtenido=(select max(nu_puntajeobtenido) "
                           +" from cotizacion where invitacion_nu_invitacion=?))";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            System.out.println("Query =" + stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
               ProveedorGanador = rs.getString("No_RazonSocialProveedor");
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DAOExcepcion(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return ProveedorGanador;
    }


     
    public Collection<CotizacionProveedor> ListarCotizacion_Proveedor(int Nu_Invitacion) throws DAOExcepcion {
        Collection<CotizacionProveedor> c = new ArrayList<CotizacionProveedor>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "select Nu_Cotizacion,NU_RucProveedor,No_RazonSocialProveedor,Fe_Entrega,nu_cantidad*ss_preciounitario as Monto " +
                           " from cotizacion c " +
                           " inner join proveedor p on c.proveedor_co_proveedor=p.co_proveedor "+
                           " inner join invitacion i on i.nu_invitacion=c.invitacion_nu_invitacion "+
                           " inner join detallecotizacion dc on dc.cotizacion_nu_cotizacion=c.nu_cotizacion"+
                           " where i.nu_invitacion=? ";

            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            System.out.println("Query =" + stmt.toString());
            rs = stmt.executeQuery();
            while (rs.next()) {
                CotizacionProveedor vo = new CotizacionProveedor();
                vo.setNu_Cotizacion(rs.getInt("Nu_Cotizacion"));
                vo.setNu_RucProveedor(rs.getString("NU_RucProveedor"));
                vo.setNo_RazonSocialProveedor(rs.getString("No_RazonSocialProveedor"));
                vo.setFe_Entrega(rs.getString("Fe_Entrega"));
                vo.setMonto(rs.getInt("Monto"));
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

}

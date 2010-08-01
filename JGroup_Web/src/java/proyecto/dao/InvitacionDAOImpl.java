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
        String query = "select Nu_Invitacion, Fe_Invitacion,Tx_GeneradorUsuario,Tx_Descripcion,Usuario_Co_Usuario,OrdenCompra_Co_OrdenCompra from Invitacion where No_Invitacion like ?";
        Collection<Invitacion> lista = new ArrayList<Invitacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + Tx_Descripcion + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Invitacion vo = new Invitacion();
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setFe_Invitacion(rs.getDate("Fe_Invitacion"));
                vo.setTx_GeneradorUsuario(rs.getString("Tx_Generador_Usuario"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
                vo.setCo_Usuario(rs.getInt("Usuario_Co_Usuario"));
                vo.setNu_OrdenCompra(rs.getInt("OrdenCompra_Co_OrdenCompra"));
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
                vo.setFe_Invitacion(rs.getDate("Fe_Invitacion"));
                vo.setTx_GeneradorUsuario(rs.getString("Tx_GeneradorUsuario"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
                vo.setCo_Usuario(rs.getInt("Usuario_Co_Usuario"));
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
        String query = "INSERT INTO Invitacion(Nu_Invitacion,Fe_Invitacion,Tx_GeneradorUsuario,Tx_Descripcion,Usuario_Co_Usuario,OrdenCompra_Nu_OrdenCompra)" + " VALUES (?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        DateFormat formatter;
        Date date = null;
        formatter = new SimpleDateFormat("yyyy-MM-dd");

        try{
        date = (Date) formatter.parse(vo.getFe_Invitacion().toString());
        } catch (Exception e) {
          }

        try {


            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getNu_Invitacion());
            stmt.setDate(2, date);
            stmt.setString(3, vo.getTx_GeneradorUsuario());
            stmt.setString(4,vo.getTx_Descripcion());
            stmt.setInt(5, vo.getCo_Usuario());
            stmt.setInt(6, vo.getNu_OrdenCompra());

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

    public Invitacion actualizar(Invitacion vo) throws DAOExcepcion {

        String query = "update Invitacion set Nu_Invitacion=?, Fe_Invitacion=?, Tx_GeneradorUsuario=?,Tx_Descripcion=?" 
                       + ",Usuario_Co_Usuario=?,OrdenCompra_Co_OrdenCompra=? where Nu_Invitacion=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getNu_Invitacion());
            stmt.setDate(2,(Date) vo.getFe_Invitacion());
            stmt.setString(3, vo.getTx_GeneradorUsuario());
            stmt.setString(4, vo.getTx_Descripcion());
            stmt.setInt(5, vo.getCo_Usuario());
            stmt.setInt(6, vo.getNu_OrdenCompra());
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
            String query = "select Nu_Invitacion, Fe_Invitacion, Tx_GeneradorUsuario,Tx_Descripcion,Usuario_Co_Usuario,OrdenCompra_Co_OrdenCompra" +
                    " from Invitacion where Nu_Invitacion=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, Nu_Invitacion);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setNu_Invitacion(rs.getInt("Nu_Invitacion"));
                vo.setFe_Invitacion(rs.getDate("Fe_Invitacion"));
                vo.setTx_GeneradorUsuario(rs.getString("Tx_GeneradorUsuario"));
                vo.setTx_Descripcion(rs.getString("Tx_Descripcion"));
                vo.setCo_Usuario(rs.getInt("Usuario_Co_Usuario"));
                vo.setNu_OrdenCompra(rs.getInt("OrdenCompra_Co_OrdenCompra"));

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
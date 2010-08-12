/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import javax.sql.DataSource;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.CriterioInvitacion;

/**
 *
 * @author Alfredo
 */
public class CriterioInvitacionDAOImpl extends BaseDAO implements CriterioInvitacionDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

 public Collection<CriterioInvitacion> listar() throws DAOExcepcion {
        Collection<CriterioInvitacion> c = new ArrayList<CriterioInvitacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "select * from CriterioEvaluacion";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                CriterioInvitacion vo = new CriterioInvitacion();
                vo.setCriterioevaluacion_Co_Criterio(rs.getInt("Co_Criterio"));
                vo.setInvitacion_Nu_Invitacion(rs.getInt("invitacion_Nu_Invitacion"));
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

    public CriterioInvitacion insertar(CriterioInvitacion vo) throws DAOExcepcion {
        String query = "INSERT INTO CriterioInvitacion(criterioevaluacion_Co_Criterio,invitacion_Nu_Invitacion, Nu_Puntaje) VALUES (?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getCriterioevaluacion_Co_Criterio());
            stmt.setInt(2, vo.getInvitacion_Nu_Invitacion());
            stmt.setInt(3, vo.getNu_puntaje());


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

    public void eliminar(int codigo) throws DAOExcepcion {
        String query = "DELETE FROM CriterioInvitacion WHERE Co_Criterio=?";
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

        public CriterioInvitacion obtener(int codigo) throws DAOExcepcion {
        CriterioInvitacion vo = new CriterioInvitacion();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select * from CriterioInvitacion where criterioevaluacion_Co_Criterio=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setCriterioevaluacion_Co_Criterio(rs.getInt("criterioevaluacion_Co_Criterio"));
                vo.setInvitacion_Nu_Invitacion(rs.getInt("invitacion_Nu_Invitacion"));
                vo.setNu_puntaje(rs.getInt("Nu_Puntaje"));
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

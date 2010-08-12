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
import proyecto.modelo.CriterioEvaluacion;

/**
 *
 * @author Alfredo
 */
public class CriterioEvaluacionDAOImpl extends BaseDAO implements CriterioEvaluacionDAO { 

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

        public Collection<CriterioEvaluacion> buscarPorNombre(String tipo)
            throws DAOExcepcion {
        String query = "select Co_Criterio, Tipo_Dato, Tx_DescCriterioEvaluacion from criterioevaluacion where Tipo_Dato like ? ";
        Collection<CriterioEvaluacion> lista = new ArrayList<CriterioEvaluacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + tipo + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                CriterioEvaluacion vo = new CriterioEvaluacion();
                vo.setCo_Criterio(rs.getInt("Co_Criterio"));
                vo.setTipo_Dato(rs.getString("Tipo_Dato"));
                vo.setTx_DescCriterioEvaluacion(rs.getString("Tx_DescCriterioEvaluacion"));
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

    public Collection<CriterioEvaluacion> listar() throws DAOExcepcion {
        Collection<CriterioEvaluacion> c = new ArrayList<CriterioEvaluacion>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            String query = "select Co_Criterio,Tx_DescCriterioEvaluacion, TipoDato from criterioevaluacion";
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while (rs.next()) {
                CriterioEvaluacion vo = new CriterioEvaluacion();
                vo.setCo_Criterio(rs.getInt("Co_Criterio"));
                vo.setTx_DescCriterioEvaluacion(rs.getString("Tx_DescCriterioEvaluacion"));
                vo.setTipo_Dato(rs.getString("TipoDato"));
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

    public CriterioEvaluacion insertar(CriterioEvaluacion vo) throws DAOExcepcion {
        String query = "INSERT INTO criterioevaluacion(Co_Criterio, Tx_DescCriterioEvaluacion, Tipo_Dato) VALUES (?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, vo.getCo_Criterio());
            stmt.setString(2, vo.getTx_DescCriterioEvaluacion());
            stmt.setString(3, vo.getTipo_Dato());


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

        public CriterioEvaluacion actualizar(CriterioEvaluacion vo) throws DAOExcepcion {
        String query = "update criterioevaluacion set Tx_DescCriterioEvaluacion=?, Tipo_Dato=? where Co_Criterio=?";
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, vo.getTx_DescCriterioEvaluacion());
            stmt.setString(2, vo.getTipo_Dato());
            stmt.setInt(3, vo.getCo_Criterio());
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
        String query = "DELETE FROM criterioevaluacion WHERE Co_Criterio=?";
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

        public CriterioEvaluacion obtener(int codigo) throws DAOExcepcion {
        CriterioEvaluacion vo = new CriterioEvaluacion();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String query = "select Co_Criterio, Tx_DescCriterioEvaluacion, Tipo_Dato from criterioevaluacion where Co_Criterio=?";
            con = dataSource.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, codigo);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vo.setCo_Criterio(rs.getInt("Co_Criterio"));
                vo.setTx_DescCriterioEvaluacion(rs.getString("Tx_DescCriterioEvaluacion"));
                vo.setTipo_Dato(rs.getString("Tipo_Dato"));
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.service;
import java.util.Collection;
import proyecto.excepcion.DAOExcepcion;
import proyecto.modelo.Proveedor;

/**
 *
 * @author Alfredo
 */
public interface ProveedorService {

    public Collection<Proveedor> buscarPorNombre(String No_Proveedor) throws DAOExcepcion;

    public Proveedor insertar(Proveedor vo) throws DAOExcepcion;

    public Collection<Proveedor> listar() throws DAOExcepcion;

    public Proveedor obtener(int Co_Proveedor) throws DAOExcepcion;

    public void eliminar(int Co_Proveedor) throws DAOExcepcion;

    public Proveedor actualizar(Proveedor vo) throws DAOExcepcion;

}

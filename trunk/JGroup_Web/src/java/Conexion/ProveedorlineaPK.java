/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Oscar
 */
@Embeddable
public class ProveedorlineaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LineaNegocio_Co_Negocio")
    private int lineaNegocioCoNegocio;
    @Basic(optional = false)
    @Column(name = "Proveedor_Co_Proveedor")
    private int proveedorCoProveedor;

    public ProveedorlineaPK(int lineaNegocioCoNegocio, int proveedorCoProveedor) {
        this.lineaNegocioCoNegocio = lineaNegocioCoNegocio;
        this.proveedorCoProveedor = proveedorCoProveedor;
    }

    public int getLineaNegocioCoNegocio() {
        return lineaNegocioCoNegocio;
    }

    public void setLineaNegocioCoNegocio(int lineaNegocioCoNegocio) {
        this.lineaNegocioCoNegocio = lineaNegocioCoNegocio;
    }

    public int getProveedorCoProveedor() {
        return proveedorCoProveedor;
    }

    public void setProveedorCoProveedor(int proveedorCoProveedor) {
        this.proveedorCoProveedor = proveedorCoProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lineaNegocioCoNegocio;
        hash += (int) proveedorCoProveedor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProveedorlineaPK)) {
            return false;
        }
        ProveedorlineaPK other = (ProveedorlineaPK) object;
        if (this.lineaNegocioCoNegocio != other.lineaNegocioCoNegocio) {
            return false;
        }
        if (this.proveedorCoProveedor != other.proveedorCoProveedor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.ProveedorlineaPK[lineaNegocioCoNegocio=" + lineaNegocioCoNegocio + ", proveedorCoProveedor=" + proveedorCoProveedor + "]";
    }

}

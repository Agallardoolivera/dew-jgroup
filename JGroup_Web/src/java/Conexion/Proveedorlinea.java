/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "proveedorlinea")
@NamedQueries({@NamedQuery(name = "Proveedorlinea.findAll", query = "SELECT p FROM Proveedorlinea p"), @NamedQuery(name = "Proveedorlinea.findByCoLinea", query = "SELECT p FROM Proveedorlinea p WHERE p.coLinea = :coLinea"), @NamedQuery(name = "Proveedorlinea.findByLineaNegocioCoNegocio", query = "SELECT p FROM Proveedorlinea p WHERE p.proveedorlineaPK.lineaNegocioCoNegocio = :lineaNegocioCoNegocio"), @NamedQuery(name = "Proveedorlinea.findByProveedorCoProveedor", query = "SELECT p FROM Proveedorlinea p WHERE p.proveedorlineaPK.proveedorCoProveedor = :proveedorCoProveedor")})
public class Proveedorlinea implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProveedorlineaPK proveedorlineaPK;
    @Column(name = "Co_Linea")
    private String coLinea;
    @JoinColumn(name = "LineaNegocio_Co_Negocio", referencedColumnName = "Co_Negocio", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lineanegocio lineanegocio;
    @JoinColumn(name = "Proveedor_Co_Proveedor", referencedColumnName = "Co_Proveedor", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Proveedor proveedor;

    public Proveedorlinea() {
    }

    public Proveedorlinea(ProveedorlineaPK proveedorlineaPK) {
        this.proveedorlineaPK = proveedorlineaPK;
    }

    public Proveedorlinea(int lineaNegocioCoNegocio, int proveedorCoProveedor) {
        this.proveedorlineaPK = new ProveedorlineaPK(lineaNegocioCoNegocio, proveedorCoProveedor);
    }

    public ProveedorlineaPK getProveedorlineaPK() {
        return proveedorlineaPK;
    }

    public void setProveedorlineaPK(ProveedorlineaPK proveedorlineaPK) {
        this.proveedorlineaPK = proveedorlineaPK;
    }

    public String getCoLinea() {
        return coLinea;
    }

    public void setCoLinea(String coLinea) {
        this.coLinea = coLinea;
    }

    public Lineanegocio getLineanegocio() {
        return lineanegocio;
    }

    public void setLineanegocio(Lineanegocio lineanegocio) {
        this.lineanegocio = lineanegocio;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proveedorlineaPK != null ? proveedorlineaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedorlinea)) {
            return false;
        }
        Proveedorlinea other = (Proveedorlinea) object;
        if ((this.proveedorlineaPK == null && other.proveedorlineaPK != null) || (this.proveedorlineaPK != null && !this.proveedorlineaPK.equals(other.proveedorlineaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Proveedorlinea[proveedorlineaPK=" + proveedorlineaPK + "]";
    }

}

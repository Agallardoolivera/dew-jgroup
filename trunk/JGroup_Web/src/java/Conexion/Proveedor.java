/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "proveedor")
@NamedQueries({@NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"), @NamedQuery(name = "Proveedor.findByCoProveedor", query = "SELECT p FROM Proveedor p WHERE p.coProveedor = :coProveedor"), @NamedQuery(name = "Proveedor.findByNuRucProveedor", query = "SELECT p FROM Proveedor p WHERE p.nuRucProveedor = :nuRucProveedor"), @NamedQuery(name = "Proveedor.findByNoRazonSocialProveedor", query = "SELECT p FROM Proveedor p WHERE p.noRazonSocialProveedor = :noRazonSocialProveedor"), @NamedQuery(name = "Proveedor.findByTxCorreoProveedor", query = "SELECT p FROM Proveedor p WHERE p.txCorreoProveedor = :txCorreoProveedor"), @NamedQuery(name = "Proveedor.findByTxClaveAccesoProveedor", query = "SELECT p FROM Proveedor p WHERE p.txClaveAccesoProveedor = :txClaveAccesoProveedor")})
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Co_Proveedor")
    private Integer coProveedor;
    @Column(name = "Nu_RucProveedor")
    private String nuRucProveedor;
    @Column(name = "No_RazonSocialProveedor")
    private String noRazonSocialProveedor;
    @Column(name = "Tx_CorreoProveedor")
    private String txCorreoProveedor;
    @Column(name = "Tx_ClaveAccesoProveedor")
    private String txClaveAccesoProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedorCoProveedor")
    private Collection<Cotizacion> cotizacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
    private Collection<Proveedorlinea> proveedorlineaCollection;

    public Proveedor() {
    }

    public Proveedor(Integer coProveedor) {
        this.coProveedor = coProveedor;
    }

    public Integer getCoProveedor() {
        return coProveedor;
    }

    public void setCoProveedor(Integer coProveedor) {
        this.coProveedor = coProveedor;
    }

    public String getNuRucProveedor() {
        return nuRucProveedor;
    }

    public void setNuRucProveedor(String nuRucProveedor) {
        this.nuRucProveedor = nuRucProveedor;
    }

    public String getNoRazonSocialProveedor() {
        return noRazonSocialProveedor;
    }

    public void setNoRazonSocialProveedor(String noRazonSocialProveedor) {
        this.noRazonSocialProveedor = noRazonSocialProveedor;
    }

    public String getTxCorreoProveedor() {
        return txCorreoProveedor;
    }

    public void setTxCorreoProveedor(String txCorreoProveedor) {
        this.txCorreoProveedor = txCorreoProveedor;
    }

    public String getTxClaveAccesoProveedor() {
        return txClaveAccesoProveedor;
    }

    public void setTxClaveAccesoProveedor(String txClaveAccesoProveedor) {
        this.txClaveAccesoProveedor = txClaveAccesoProveedor;
    }

    public Collection<Cotizacion> getCotizacionCollection() {
        return cotizacionCollection;
    }

    public void setCotizacionCollection(Collection<Cotizacion> cotizacionCollection) {
        this.cotizacionCollection = cotizacionCollection;
    }

    public Collection<Proveedorlinea> getProveedorlineaCollection() {
        return proveedorlineaCollection;
    }

    public void setProveedorlineaCollection(Collection<Proveedorlinea> proveedorlineaCollection) {
        this.proveedorlineaCollection = proveedorlineaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coProveedor != null ? coProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.coProveedor == null && other.coProveedor != null) || (this.coProveedor != null && !this.coProveedor.equals(other.coProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Proveedor[coProveedor=" + coProveedor + "]";
    }

}

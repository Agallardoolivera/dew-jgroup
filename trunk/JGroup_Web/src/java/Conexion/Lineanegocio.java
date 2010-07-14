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
@Table(name = "lineanegocio")
@NamedQueries({@NamedQuery(name = "Lineanegocio.findAll", query = "SELECT l FROM Lineanegocio l"), @NamedQuery(name = "Lineanegocio.findByCoNegocio", query = "SELECT l FROM Lineanegocio l WHERE l.coNegocio = :coNegocio"), @NamedQuery(name = "Lineanegocio.findByTxDescripcion", query = "SELECT l FROM Lineanegocio l WHERE l.txDescripcion = :txDescripcion")})
public class Lineanegocio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Co_Negocio")
    private Integer coNegocio;
    @Column(name = "Tx_Descripcion")
    private String txDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lineanegocio")
    private Collection<Proveedorlinea> proveedorlineaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lineanegocio")
    private Collection<Lineaarticulo> lineaarticuloCollection;

    public Lineanegocio() {
    }

    public Lineanegocio(Integer coNegocio) {
        this.coNegocio = coNegocio;
    }

    public Integer getCoNegocio() {
        return coNegocio;
    }

    public void setCoNegocio(Integer coNegocio) {
        this.coNegocio = coNegocio;
    }

    public String getTxDescripcion() {
        return txDescripcion;
    }

    public void setTxDescripcion(String txDescripcion) {
        this.txDescripcion = txDescripcion;
    }

    public Collection<Proveedorlinea> getProveedorlineaCollection() {
        return proveedorlineaCollection;
    }

    public void setProveedorlineaCollection(Collection<Proveedorlinea> proveedorlineaCollection) {
        this.proveedorlineaCollection = proveedorlineaCollection;
    }

    public Collection<Lineaarticulo> getLineaarticuloCollection() {
        return lineaarticuloCollection;
    }

    public void setLineaarticuloCollection(Collection<Lineaarticulo> lineaarticuloCollection) {
        this.lineaarticuloCollection = lineaarticuloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coNegocio != null ? coNegocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lineanegocio)) {
            return false;
        }
        Lineanegocio other = (Lineanegocio) object;
        if ((this.coNegocio == null && other.coNegocio != null) || (this.coNegocio != null && !this.coNegocio.equals(other.coNegocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Lineanegocio[coNegocio=" + coNegocio + "]";
    }

}

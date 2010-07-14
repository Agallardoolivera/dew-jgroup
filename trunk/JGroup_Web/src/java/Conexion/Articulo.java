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
@Table(name = "articulo")
@NamedQueries({@NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a"), @NamedQuery(name = "Articulo.findByCoArticulo", query = "SELECT a FROM Articulo a WHERE a.coArticulo = :coArticulo"), @NamedQuery(name = "Articulo.findByNoArticulo", query = "SELECT a FROM Articulo a WHERE a.noArticulo = :noArticulo"), @NamedQuery(name = "Articulo.findByUm", query = "SELECT a FROM Articulo a WHERE a.um = :um")})
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Co_Articulo")
    private Integer coArticulo;
    @Column(name = "No_Articulo")
    private String noArticulo;
    @Column(name = "UM")
    private String um;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<Detalleinvitacion> detalleinvitacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<Detalleoc> detalleocCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<Detallecotizacion> detallecotizacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo")
    private Collection<Lineaarticulo> lineaarticuloCollection;

    public Articulo() {
    }

    public Articulo(Integer coArticulo) {
        this.coArticulo = coArticulo;
    }

    public Integer getCoArticulo() {
        return coArticulo;
    }

    public void setCoArticulo(Integer coArticulo) {
        this.coArticulo = coArticulo;
    }

    public String getNoArticulo() {
        return noArticulo;
    }

    public void setNoArticulo(String noArticulo) {
        this.noArticulo = noArticulo;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public Collection<Detalleinvitacion> getDetalleinvitacionCollection() {
        return detalleinvitacionCollection;
    }

    public void setDetalleinvitacionCollection(Collection<Detalleinvitacion> detalleinvitacionCollection) {
        this.detalleinvitacionCollection = detalleinvitacionCollection;
    }

    public Collection<Detalleoc> getDetalleocCollection() {
        return detalleocCollection;
    }

    public void setDetalleocCollection(Collection<Detalleoc> detalleocCollection) {
        this.detalleocCollection = detalleocCollection;
    }

    public Collection<Detallecotizacion> getDetallecotizacionCollection() {
        return detallecotizacionCollection;
    }

    public void setDetallecotizacionCollection(Collection<Detallecotizacion> detallecotizacionCollection) {
        this.detallecotizacionCollection = detallecotizacionCollection;
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
        hash += (coArticulo != null ? coArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.coArticulo == null && other.coArticulo != null) || (this.coArticulo != null && !this.coArticulo.equals(other.coArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Articulo[coArticulo=" + coArticulo + "]";
    }

}

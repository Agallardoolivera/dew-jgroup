/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "cotizacion")
@NamedQueries({@NamedQuery(name = "Cotizacion.findAll", query = "SELECT c FROM Cotizacion c"), @NamedQuery(name = "Cotizacion.findByNuInvitacion", query = "SELECT c FROM Cotizacion c WHERE c.nuInvitacion = :nuInvitacion"), @NamedQuery(name = "Cotizacion.findByFeCotizacion", query = "SELECT c FROM Cotizacion c WHERE c.feCotizacion = :feCotizacion"), @NamedQuery(name = "Cotizacion.findByTxResponsableProveedor", query = "SELECT c FROM Cotizacion c WHERE c.txResponsableProveedor = :txResponsableProveedor"), @NamedQuery(name = "Cotizacion.findByTxEstadoProveedor", query = "SELECT c FROM Cotizacion c WHERE c.txEstadoProveedor = :txEstadoProveedor"), @NamedQuery(name = "Cotizacion.findByNuPuntajeObtenido", query = "SELECT c FROM Cotizacion c WHERE c.nuPuntajeObtenido = :nuPuntajeObtenido"), @NamedQuery(name = "Cotizacion.findByTxGanadora", query = "SELECT c FROM Cotizacion c WHERE c.txGanadora = :txGanadora"), @NamedQuery(name = "Cotizacion.findByNuCotizacion", query = "SELECT c FROM Cotizacion c WHERE c.nuCotizacion = :nuCotizacion")})
public class Cotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Nu_Invitacion")
    private Integer nuInvitacion;
    @Column(name = "Fe_Cotizacion")
    @Temporal(TemporalType.DATE)
    private Date feCotizacion;
    @Column(name = "Tx_ResponsableProveedor")
    private String txResponsableProveedor;
    @Column(name = "Tx_EstadoProveedor")
    private String txEstadoProveedor;
    @Column(name = "Nu_PuntajeObtenido")
    private Integer nuPuntajeObtenido;
    @Column(name = "Tx_Ganadora")
    private String txGanadora;
    @Id
    @Basic(optional = false)
    @Column(name = "Nu_Cotizacion")
    private Integer nuCotizacion;
    @JoinColumn(name = "Invitacion_Nu_Invitacion", referencedColumnName = "Nu_Invitacion")
    @ManyToOne(optional = false)
    private Invitacion invitacionNuInvitacion;
    @JoinColumn(name = "Proveedor_Co_Proveedor", referencedColumnName = "Co_Proveedor")
    @ManyToOne(optional = false)
    private Proveedor proveedorCoProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacion")
    private Collection<Criteriocotizacion> criteriocotizacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cotizacion")
    private Collection<Detallecotizacion> detallecotizacionCollection;

    public Cotizacion() {
    }

    public Cotizacion(Integer nuCotizacion) {
        this.nuCotizacion = nuCotizacion;
    }

    public Integer getNuInvitacion() {
        return nuInvitacion;
    }

    public void setNuInvitacion(Integer nuInvitacion) {
        this.nuInvitacion = nuInvitacion;
    }

    public Date getFeCotizacion() {
        return feCotizacion;
    }

    public void setFeCotizacion(Date feCotizacion) {
        this.feCotizacion = feCotizacion;
    }

    public String getTxResponsableProveedor() {
        return txResponsableProveedor;
    }

    public void setTxResponsableProveedor(String txResponsableProveedor) {
        this.txResponsableProveedor = txResponsableProveedor;
    }

    public String getTxEstadoProveedor() {
        return txEstadoProveedor;
    }

    public void setTxEstadoProveedor(String txEstadoProveedor) {
        this.txEstadoProveedor = txEstadoProveedor;
    }

    public Integer getNuPuntajeObtenido() {
        return nuPuntajeObtenido;
    }

    public void setNuPuntajeObtenido(Integer nuPuntajeObtenido) {
        this.nuPuntajeObtenido = nuPuntajeObtenido;
    }

    public String getTxGanadora() {
        return txGanadora;
    }

    public void setTxGanadora(String txGanadora) {
        this.txGanadora = txGanadora;
    }

    public Integer getNuCotizacion() {
        return nuCotizacion;
    }

    public void setNuCotizacion(Integer nuCotizacion) {
        this.nuCotizacion = nuCotizacion;
    }

    public Invitacion getInvitacionNuInvitacion() {
        return invitacionNuInvitacion;
    }

    public void setInvitacionNuInvitacion(Invitacion invitacionNuInvitacion) {
        this.invitacionNuInvitacion = invitacionNuInvitacion;
    }

    public Proveedor getProveedorCoProveedor() {
        return proveedorCoProveedor;
    }

    public void setProveedorCoProveedor(Proveedor proveedorCoProveedor) {
        this.proveedorCoProveedor = proveedorCoProveedor;
    }

    public Collection<Criteriocotizacion> getCriteriocotizacionCollection() {
        return criteriocotizacionCollection;
    }

    public void setCriteriocotizacionCollection(Collection<Criteriocotizacion> criteriocotizacionCollection) {
        this.criteriocotizacionCollection = criteriocotizacionCollection;
    }

    public Collection<Detallecotizacion> getDetallecotizacionCollection() {
        return detallecotizacionCollection;
    }

    public void setDetallecotizacionCollection(Collection<Detallecotizacion> detallecotizacionCollection) {
        this.detallecotizacionCollection = detallecotizacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nuCotizacion != null ? nuCotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacion)) {
            return false;
        }
        Cotizacion other = (Cotizacion) object;
        if ((this.nuCotizacion == null && other.nuCotizacion != null) || (this.nuCotizacion != null && !this.nuCotizacion.equals(other.nuCotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Cotizacion[nuCotizacion=" + nuCotizacion + "]";
    }

}

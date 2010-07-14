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
@Table(name = "invitacion")
@NamedQueries({@NamedQuery(name = "Invitacion.findAll", query = "SELECT i FROM Invitacion i"), @NamedQuery(name = "Invitacion.findByNuInvitacion", query = "SELECT i FROM Invitacion i WHERE i.nuInvitacion = :nuInvitacion"), @NamedQuery(name = "Invitacion.findByFeInvitacion", query = "SELECT i FROM Invitacion i WHERE i.feInvitacion = :feInvitacion"), @NamedQuery(name = "Invitacion.findByTxGeneradorUsuario", query = "SELECT i FROM Invitacion i WHERE i.txGeneradorUsuario = :txGeneradorUsuario"), @NamedQuery(name = "Invitacion.findByTxDescripcion", query = "SELECT i FROM Invitacion i WHERE i.txDescripcion = :txDescripcion")})
public class Invitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nu_Invitacion")
    private Integer nuInvitacion;
    @Column(name = "Fe_Invitacion")
    @Temporal(TemporalType.DATE)
    private Date feInvitacion;
    @Column(name = "Tx_GeneradorUsuario")
    private String txGeneradorUsuario;
    @Column(name = "Tx_Descripcion")
    private String txDescripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invitacionNuInvitacion")
    private Collection<Cotizacion> cotizacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invitacion")
    private Collection<Detalleinvitacion> detalleinvitacionCollection;
    @JoinColumn(name = "Usuario_Co_Usuario", referencedColumnName = "Co_Usuario")
    @ManyToOne(optional = false)
    private Usuario usuarioCoUsuario;
    @JoinColumn(name = "OrdenCompra_Nu_OrdenCompra", referencedColumnName = "Nu_OrdenCompra")
    @ManyToOne
    private Ordencompra ordenCompraNuOrdenCompra;

    public Invitacion() {
    }

    public Invitacion(Integer nuInvitacion) {
        this.nuInvitacion = nuInvitacion;
    }

    public Integer getNuInvitacion() {
        return nuInvitacion;
    }

    public void setNuInvitacion(Integer nuInvitacion) {
        this.nuInvitacion = nuInvitacion;
    }

    public Date getFeInvitacion() {
        return feInvitacion;
    }

    public void setFeInvitacion(Date feInvitacion) {
        this.feInvitacion = feInvitacion;
    }

    public String getTxGeneradorUsuario() {
        return txGeneradorUsuario;
    }

    public void setTxGeneradorUsuario(String txGeneradorUsuario) {
        this.txGeneradorUsuario = txGeneradorUsuario;
    }

    public String getTxDescripcion() {
        return txDescripcion;
    }

    public void setTxDescripcion(String txDescripcion) {
        this.txDescripcion = txDescripcion;
    }

    public Collection<Cotizacion> getCotizacionCollection() {
        return cotizacionCollection;
    }

    public void setCotizacionCollection(Collection<Cotizacion> cotizacionCollection) {
        this.cotizacionCollection = cotizacionCollection;
    }

    public Collection<Detalleinvitacion> getDetalleinvitacionCollection() {
        return detalleinvitacionCollection;
    }

    public void setDetalleinvitacionCollection(Collection<Detalleinvitacion> detalleinvitacionCollection) {
        this.detalleinvitacionCollection = detalleinvitacionCollection;
    }

    public Usuario getUsuarioCoUsuario() {
        return usuarioCoUsuario;
    }

    public void setUsuarioCoUsuario(Usuario usuarioCoUsuario) {
        this.usuarioCoUsuario = usuarioCoUsuario;
    }

    public Ordencompra getOrdenCompraNuOrdenCompra() {
        return ordenCompraNuOrdenCompra;
    }

    public void setOrdenCompraNuOrdenCompra(Ordencompra ordenCompraNuOrdenCompra) {
        this.ordenCompraNuOrdenCompra = ordenCompraNuOrdenCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nuInvitacion != null ? nuInvitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invitacion)) {
            return false;
        }
        Invitacion other = (Invitacion) object;
        if ((this.nuInvitacion == null && other.nuInvitacion != null) || (this.nuInvitacion != null && !this.nuInvitacion.equals(other.nuInvitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Invitacion[nuInvitacion=" + nuInvitacion + "]";
    }

}

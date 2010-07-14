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
@Table(name = "detalleinvitacion")
@NamedQueries({@NamedQuery(name = "Detalleinvitacion.findAll", query = "SELECT d FROM Detalleinvitacion d"), @NamedQuery(name = "Detalleinvitacion.findByNuItem", query = "SELECT d FROM Detalleinvitacion d WHERE d.nuItem = :nuItem"), @NamedQuery(name = "Detalleinvitacion.findByCoDetalleInvitacion", query = "SELECT d FROM Detalleinvitacion d WHERE d.coDetalleInvitacion = :coDetalleInvitacion"), @NamedQuery(name = "Detalleinvitacion.findByNuCantidad", query = "SELECT d FROM Detalleinvitacion d WHERE d.nuCantidad = :nuCantidad"), @NamedQuery(name = "Detalleinvitacion.findByTxObservacion", query = "SELECT d FROM Detalleinvitacion d WHERE d.txObservacion = :txObservacion"), @NamedQuery(name = "Detalleinvitacion.findByInvitacionNuInvitacion", query = "SELECT d FROM Detalleinvitacion d WHERE d.detalleinvitacionPK.invitacionNuInvitacion = :invitacionNuInvitacion"), @NamedQuery(name = "Detalleinvitacion.findByArticuloCoArticulo", query = "SELECT d FROM Detalleinvitacion d WHERE d.detalleinvitacionPK.articuloCoArticulo = :articuloCoArticulo")})
public class Detalleinvitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleinvitacionPK detalleinvitacionPK;
    @Column(name = "Nu_Item")
    private Integer nuItem;
    @Column(name = "Co_DetalleInvitacion")
    private String coDetalleInvitacion;
    @Column(name = "Nu_Cantidad")
    private Integer nuCantidad;
    @Column(name = "Tx_Observacion")
    private String txObservacion;
    @JoinColumn(name = "Invitacion_Nu_Invitacion", referencedColumnName = "Nu_Invitacion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invitacion invitacion;
    @JoinColumn(name = "Articulo_Co_Articulo", referencedColumnName = "Co_Articulo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Detalleinvitacion() {
    }

    public Detalleinvitacion(DetalleinvitacionPK detalleinvitacionPK) {
        this.detalleinvitacionPK = detalleinvitacionPK;
    }

    public Detalleinvitacion(int invitacionNuInvitacion, int articuloCoArticulo) {
        this.detalleinvitacionPK = new DetalleinvitacionPK(invitacionNuInvitacion, articuloCoArticulo);
    }

    public DetalleinvitacionPK getDetalleinvitacionPK() {
        return detalleinvitacionPK;
    }

    public void setDetalleinvitacionPK(DetalleinvitacionPK detalleinvitacionPK) {
        this.detalleinvitacionPK = detalleinvitacionPK;
    }

    public Integer getNuItem() {
        return nuItem;
    }

    public void setNuItem(Integer nuItem) {
        this.nuItem = nuItem;
    }

    public String getCoDetalleInvitacion() {
        return coDetalleInvitacion;
    }

    public void setCoDetalleInvitacion(String coDetalleInvitacion) {
        this.coDetalleInvitacion = coDetalleInvitacion;
    }

    public Integer getNuCantidad() {
        return nuCantidad;
    }

    public void setNuCantidad(Integer nuCantidad) {
        this.nuCantidad = nuCantidad;
    }

    public String getTxObservacion() {
        return txObservacion;
    }

    public void setTxObservacion(String txObservacion) {
        this.txObservacion = txObservacion;
    }

    public Invitacion getInvitacion() {
        return invitacion;
    }

    public void setInvitacion(Invitacion invitacion) {
        this.invitacion = invitacion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleinvitacionPK != null ? detalleinvitacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleinvitacion)) {
            return false;
        }
        Detalleinvitacion other = (Detalleinvitacion) object;
        if ((this.detalleinvitacionPK == null && other.detalleinvitacionPK != null) || (this.detalleinvitacionPK != null && !this.detalleinvitacionPK.equals(other.detalleinvitacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Detalleinvitacion[detalleinvitacionPK=" + detalleinvitacionPK + "]";
    }

}

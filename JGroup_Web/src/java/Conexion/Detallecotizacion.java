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
@Table(name = "detallecotizacion")
@NamedQueries({@NamedQuery(name = "Detallecotizacion.findAll", query = "SELECT d FROM Detallecotizacion d"), @NamedQuery(name = "Detallecotizacion.findByCoInvitacion", query = "SELECT d FROM Detallecotizacion d WHERE d.coInvitacion = :coInvitacion"), @NamedQuery(name = "Detallecotizacion.findByNuCantidad", query = "SELECT d FROM Detallecotizacion d WHERE d.nuCantidad = :nuCantidad"), @NamedQuery(name = "Detallecotizacion.findBySsPrecioUnitario", query = "SELECT d FROM Detallecotizacion d WHERE d.ssPrecioUnitario = :ssPrecioUnitario"), @NamedQuery(name = "Detallecotizacion.findByCotizacionNuCotizacion", query = "SELECT d FROM Detallecotizacion d WHERE d.detallecotizacionPK.cotizacionNuCotizacion = :cotizacionNuCotizacion"), @NamedQuery(name = "Detallecotizacion.findByArticuloCoArticulo", query = "SELECT d FROM Detallecotizacion d WHERE d.detallecotizacionPK.articuloCoArticulo = :articuloCoArticulo")})
public class Detallecotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallecotizacionPK detallecotizacionPK;
    @Column(name = "Co_Invitacion")
    private String coInvitacion;
    @Column(name = "Nu_Cantidad")
    private Integer nuCantidad;
    @Column(name = "Ss_PrecioUnitario")
    private Double ssPrecioUnitario;
    @JoinColumn(name = "Cotizacion_Nu_Cotizacion", referencedColumnName = "Nu_Cotizacion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cotizacion cotizacion;
    @JoinColumn(name = "Articulo_Co_Articulo", referencedColumnName = "Co_Articulo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Detallecotizacion() {
    }

    public Detallecotizacion(DetallecotizacionPK detallecotizacionPK) {
        this.detallecotizacionPK = detallecotizacionPK;
    }

    public Detallecotizacion(int cotizacionNuCotizacion, int articuloCoArticulo) {
        this.detallecotizacionPK = new DetallecotizacionPK(cotizacionNuCotizacion, articuloCoArticulo);
    }

    public DetallecotizacionPK getDetallecotizacionPK() {
        return detallecotizacionPK;
    }

    public void setDetallecotizacionPK(DetallecotizacionPK detallecotizacionPK) {
        this.detallecotizacionPK = detallecotizacionPK;
    }

    public String getCoInvitacion() {
        return coInvitacion;
    }

    public void setCoInvitacion(String coInvitacion) {
        this.coInvitacion = coInvitacion;
    }

    public Integer getNuCantidad() {
        return nuCantidad;
    }

    public void setNuCantidad(Integer nuCantidad) {
        this.nuCantidad = nuCantidad;
    }

    public Double getSsPrecioUnitario() {
        return ssPrecioUnitario;
    }

    public void setSsPrecioUnitario(Double ssPrecioUnitario) {
        this.ssPrecioUnitario = ssPrecioUnitario;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
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
        hash += (detallecotizacionPK != null ? detallecotizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecotizacion)) {
            return false;
        }
        Detallecotizacion other = (Detallecotizacion) object;
        if ((this.detallecotizacionPK == null && other.detallecotizacionPK != null) || (this.detallecotizacionPK != null && !this.detallecotizacionPK.equals(other.detallecotizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Detallecotizacion[detallecotizacionPK=" + detallecotizacionPK + "]";
    }

}

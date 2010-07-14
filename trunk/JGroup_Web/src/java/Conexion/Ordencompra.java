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
@Table(name = "ordencompra")
@NamedQueries({@NamedQuery(name = "Ordencompra.findAll", query = "SELECT o FROM Ordencompra o"), @NamedQuery(name = "Ordencompra.findByNuOrdenCompra", query = "SELECT o FROM Ordencompra o WHERE o.nuOrdenCompra = :nuOrdenCompra"), @NamedQuery(name = "Ordencompra.findByNuCotizacion", query = "SELECT o FROM Ordencompra o WHERE o.nuCotizacion = :nuCotizacion"), @NamedQuery(name = "Ordencompra.findBySsSubTotal", query = "SELECT o FROM Ordencompra o WHERE o.ssSubTotal = :ssSubTotal"), @NamedQuery(name = "Ordencompra.findByTxCondicionPago", query = "SELECT o FROM Ordencompra o WHERE o.txCondicionPago = :txCondicionPago"), @NamedQuery(name = "Ordencompra.findByFeEntrega", query = "SELECT o FROM Ordencompra o WHERE o.feEntrega = :feEntrega"), @NamedQuery(name = "Ordencompra.findByTxObservacion", query = "SELECT o FROM Ordencompra o WHERE o.txObservacion = :txObservacion")})
public class Ordencompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nu_OrdenCompra")
    private Integer nuOrdenCompra;
    @Column(name = "Nu_Cotizacion")
    private Integer nuCotizacion;
    @Column(name = "Ss_SubTotal")
    private Double ssSubTotal;
    @Column(name = "Tx_CondicionPago")
    private String txCondicionPago;
    @Column(name = "Fe_Entrega")
    @Temporal(TemporalType.DATE)
    private Date feEntrega;
    @Column(name = "Tx_Observacion")
    private String txObservacion;
    @OneToMany(mappedBy = "ordenCompraNuOrdenCompra")
    private Collection<Invitacion> invitacionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordencompra")
    private Collection<Detalleoc> detalleocCollection;

    public Ordencompra() {
    }

    public Ordencompra(Integer nuOrdenCompra) {
        this.nuOrdenCompra = nuOrdenCompra;
    }

    public Integer getNuOrdenCompra() {
        return nuOrdenCompra;
    }

    public void setNuOrdenCompra(Integer nuOrdenCompra) {
        this.nuOrdenCompra = nuOrdenCompra;
    }

    public Integer getNuCotizacion() {
        return nuCotizacion;
    }

    public void setNuCotizacion(Integer nuCotizacion) {
        this.nuCotizacion = nuCotizacion;
    }

    public Double getSsSubTotal() {
        return ssSubTotal;
    }

    public void setSsSubTotal(Double ssSubTotal) {
        this.ssSubTotal = ssSubTotal;
    }

    public String getTxCondicionPago() {
        return txCondicionPago;
    }

    public void setTxCondicionPago(String txCondicionPago) {
        this.txCondicionPago = txCondicionPago;
    }

    public Date getFeEntrega() {
        return feEntrega;
    }

    public void setFeEntrega(Date feEntrega) {
        this.feEntrega = feEntrega;
    }

    public String getTxObservacion() {
        return txObservacion;
    }

    public void setTxObservacion(String txObservacion) {
        this.txObservacion = txObservacion;
    }

    public Collection<Invitacion> getInvitacionCollection() {
        return invitacionCollection;
    }

    public void setInvitacionCollection(Collection<Invitacion> invitacionCollection) {
        this.invitacionCollection = invitacionCollection;
    }

    public Collection<Detalleoc> getDetalleocCollection() {
        return detalleocCollection;
    }

    public void setDetalleocCollection(Collection<Detalleoc> detalleocCollection) {
        this.detalleocCollection = detalleocCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nuOrdenCompra != null ? nuOrdenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordencompra)) {
            return false;
        }
        Ordencompra other = (Ordencompra) object;
        if ((this.nuOrdenCompra == null && other.nuOrdenCompra != null) || (this.nuOrdenCompra != null && !this.nuOrdenCompra.equals(other.nuOrdenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Ordencompra[nuOrdenCompra=" + nuOrdenCompra + "]";
    }

}

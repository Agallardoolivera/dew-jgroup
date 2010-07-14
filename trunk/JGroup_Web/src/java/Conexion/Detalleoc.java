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
@Table(name = "detalleoc")
@NamedQueries({@NamedQuery(name = "Detalleoc.findAll", query = "SELECT d FROM Detalleoc d"), @NamedQuery(name = "Detalleoc.findByNuItem", query = "SELECT d FROM Detalleoc d WHERE d.nuItem = :nuItem"), @NamedQuery(name = "Detalleoc.findByCoArticulo", query = "SELECT d FROM Detalleoc d WHERE d.coArticulo = :coArticulo"), @NamedQuery(name = "Detalleoc.findBySsPrecioArticulo", query = "SELECT d FROM Detalleoc d WHERE d.ssPrecioArticulo = :ssPrecioArticulo"), @NamedQuery(name = "Detalleoc.findByOrdenCompraNuOrdenCompra", query = "SELECT d FROM Detalleoc d WHERE d.detalleocPK.ordenCompraNuOrdenCompra = :ordenCompraNuOrdenCompra"), @NamedQuery(name = "Detalleoc.findByArticuloCoArticulo", query = "SELECT d FROM Detalleoc d WHERE d.detalleocPK.articuloCoArticulo = :articuloCoArticulo")})
public class Detalleoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleocPK detalleocPK;
    @Column(name = "Nu_Item")
    private Integer nuItem;
    @Column(name = "Co_Articulo")
    private String coArticulo;
    @Column(name = "Ss_PrecioArticulo")
    private Double ssPrecioArticulo;
    @JoinColumn(name = "OrdenCompra_Nu_OrdenCompra", referencedColumnName = "Nu_OrdenCompra", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ordencompra ordencompra;
    @JoinColumn(name = "Articulo_Co_Articulo", referencedColumnName = "Co_Articulo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Detalleoc() {
    }

    public Detalleoc(DetalleocPK detalleocPK) {
        this.detalleocPK = detalleocPK;
    }

    public Detalleoc(int ordenCompraNuOrdenCompra, int articuloCoArticulo) {
        this.detalleocPK = new DetalleocPK(ordenCompraNuOrdenCompra, articuloCoArticulo);
    }

    public DetalleocPK getDetalleocPK() {
        return detalleocPK;
    }

    public void setDetalleocPK(DetalleocPK detalleocPK) {
        this.detalleocPK = detalleocPK;
    }

    public Integer getNuItem() {
        return nuItem;
    }

    public void setNuItem(Integer nuItem) {
        this.nuItem = nuItem;
    }

    public String getCoArticulo() {
        return coArticulo;
    }

    public void setCoArticulo(String coArticulo) {
        this.coArticulo = coArticulo;
    }

    public Double getSsPrecioArticulo() {
        return ssPrecioArticulo;
    }

    public void setSsPrecioArticulo(Double ssPrecioArticulo) {
        this.ssPrecioArticulo = ssPrecioArticulo;
    }

    public Ordencompra getOrdencompra() {
        return ordencompra;
    }

    public void setOrdencompra(Ordencompra ordencompra) {
        this.ordencompra = ordencompra;
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
        hash += (detalleocPK != null ? detalleocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleoc)) {
            return false;
        }
        Detalleoc other = (Detalleoc) object;
        if ((this.detalleocPK == null && other.detalleocPK != null) || (this.detalleocPK != null && !this.detalleocPK.equals(other.detalleocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Detalleoc[detalleocPK=" + detalleocPK + "]";
    }

}

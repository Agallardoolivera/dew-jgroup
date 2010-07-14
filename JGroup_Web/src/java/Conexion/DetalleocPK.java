/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Oscar
 */
@Embeddable
public class DetalleocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "OrdenCompra_Nu_OrdenCompra")
    private int ordenCompraNuOrdenCompra;
    @Basic(optional = false)
    @Column(name = "Articulo_Co_Articulo")
    private int articuloCoArticulo;

    public DetalleocPK(int ordenCompraNuOrdenCompra, int articuloCoArticulo) {
        this.ordenCompraNuOrdenCompra = ordenCompraNuOrdenCompra;
        this.articuloCoArticulo = articuloCoArticulo;
    }

    public int getOrdenCompraNuOrdenCompra() {
        return ordenCompraNuOrdenCompra;
    }

    public void setOrdenCompraNuOrdenCompra(int ordenCompraNuOrdenCompra) {
        this.ordenCompraNuOrdenCompra = ordenCompraNuOrdenCompra;
    }

    public int getArticuloCoArticulo() {
        return articuloCoArticulo;
    }

    public void setArticuloCoArticulo(int articuloCoArticulo) {
        this.articuloCoArticulo = articuloCoArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordenCompraNuOrdenCompra;
        hash += (int) articuloCoArticulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleocPK)) {
            return false;
        }
        DetalleocPK other = (DetalleocPK) object;
        if (this.ordenCompraNuOrdenCompra != other.ordenCompraNuOrdenCompra) {
            return false;
        }
        if (this.articuloCoArticulo != other.articuloCoArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.DetalleocPK[ordenCompraNuOrdenCompra=" + ordenCompraNuOrdenCompra + ", articuloCoArticulo=" + articuloCoArticulo + "]";
    }

}

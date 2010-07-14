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
public class DetallecotizacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Cotizacion_Nu_Cotizacion")
    private int cotizacionNuCotizacion;
    @Basic(optional = false)
    @Column(name = "Articulo_Co_Articulo")
    private int articuloCoArticulo;

    public DetallecotizacionPK(int cotizacionNuCotizacion, int articuloCoArticulo) {
        this.cotizacionNuCotizacion = cotizacionNuCotizacion;
        this.articuloCoArticulo = articuloCoArticulo;
    }

    public int getCotizacionNuCotizacion() {
        return cotizacionNuCotizacion;
    }

    public void setCotizacionNuCotizacion(int cotizacionNuCotizacion) {
        this.cotizacionNuCotizacion = cotizacionNuCotizacion;
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
        hash += (int) cotizacionNuCotizacion;
        hash += (int) articuloCoArticulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallecotizacionPK)) {
            return false;
        }
        DetallecotizacionPK other = (DetallecotizacionPK) object;
        if (this.cotizacionNuCotizacion != other.cotizacionNuCotizacion) {
            return false;
        }
        if (this.articuloCoArticulo != other.articuloCoArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.DetallecotizacionPK[cotizacionNuCotizacion=" + cotizacionNuCotizacion + ", articuloCoArticulo=" + articuloCoArticulo + "]";
    }

}

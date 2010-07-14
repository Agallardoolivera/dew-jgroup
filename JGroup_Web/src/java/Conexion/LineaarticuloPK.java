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
public class LineaarticuloPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LineaNegocio_Co_Negocio")
    private int lineaNegocioCoNegocio;
    @Basic(optional = false)
    @Column(name = "Articulo_Co_Articulo")
    private int articuloCoArticulo;

    public LineaarticuloPK(int lineaNegocioCoNegocio, int articuloCoArticulo) {
        this.lineaNegocioCoNegocio = lineaNegocioCoNegocio;
        this.articuloCoArticulo = articuloCoArticulo;
    }

    public int getLineaNegocioCoNegocio() {
        return lineaNegocioCoNegocio;
    }

    public void setLineaNegocioCoNegocio(int lineaNegocioCoNegocio) {
        this.lineaNegocioCoNegocio = lineaNegocioCoNegocio;
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
        hash += (int) lineaNegocioCoNegocio;
        hash += (int) articuloCoArticulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaarticuloPK)) {
            return false;
        }
        LineaarticuloPK other = (LineaarticuloPK) object;
        if (this.lineaNegocioCoNegocio != other.lineaNegocioCoNegocio) {
            return false;
        }
        if (this.articuloCoArticulo != other.articuloCoArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.LineaarticuloPK[lineaNegocioCoNegocio=" + lineaNegocioCoNegocio + ", articuloCoArticulo=" + articuloCoArticulo + "]";
    }

}

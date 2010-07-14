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
@Table(name = "lineaarticulo")
@NamedQueries({@NamedQuery(name = "Lineaarticulo.findAll", query = "SELECT l FROM Lineaarticulo l"), @NamedQuery(name = "Lineaarticulo.findByCoLinea", query = "SELECT l FROM Lineaarticulo l WHERE l.coLinea = :coLinea"), @NamedQuery(name = "Lineaarticulo.findByLineaNegocioCoNegocio", query = "SELECT l FROM Lineaarticulo l WHERE l.lineaarticuloPK.lineaNegocioCoNegocio = :lineaNegocioCoNegocio"), @NamedQuery(name = "Lineaarticulo.findByArticuloCoArticulo", query = "SELECT l FROM Lineaarticulo l WHERE l.lineaarticuloPK.articuloCoArticulo = :articuloCoArticulo")})
public class Lineaarticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LineaarticuloPK lineaarticuloPK;
    @Column(name = "Co_Linea")
    private String coLinea;
    @JoinColumn(name = "LineaNegocio_Co_Negocio", referencedColumnName = "Co_Negocio", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Lineanegocio lineanegocio;
    @JoinColumn(name = "Articulo_Co_Articulo", referencedColumnName = "Co_Articulo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;

    public Lineaarticulo() {
    }

    public Lineaarticulo(LineaarticuloPK lineaarticuloPK) {
        this.lineaarticuloPK = lineaarticuloPK;
    }

    public Lineaarticulo(int lineaNegocioCoNegocio, int articuloCoArticulo) {
        this.lineaarticuloPK = new LineaarticuloPK(lineaNegocioCoNegocio, articuloCoArticulo);
    }

    public LineaarticuloPK getLineaarticuloPK() {
        return lineaarticuloPK;
    }

    public void setLineaarticuloPK(LineaarticuloPK lineaarticuloPK) {
        this.lineaarticuloPK = lineaarticuloPK;
    }

    public String getCoLinea() {
        return coLinea;
    }

    public void setCoLinea(String coLinea) {
        this.coLinea = coLinea;
    }

    public Lineanegocio getLineanegocio() {
        return lineanegocio;
    }

    public void setLineanegocio(Lineanegocio lineanegocio) {
        this.lineanegocio = lineanegocio;
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
        hash += (lineaarticuloPK != null ? lineaarticuloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lineaarticulo)) {
            return false;
        }
        Lineaarticulo other = (Lineaarticulo) object;
        if ((this.lineaarticuloPK == null && other.lineaarticuloPK != null) || (this.lineaarticuloPK != null && !this.lineaarticuloPK.equals(other.lineaarticuloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Lineaarticulo[lineaarticuloPK=" + lineaarticuloPK + "]";
    }

}

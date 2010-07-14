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
@Table(name = "criteriocotizacion")
@NamedQueries({@NamedQuery(name = "Criteriocotizacion.findAll", query = "SELECT c FROM Criteriocotizacion c"), @NamedQuery(name = "Criteriocotizacion.findByNuValorCotizacion", query = "SELECT c FROM Criteriocotizacion c WHERE c.nuValorCotizacion = :nuValorCotizacion"), @NamedQuery(name = "Criteriocotizacion.findByCriterioEvaluacionCoCriterio", query = "SELECT c FROM Criteriocotizacion c WHERE c.criteriocotizacionPK.criterioEvaluacionCoCriterio = :criterioEvaluacionCoCriterio"), @NamedQuery(name = "Criteriocotizacion.findByCotizacionNuCotizacion", query = "SELECT c FROM Criteriocotizacion c WHERE c.criteriocotizacionPK.cotizacionNuCotizacion = :cotizacionNuCotizacion")})
public class Criteriocotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CriteriocotizacionPK criteriocotizacionPK;
    @Column(name = "Nu_ValorCotizacion")
    private Integer nuValorCotizacion;
    @JoinColumn(name = "CriterioEvaluacion_Co_Criterio", referencedColumnName = "Co_Criterio", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Criterioevaluacion criterioevaluacion;
    @JoinColumn(name = "Cotizacion_Nu_Cotizacion", referencedColumnName = "Nu_Cotizacion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cotizacion cotizacion;

    public Criteriocotizacion() {
    }

    public Criteriocotizacion(CriteriocotizacionPK criteriocotizacionPK) {
        this.criteriocotizacionPK = criteriocotizacionPK;
    }

    public Criteriocotizacion(int criterioEvaluacionCoCriterio, int cotizacionNuCotizacion) {
        this.criteriocotizacionPK = new CriteriocotizacionPK(criterioEvaluacionCoCriterio, cotizacionNuCotizacion);
    }

    public CriteriocotizacionPK getCriteriocotizacionPK() {
        return criteriocotizacionPK;
    }

    public void setCriteriocotizacionPK(CriteriocotizacionPK criteriocotizacionPK) {
        this.criteriocotizacionPK = criteriocotizacionPK;
    }

    public Integer getNuValorCotizacion() {
        return nuValorCotizacion;
    }

    public void setNuValorCotizacion(Integer nuValorCotizacion) {
        this.nuValorCotizacion = nuValorCotizacion;
    }

    public Criterioevaluacion getCriterioevaluacion() {
        return criterioevaluacion;
    }

    public void setCriterioevaluacion(Criterioevaluacion criterioevaluacion) {
        this.criterioevaluacion = criterioevaluacion;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (criteriocotizacionPK != null ? criteriocotizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criteriocotizacion)) {
            return false;
        }
        Criteriocotizacion other = (Criteriocotizacion) object;
        if ((this.criteriocotizacionPK == null && other.criteriocotizacionPK != null) || (this.criteriocotizacionPK != null && !this.criteriocotizacionPK.equals(other.criteriocotizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Criteriocotizacion[criteriocotizacionPK=" + criteriocotizacionPK + "]";
    }

}

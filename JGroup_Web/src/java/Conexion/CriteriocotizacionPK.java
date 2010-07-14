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
public class CriteriocotizacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CriterioEvaluacion_Co_Criterio")
    private int criterioEvaluacionCoCriterio;
    @Basic(optional = false)
    @Column(name = "Cotizacion_Nu_Cotizacion")
    private int cotizacionNuCotizacion;

    public CriteriocotizacionPK(int criterioEvaluacionCoCriterio, int cotizacionNuCotizacion) {
        this.criterioEvaluacionCoCriterio = criterioEvaluacionCoCriterio;
        this.cotizacionNuCotizacion = cotizacionNuCotizacion;
    }

    public int getCriterioEvaluacionCoCriterio() {
        return criterioEvaluacionCoCriterio;
    }

    public void setCriterioEvaluacionCoCriterio(int criterioEvaluacionCoCriterio) {
        this.criterioEvaluacionCoCriterio = criterioEvaluacionCoCriterio;
    }

    public int getCotizacionNuCotizacion() {
        return cotizacionNuCotizacion;
    }

    public void setCotizacionNuCotizacion(int cotizacionNuCotizacion) {
        this.cotizacionNuCotizacion = cotizacionNuCotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) criterioEvaluacionCoCriterio;
        hash += (int) cotizacionNuCotizacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CriteriocotizacionPK)) {
            return false;
        }
        CriteriocotizacionPK other = (CriteriocotizacionPK) object;
        if (this.criterioEvaluacionCoCriterio != other.criterioEvaluacionCoCriterio) {
            return false;
        }
        if (this.cotizacionNuCotizacion != other.cotizacionNuCotizacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.CriteriocotizacionPK[criterioEvaluacionCoCriterio=" + criterioEvaluacionCoCriterio + ", cotizacionNuCotizacion=" + cotizacionNuCotizacion + "]";
    }

}

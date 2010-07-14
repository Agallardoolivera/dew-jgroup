/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oscar
 */
@Entity
@Table(name = "criterioevaluacion")
@NamedQueries({@NamedQuery(name = "Criterioevaluacion.findAll", query = "SELECT c FROM Criterioevaluacion c"), @NamedQuery(name = "Criterioevaluacion.findByCoCriterio", query = "SELECT c FROM Criterioevaluacion c WHERE c.coCriterio = :coCriterio"), @NamedQuery(name = "Criterioevaluacion.findByTxDescCriterioEvaluacion", query = "SELECT c FROM Criterioevaluacion c WHERE c.txDescCriterioEvaluacion = :txDescCriterioEvaluacion"), @NamedQuery(name = "Criterioevaluacion.findByNuPuntaje", query = "SELECT c FROM Criterioevaluacion c WHERE c.nuPuntaje = :nuPuntaje"), @NamedQuery(name = "Criterioevaluacion.findByTipoDato", query = "SELECT c FROM Criterioevaluacion c WHERE c.tipoDato = :tipoDato")})
public class Criterioevaluacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Co_Criterio")
    private Integer coCriterio;
    @Column(name = "Tx_DescCriterioEvaluacion")
    private String txDescCriterioEvaluacion;
    @Column(name = "Nu_Puntaje")
    private Double nuPuntaje;
    @Column(name = "Tipo_Dato")
    private String tipoDato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "criterioevaluacion")
    private Collection<Criteriocotizacion> criteriocotizacionCollection;

    public Criterioevaluacion() {
    }

    public Criterioevaluacion(Integer coCriterio) {
        this.coCriterio = coCriterio;
    }

    public Integer getCoCriterio() {
        return coCriterio;
    }

    public void setCoCriterio(Integer coCriterio) {
        this.coCriterio = coCriterio;
    }

    public String getTxDescCriterioEvaluacion() {
        return txDescCriterioEvaluacion;
    }

    public void setTxDescCriterioEvaluacion(String txDescCriterioEvaluacion) {
        this.txDescCriterioEvaluacion = txDescCriterioEvaluacion;
    }

    public Double getNuPuntaje() {
        return nuPuntaje;
    }

    public void setNuPuntaje(Double nuPuntaje) {
        this.nuPuntaje = nuPuntaje;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Collection<Criteriocotizacion> getCriteriocotizacionCollection() {
        return criteriocotizacionCollection;
    }

    public void setCriteriocotizacionCollection(Collection<Criteriocotizacion> criteriocotizacionCollection) {
        this.criteriocotizacionCollection = criteriocotizacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coCriterio != null ? coCriterio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criterioevaluacion)) {
            return false;
        }
        Criterioevaluacion other = (Criterioevaluacion) object;
        if ((this.coCriterio == null && other.coCriterio != null) || (this.coCriterio != null && !this.coCriterio.equals(other.coCriterio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.Criterioevaluacion[coCriterio=" + coCriterio + "]";
    }

}

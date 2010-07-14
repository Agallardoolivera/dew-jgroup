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
public class DetalleinvitacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Invitacion_Nu_Invitacion")
    private int invitacionNuInvitacion;
    @Basic(optional = false)
    @Column(name = "Articulo_Co_Articulo")
    private int articuloCoArticulo;

    public DetalleinvitacionPK(int invitacionNuInvitacion, int articuloCoArticulo) {
        this.invitacionNuInvitacion = invitacionNuInvitacion;
        this.articuloCoArticulo = articuloCoArticulo;
    }

    public int getInvitacionNuInvitacion() {
        return invitacionNuInvitacion;
    }

    public void setInvitacionNuInvitacion(int invitacionNuInvitacion) {
        this.invitacionNuInvitacion = invitacionNuInvitacion;
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
        hash += (int) invitacionNuInvitacion;
        hash += (int) articuloCoArticulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleinvitacionPK)) {
            return false;
        }
        DetalleinvitacionPK other = (DetalleinvitacionPK) object;
        if (this.invitacionNuInvitacion != other.invitacionNuInvitacion) {
            return false;
        }
        if (this.articuloCoArticulo != other.articuloCoArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.DetalleinvitacionPK[invitacionNuInvitacion=" + invitacionNuInvitacion + ", articuloCoArticulo=" + articuloCoArticulo + "]";
    }

}

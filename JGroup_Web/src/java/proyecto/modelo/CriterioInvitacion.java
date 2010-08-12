/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class CriterioInvitacion {


    private int criterioevaluacion_Co_Criterio;
    private int invitacion_Nu_Invitacion;
    private int Nu_puntaje;

    
    public CriterioInvitacion(){

    }

    public int getNu_puntaje() {
        return Nu_puntaje;
    }

    public void setNu_puntaje(int Nu_puntaje) {
        this.Nu_puntaje = Nu_puntaje;
    }

    public int getCriterioevaluacion_Co_Criterio() {
        return criterioevaluacion_Co_Criterio;
    }

    public void setCriterioevaluacion_Co_Criterio(int criterioevaluacion_Co_Criterio) {
        this.criterioevaluacion_Co_Criterio = criterioevaluacion_Co_Criterio;
    }

    public int getInvitacion_Nu_Invitacion() {
        return invitacion_Nu_Invitacion;
    }

    public void setInvitacion_Nu_Invitacion(int invitacion_Nu_Invitacion) {
        this.invitacion_Nu_Invitacion = invitacion_Nu_Invitacion;
    }
}

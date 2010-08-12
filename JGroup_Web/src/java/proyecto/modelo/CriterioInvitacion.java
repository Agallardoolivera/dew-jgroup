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
private int Nu_ValorCotizacion;
private int Co_Criterio;
private int Co_Cotizacion;
private double Qt_Puntaje_Especial;

    public double getQt_Puntaje_Especial() {
        return Qt_Puntaje_Especial;
    }

    public void setQt_Puntaje_Especial(double Qt_Puntaje_Especial) {
        this.Qt_Puntaje_Especial = Qt_Puntaje_Especial;
    }

    public CriterioInvitacion(){

    }

    public int getCo_Cotizacion() {
        return Co_Cotizacion;
    }

    public void setCo_Cotizacion(int Co_Cotizacion) {
        this.Co_Cotizacion = Co_Cotizacion;
    }

    public int getCo_Criterio() {
        return Co_Criterio;
    }

    public void setCo_Criterio(int Co_Criterio) {
        this.Co_Criterio = Co_Criterio;
    }

    public int getNu_ValorCotizacion() {
        return Nu_ValorCotizacion;
    }

    public void setNu_ValorCotizacion(int Nu_ValorCotizacion) {
        this.Nu_ValorCotizacion = Nu_ValorCotizacion;
    }

}

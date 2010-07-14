/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class DetalleCotizacion {
private int Co_Invitacion;
private int Nu_Cantidad;
private double Ss_PrecioUnitario;
private int Nu_Cotizacion;
private int Co_Articulo;
    public DetalleCotizacion(){

    }

    public int getCo_Articulo() {
        return Co_Articulo;
    }

    public void setCo_Articulo(int Co_Articulo) {
        this.Co_Articulo = Co_Articulo;
    }

    public int getCo_Invitacion() {
        return Co_Invitacion;
    }

    public void setCo_Invitacion(int Co_Invitacion) {
        this.Co_Invitacion = Co_Invitacion;
    }

    public int getNu_Cantidad() {
        return Nu_Cantidad;
    }

    public void setNu_Cantidad(int Nu_Cantidad) {
        this.Nu_Cantidad = Nu_Cantidad;
    }

    public int getNu_Cotizacion() {
        return Nu_Cotizacion;
    }

    public void setNu_Cotizacion(int Nu_Cotizacion) {
        this.Nu_Cotizacion = Nu_Cotizacion;
    }

    public double getSs_PrecioUnitario() {
        return Ss_PrecioUnitario;
    }

    public void setSs_PrecioUnitario(double Ss_PrecioUnitario) {
        this.Ss_PrecioUnitario = Ss_PrecioUnitario;
    }

}

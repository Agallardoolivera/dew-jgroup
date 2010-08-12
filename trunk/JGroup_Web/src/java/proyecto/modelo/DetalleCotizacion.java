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
private double Ss_PrecioUnitario;
private int Cotizacion_Nu_Cotizacion;
private int Articulo_Co_Articulo;
private int Nu_Cantidad;

    public DetalleCotizacion(){

    }

    public int getArticulo_Co_Articulo() {
        return Articulo_Co_Articulo;
    }

    public void setCo_Articulo(int Articulo_Co_Articulo) {
        this.Articulo_Co_Articulo = Articulo_Co_Articulo;
    }

  

    public int getNu_Cantidad() {
        return Nu_Cantidad;
    }

    public void setNu_Cantidad(int Nu_Cantidad) {
        this.Nu_Cantidad = Nu_Cantidad;
    }

    public int getCotizacion_Nu_Cotizacion() {
        return Cotizacion_Nu_Cotizacion;
    }

    public void setCotizacion_Nu_Cotizacion(int Cotizacion_Nu_Cotizacion) {
        this.Cotizacion_Nu_Cotizacion = Cotizacion_Nu_Cotizacion;
    }

    public double getSs_PrecioUnitario() {
        return Ss_PrecioUnitario;
    }

    public void setSs_PrecioUnitario(double Ss_PrecioUnitario) {
        this.Ss_PrecioUnitario = Ss_PrecioUnitario;
    }

}

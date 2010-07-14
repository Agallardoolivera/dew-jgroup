/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

import java.util.Date;

/**
 *
 * @author Angela
 */
public class Cotizacion {
private int Nu_Invitacion;
private Date Fe_Cotizacion;
private String Tx_ResponsableProveedor;
private String Tx_EstadoProveedor;
private int Nu_puntajeobtenido;
private String Tx_Ganadora;
private int Nu_Cotizacion;
private int Co_Proveedor;


    public Cotizacion(){

    }

    public int getCo_Proveedor() {
        return Co_Proveedor;
    }

    public void setCo_Proveedor(int Co_Proveedor) {
        this.Co_Proveedor = Co_Proveedor;
    }

    public Date getFe_Cotizacion() {
        return Fe_Cotizacion;
    }

    public void setFe_Cotizacion(Date Fe_Cotizacion) {
        this.Fe_Cotizacion = Fe_Cotizacion;
    }

    public int getNu_Cotizacion() {
        return Nu_Cotizacion;
    }

    public void setNu_Cotizacion(int Nu_Cotizacion) {
        this.Nu_Cotizacion = Nu_Cotizacion;
    }

    public int getNu_Invitacion() {
        return Nu_Invitacion;
    }

    public void setNu_Invitacion(int Nu_Invitacion) {
        this.Nu_Invitacion = Nu_Invitacion;
    }

    public int getNu_puntajeobtenido() {
        return Nu_puntajeobtenido;
    }

    public void setNu_puntajeobtenido(int Nu_puntajeobtenido) {
        this.Nu_puntajeobtenido = Nu_puntajeobtenido;
    }

    public String getTx_EstadoProveedor() {
        return Tx_EstadoProveedor;
    }

    public void setTx_EstadoProveedor(String Tx_EstadoProveedor) {
        this.Tx_EstadoProveedor = Tx_EstadoProveedor;
    }

    public String getTx_Ganadora() {
        return Tx_Ganadora;
    }

    public void setTx_Ganadora(String Tx_Ganadora) {
        this.Tx_Ganadora = Tx_Ganadora;
    }

    public String getTx_ResponsableProveedor() {
        return Tx_ResponsableProveedor;
    }

    public void setTx_ResponsableProveedor(String Tx_ResponsableProveedor) {
        this.Tx_ResponsableProveedor = Tx_ResponsableProveedor;
    }

}

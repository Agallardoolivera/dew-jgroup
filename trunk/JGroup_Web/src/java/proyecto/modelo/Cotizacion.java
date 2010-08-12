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
private Date Fe_Entrega;
private int Nu_puntajeobtenido;
private String Tx_Ganadora;
private int Nu_Cotizacion;
private int Co_Proveedor;
private String TX_Observacion;
private String Tx_EstadoCot;

    public Cotizacion(){

    }

    public void setTX_Observacion(String TX_Observacion) {
        this.TX_Observacion = TX_Observacion;
    }

    public int getCo_Proveedor() {
        return Co_Proveedor;
    }

    public void setCo_Proveedor(int Co_Proveedor) {
        this.Co_Proveedor = Co_Proveedor;
    }

    public Date getFe_Entrega() {
        return Fe_Entrega;
    }

    public void setFe_Entrega(Date Fe_Entrega) {
        this.Fe_Entrega = Fe_Entrega;
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

    public String getTX_Observacion() {
        return TX_Observacion;
    }

    public String getTx_EstadoCot() {
        return Tx_EstadoCot;
    }

    public void setTx_EstadoCot(String Tx_EstadoCot) {
        this.Tx_EstadoCot = Tx_EstadoCot;
    }

    public String getTx_Ganadora() {
        return Tx_Ganadora;
    }

    public void setTx_Ganadora(String Tx_Ganadora) {
        this.Tx_Ganadora = Tx_Ganadora;
    }

}

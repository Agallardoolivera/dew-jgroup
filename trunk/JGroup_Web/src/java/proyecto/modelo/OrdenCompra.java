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
public class OrdenCompra {
private int Nu_OrdenCompra;
private int Nu_Cotizacion;
private Double Ss_SubTotal;
private String Tx_CondicionPago;
private String Fe_Entrega;
private String Tx_Observacion;
    public OrdenCompra(){

    }

    public String getFe_Entrega() {
        return Fe_Entrega;
    }

    public void setFe_Entrega(String Fe_Entrega) {
        this.Fe_Entrega = Fe_Entrega;
    }

    public int getNu_Cotizacion() {
        return Nu_Cotizacion;
    }

    public void setNu_Cotizacion(int Nu_Cotizacion) {
        this.Nu_Cotizacion = Nu_Cotizacion;
    }

    public int getNu_OrdenCompra() {
        return Nu_OrdenCompra;
    }

    public void setNu_OrdenCompra(int Nu_OrdenCompra) {
        this.Nu_OrdenCompra = Nu_OrdenCompra;
    }

    public Double getSs_SubTotal() {
        return Ss_SubTotal;
    }

    public void setSs_SubTotal(Double Ss_SubTotal) {
        this.Ss_SubTotal = Ss_SubTotal;
    }

    public String getTx_CondicionPago() {
        return Tx_CondicionPago;
    }

    public void setTx_CondicionPago(String Tx_CondicionPago) {
        this.Tx_CondicionPago = Tx_CondicionPago;
    }

    public String getTx_Observacion() {
        return Tx_Observacion;
    }

    public void setTx_Observacion(String Tx_Observacion) {
        this.Tx_Observacion = Tx_Observacion;
    }

}

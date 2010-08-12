/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.modelo;

import java.util.Date;

/**
 *
 * @author pcsidrod
 */
public class ConsultacotiCab1 {

    private int Nu_Cotizacion;
    private int Nu_Invitacion ;
    private String Tx_Descripcion;
    private String No_RazonSocialProveedor;
    private String Fe_Entrega;
    private String TX_Observacion;

    public String getFe_Entrega() {
        return Fe_Entrega;
    }

    public void setFe_Entrega(String Fe_Entrega) {
        this.Fe_Entrega = Fe_Entrega;
    }

    public String getNo_RazonSocialProveedor() {
        return No_RazonSocialProveedor;
    }

    public void setNo_RazonSocialProveedor(String No_RazonSocialProveedor) {
        this.No_RazonSocialProveedor = No_RazonSocialProveedor;
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

    public String getTX_Observacion() {
        return TX_Observacion;
    }

    public void setTX_Observacion(String TX_Observacion) {
        this.TX_Observacion = TX_Observacion;
    }

    public String getTx_Descripcion() {
        return Tx_Descripcion;
    }

    public void setTx_Descripcion(String Tx_Descripcion) {
        this.Tx_Descripcion = Tx_Descripcion;
    }



}
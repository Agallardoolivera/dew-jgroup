/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Alfredo
 */
public class CotizacionProveedor {

    private int Nu_Cotizacion;
    private String Nu_RucProveedor;
    private String No_RazonSocialProveedor;
    private String Fe_Entrega;
    private int Monto;

    public CotizacionProveedor() {
    }
   
    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
   

    public String getNo_RazonSocialProveedor() {
        return No_RazonSocialProveedor;
    }

    public void setNo_RazonSocialProveedor(String No_RazonSocialProveedor) {
        this.No_RazonSocialProveedor = No_RazonSocialProveedor;
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

    public String getNu_RucProveedor() {
        return Nu_RucProveedor;
    }

    public void setNu_RucProveedor(String Nu_RucProveedor) {
        this.Nu_RucProveedor = Nu_RucProveedor;
    }


}

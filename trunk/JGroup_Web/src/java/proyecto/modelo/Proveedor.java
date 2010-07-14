/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class Proveedor {
private int Co_Proveedor;
private String Nu_RucProveedor;
private String No_RazonSocialProveedor;
private String Tx_CorreoProveedor;
private String Tx_ClaveAccesoProveedor;

    public Proveedor(){

    }

    public int getCo_Proveedor() {
        return Co_Proveedor;
    }

    public void setCo_Proveedor(int Co_Proveedor) {
        this.Co_Proveedor = Co_Proveedor;
    }

    public String getNo_RazonSocialProveedor() {
        return No_RazonSocialProveedor;
    }

    public void setNo_RazonSocialProveedor(String No_RazonSocialProveedor) {
        this.No_RazonSocialProveedor = No_RazonSocialProveedor;
    }

    public String getNu_RucProveedor() {
        return Nu_RucProveedor;
    }

    public void setNu_RucProveedor(String Nu_RucProveedor) {
        this.Nu_RucProveedor = Nu_RucProveedor;
    }

    public String getTx_ClaveAccesoProveedor() {
        return Tx_ClaveAccesoProveedor;
    }

    public void setTx_ClaveAccesoProveedor(String Tx_ClaveAccesoProveedor) {
        this.Tx_ClaveAccesoProveedor = Tx_ClaveAccesoProveedor;
    }

    public String getTx_CorreoProveedor() {
        return Tx_CorreoProveedor;
    }

    public void setTx_CorreoProveedor(String Tx_CorreoProveedor) {
        this.Tx_CorreoProveedor = Tx_CorreoProveedor;
    }

}

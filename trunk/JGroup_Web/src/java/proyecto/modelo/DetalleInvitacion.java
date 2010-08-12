/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class DetalleInvitacion {
private int Nu_Item;
private String Co_DetalleInvitacion;
private int Nu_cantidad;
private String Tx_Observacion;

    public String getTx_Observacion() {
        return Tx_Observacion;
    }

    public void setTx_Observacion(String Tx_Observacion) {
        this.Tx_Observacion = Tx_Observacion;
    }
private int  Nu_invitacion;
private int Co_Articulo;
    public DetalleInvitacion(){

    }

    public int getCo_Articulo() {
        return Co_Articulo;
    }

    public void setCo_Articulo(int Co_Articulo) {
        this.Co_Articulo = Co_Articulo;
    }

    public String getCo_DetalleInvitacion() {
        return Co_DetalleInvitacion;
    }

    public void setCo_DetalleInvitacion(String Co_DetalleInvitacion) {
        this.Co_DetalleInvitacion = Co_DetalleInvitacion;
    }

    public int getNu_Item() {
        return Nu_Item;
    }

    public void setNu_Item(int Nu_Item) {
        this.Nu_Item = Nu_Item;
    }

    public int getNu_cantidad() {
        return Nu_cantidad;
    }

    public void setNu_cantidad(int Nu_cantidad) {
        this.Nu_cantidad = Nu_cantidad;
    }

    public int getNu_invitacion() {
        return Nu_invitacion;
    }

    public void setNu_invitacion(int Nu_invitacion) {
        this.Nu_invitacion = Nu_invitacion;
    }

}

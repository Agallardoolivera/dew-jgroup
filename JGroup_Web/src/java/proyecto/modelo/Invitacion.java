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
public class Invitacion {
private int Nu_Invitacion;
private Date Fe_Invitacion;
private String Tx_GeneradorUsuario;
private String Tx_Descripcion;
private int Usuario_Co_Usuario;
private int OrdenCompra_Nu_OrdenCompra;

    public Invitacion(){

    }

    public Date getFe_Invitacion() {
        return Fe_Invitacion;
    }

    public void setFe_Invitacion(Date Fe_Invitacion) {
        this.Fe_Invitacion = Fe_Invitacion;
    }

    public int getNu_Invitacion() {
        return Nu_Invitacion;
    }

    public void setNu_Invitacion(int Nu_Invitacion) {
        this.Nu_Invitacion = Nu_Invitacion;
    }

    public int getOrdenCompra_Nu_OrdenCompra() {
        return OrdenCompra_Nu_OrdenCompra;
    }

    public void setOrdenCompra_Nu_OrdenCompra(int OrdenCompra_Nu_OrdenCompra) {
        this.OrdenCompra_Nu_OrdenCompra = OrdenCompra_Nu_OrdenCompra;
    }

    public String getTx_Descripcion() {
        return Tx_Descripcion;
    }

    public void setTx_Descripcion(String Tx_Descripcion) {
        this.Tx_Descripcion = Tx_Descripcion;
    }

    public String getTx_GeneradorUsuario() {
        return Tx_GeneradorUsuario;
    }

    public void setTx_GeneradorUsuario(String Tx_GeneradorUsuario) {
        this.Tx_GeneradorUsuario = Tx_GeneradorUsuario;
    }

    public int getUsuario_Co_Usuario() {
        return Usuario_Co_Usuario;
    }

    public void setUsuario_Co_Usuario(int Usuario_Co_Usuario) {
        this.Usuario_Co_Usuario = Usuario_Co_Usuario;
    }

}
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
private int Co_Usuario;
private int Nu_OrdenCompra;
    public Invitacion(){

    }

    public int getCo_Usuario() {
        return Co_Usuario;
    }

    public void setCo_Usuario(int Co_Usuario) {
        this.Co_Usuario = Co_Usuario;
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

    public int getNu_OrdenCompra() {
        return Nu_OrdenCompra;
    }

    public void setNu_OrdenCompra(int Nu_OrdenCompra) {
        this.Nu_OrdenCompra = Nu_OrdenCompra;
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

}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto.modelo;

/**
 *
 * @author u814305
 */
public class Usuario {

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
private String idUsuario;
private String clave;
private String nombres;
// Agregar sus métodos set y get
}

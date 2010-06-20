/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.modelo;

/**
 *
 * @author pcsidrod
 */
public class Usuario {

    private String idUsuario;
    private String clave;
    private String nombres;
    private String area;

    public Usuario(){}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


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



}

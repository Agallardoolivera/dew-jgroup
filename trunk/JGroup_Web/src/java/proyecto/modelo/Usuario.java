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
    private String txt_nom;
    private String txt_ape;
    private String txt_dni;

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

        public String getTxt_ape() {
        return txt_ape;
    }

    public void setTxt_ape(String txt_ape) {
        this.txt_ape = txt_ape;
    }

    public String getTxt_dni() {
        return txt_dni;
    }

    public void setTxt_dni(String txt_dni) {
        this.txt_dni = txt_dni;
    }

    public String getTxt_nom() {
        return txt_nom;
    }

    public void setTxt_nom(String txt_nom) {
        this.txt_nom = txt_nom;
    }
    
}

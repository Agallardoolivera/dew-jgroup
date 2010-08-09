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

    private int co_Usuario;
    private String clave;
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
   
    public Usuario(){}

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCo_Usuario() {
        return co_Usuario;
    }

    public void setCo_Usuario(int co_Usuario) {
        this.co_Usuario = co_Usuario;
    }

   
    
}

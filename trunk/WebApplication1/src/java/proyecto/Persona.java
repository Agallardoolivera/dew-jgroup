/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author U820901
 */
public class Persona {

    private String nombre;
    private String apellidos;

    
    public Persona(){}

    public Persona(String pNombre, String pApellidos) {
    this.nombre = pNombre;
    this.apellidos = pApellidos;
    }
     public String getNombre() {
     return this.nombre;
    }
    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    public String getApellidos() {
    return this.apellidos;
    }
    public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class LineaArticulo {
    private String Co_Linea;
    private int Co_Negocio;
    private int Co_Articulo;


public LineaArticulo(){

}

    public int getCo_Articulo() {
        return Co_Articulo;
    }

    public void setCo_Articulo(int Co_Articulo) {
        this.Co_Articulo = Co_Articulo;
    }

    public String getCo_Linea() {
        return Co_Linea;
    }

    public void setCo_Linea(String Co_Linea) {
        this.Co_Linea = Co_Linea;
    }

    public int getCo_Negocio() {
        return Co_Negocio;
    }

    public void setCo_Negocio(int Co_Negocio) {
        this.Co_Negocio = Co_Negocio;
    }

}

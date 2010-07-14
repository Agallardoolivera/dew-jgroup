/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class DetalleOC {
private int Nu_Item;
private Double Ss_PrecioArticulo;
private int Nu_OrdenCompra;
private int Co_Articulo;

    public DetalleOC(){

    }

    public int getCo_Articulo() {
        return Co_Articulo;
    }

    public void setCo_Articulo(int Co_Articulo) {
        this.Co_Articulo = Co_Articulo;
    }

    public int getNu_Item() {
        return Nu_Item;
    }

    public void setNu_Item(int Nu_Item) {
        this.Nu_Item = Nu_Item;
    }

    public int getNu_OrdenCompra() {
        return Nu_OrdenCompra;
    }

    public void setNu_OrdenCompra(int Nu_OrdenCompra) {
        this.Nu_OrdenCompra = Nu_OrdenCompra;
    }

    public Double getSs_PrecioArticulo() {
        return Ss_PrecioArticulo;
    }

    public void setSs_PrecioArticulo(Double Ss_PrecioArticulo) {
        this.Ss_PrecioArticulo = Ss_PrecioArticulo;
    }

}

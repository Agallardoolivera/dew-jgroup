package Proyecto.Entidades;


public class DetalleOC {

    private String NuOrdenCompra;

    private String NuItem;

    private String CoArticulo;

    private double SsPrecioUnitario;

    private OrdenCompra mOrdenCompra;

    public DetalleOC () {
    }

    public String getCoArticulo () {
        return CoArticulo;
    }

    public void setCoArticulo (String val) {
        this.CoArticulo = val;
    }

    public String getNuItem () {
        return NuItem;
    }

    public void setNuItem (String val) {
        this.NuItem = val;
    }

    public String getNuOrdenCompra () {
        return NuOrdenCompra;
    }

    public void setNuOrdenCompra (String val) {
        this.NuOrdenCompra = val;
    }

    public double getSsPrecioUnitario () {
        return SsPrecioUnitario;
    }

    public void setSsPrecioUnitario (double val) {
        this.SsPrecioUnitario = val;
    }

    public OrdenCompra getOrdenCompra () {
        return mOrdenCompra;
    }

    public void setOrdenCompra (OrdenCompra val) {
        this.mOrdenCompra = val;
    }

}


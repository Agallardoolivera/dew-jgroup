import java.util.ArrayList; 

public class LineaNegocio {

    private String Codigo;

    private String Descripcion;

    private ArrayList<ProveedorLinea> proveedorLinea;

    private ArrayList<LineaArticulo> lineaArticulo;

    public LineaNegocio () {
    }

    public String getCodigo () {
        return Codigo;
    }

    public void setCodigo (String val) {
        this.Codigo = val;
    }

    public String getDescripcion () {
        return Descripcion;
    }

    public void setDescripcion (String val) {
        this.Descripcion = val;
    }

    public ArrayList<LineaArticulo> getLineaArticulo () {
        return lineaArticulo;
    }

    public void setLineaArticulo (ArrayList<LineaArticulo> val) {
        this.lineaArticulo = val;
    }

    public ArrayList<ProveedorLinea> getProveedorLinea () {
        return proveedorLinea;
    }

    public void setProveedorLinea (ArrayList<ProveedorLinea> val) {
        this.proveedorLinea = val;
    }

}


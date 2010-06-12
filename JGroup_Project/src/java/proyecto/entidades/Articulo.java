package proyecto.entidades;

import java.util.ArrayList; 

public class Articulo {

    private String Codigo;

    private String Nombre;

    private String UM;

    private ArrayList<DetalleInvitacion> detalleInvitacion;

    private ArrayList<LineaArticulo> lineaArticulo;

    public Articulo () {
    }

    public String getCodigo () {
        return Codigo;
    }

    public void setCodigo (String val) {
        this.Codigo = val;
    }

    public String getNombre () {
        return Nombre;
    }

    public void setNombre (String val) {
        this.Nombre = val;
    }

    public String getUM () {
        return UM;
    }

    public void setUM (String val) {
        this.UM = val;
    }

    public ArrayList<DetalleInvitacion> getDetalleInvitacion () {
        return detalleInvitacion;
    }

    public void setDetalleInvitacion (ArrayList<DetalleInvitacion> val) {
        this.detalleInvitacion = val;
    }

    public ArrayList<LineaArticulo> getLineaArticulo () {
        return lineaArticulo;
    }

    public void setLineaArticulo (ArrayList<LineaArticulo> val) {
        this.lineaArticulo = val;
    }

}


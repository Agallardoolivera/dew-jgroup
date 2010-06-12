package Proyecto.Entidades;


public class Usuario {

    private String Codigo;

    private String Nombre;

    private String Clave;

    private String Area;

    public Usuario () {
    }

    public String getArea () {
        return Area;
    }

    public void setArea (String val) {
        this.Area = val;
    }

    public String getClave () {
        return Clave;
    }

    public void setClave (String val) {
        this.Clave = val;
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

}


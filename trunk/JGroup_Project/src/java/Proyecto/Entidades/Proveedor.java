package Proyecto.Entidades;

import java.util.ArrayList; 

public class Proveedor {

    private String Codigo;

    private String Ruc;

    private String RazonSocial;

    private String Correo;

    private String ClaveAcceso;

    private ArrayList<ProveedorLinea> proveedorLinea;

    public Proveedor () {
    }

    public String getClaveAcceso () {
        return ClaveAcceso;
    }

    public void setClaveAcceso (String val) {
        this.ClaveAcceso = val;
    }

    public String getCodigo () {
        return Codigo;
    }

    public void setCodigo (String val) {
        this.Codigo = val;
    }

    public String getCorreo () {
        return Correo;
    }

    public void setCorreo (String val) {
        this.Correo = val;
    }

    public String getRazonSocial () {
        return RazonSocial;
    }

    public void setRazonSocial (String val) {
        this.RazonSocial = val;
    }

    public String getRuc () {
        return Ruc;
    }

    public void setRuc (String val) {
        this.Ruc = val;
    }

    public ArrayList<ProveedorLinea> getProveedorLinea () {
        return proveedorLinea;
    }

    public void setProveedorLinea (ArrayList<ProveedorLinea> val) {
        this.proveedorLinea = val;
    }

}


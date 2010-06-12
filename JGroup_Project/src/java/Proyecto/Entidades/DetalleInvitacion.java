package Proyecto.Entidades;


public class DetalleInvitacion {

    private String Numero;

    private String Item;

    private String Codigo;

    private String Cantidad;

    private String Observacion;

    private Invitacion mInvitacion;

    public DetalleInvitacion () {
    }

    public String getCantidad () {
        return Cantidad;
    }

    public void setCantidad (String val) {
        this.Cantidad = val;
    }

    public String getCodigo () {
        return Codigo;
    }

    public void setCodigo (String val) {
        this.Codigo = val;
    }

    public String getItem () {
        return Item;
    }

    public void setItem (String val) {
        this.Item = val;
    }

    public String getNumero () {
        return Numero;
    }

    public void setNumero (String val) {
        this.Numero = val;
    }

    public String getObservacion () {
        return Observacion;
    }

    public void setObservacion (String val) {
        this.Observacion = val;
    }

    public Invitacion getInvitacion () {
        return mInvitacion;
    }

    public void setInvitacion (Invitacion val) {
        this.mInvitacion = val;
    }

}


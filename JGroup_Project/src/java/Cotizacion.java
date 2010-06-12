import java.util.Date; 

public class Cotizacion {

    private String NuCotizacion;

    private String NuInvitacion;

    private String CoProveedor;

    private Date Fecha;

    private String Responsable;

    private String Estado;

    private double PuntajeObtenido;

    private String Ganadora;

    private Invitacion mInvitacion;

    private Usuario mUsuario;

    public Cotizacion () {
    }

    public String getCoProveedor () {
        return CoProveedor;
    }

    public void setCoProveedor (String val) {
        this.CoProveedor = val;
    }

    public String getEstado () {
        return Estado;
    }

    public void setEstado (String val) {
        this.Estado = val;
    }

    public Date getFecha () {
        return Fecha;
    }

    public void setFecha (Date val) {
        this.Fecha = val;
    }

    public String getGanadora () {
        return Ganadora;
    }

    public void setGanadora (String val) {
        this.Ganadora = val;
    }

    public String getNuCotizacion () {
        return NuCotizacion;
    }

    public void setNuCotizacion (String val) {
        this.NuCotizacion = val;
    }

    public String getNuInvitacion () {
        return NuInvitacion;
    }

    public void setNuInvitacion (String val) {
        this.NuInvitacion = val;
    }

    public double getPuntajeObtenido () {
        return PuntajeObtenido;
    }

    public void setPuntajeObtenido (double val) {
        this.PuntajeObtenido = val;
    }

    public String getResponsable () {
        return Responsable;
    }

    public void setResponsable (String val) {
        this.Responsable = val;
    }

    public Invitacion getInvitacion () {
        return mInvitacion;
    }

    public void setInvitacion (Invitacion val) {
        this.mInvitacion = val;
    }

    public Usuario getUsuario () {
        return mUsuario;
    }

    public void setUsuario (Usuario val) {
        this.mUsuario = val;
    }

}


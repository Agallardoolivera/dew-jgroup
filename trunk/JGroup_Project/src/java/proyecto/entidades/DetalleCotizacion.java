package proyecto.entidades;


public class DetalleCotizacion {

    private String NuCotizacion;

    private String CoInvitacion;

    private String Cantidad;

    private double SsUnitario;

    private Cotizacion mCotizacion;

    public DetalleCotizacion () {
    }

    public String getCantidad () {
        return Cantidad;
    }

    public void setCantidad (String val) {
        this.Cantidad = val;
    }

    public String getCoInvitacion () {
        return CoInvitacion;
    }

    public void setCoInvitacion (String val) {
        this.CoInvitacion = val;
    }

    public String getNuCotizacion () {
        return NuCotizacion;
    }

    public void setNuCotizacion (String val) {
        this.NuCotizacion = val;
    }

    public double getSsUnitario () {
        return SsUnitario;
    }

    public void setSsUnitario (double val) {
        this.SsUnitario = val;
    }

    public Cotizacion getCotizacion () {
        return mCotizacion;
    }

    public void setCotizacion (Cotizacion val) {
        this.mCotizacion = val;
    }

}


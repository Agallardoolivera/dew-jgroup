package proyecto.entidades;

import java.util.Date; 

public class OrdenCompra {

    private String NuOrdenCompra;

    private String NuCotizacion;

    private double SsSubTotal;

    private String CondicionPago;

    private Date FechaEntrega;

    private String Observacion;

    private Cotizacion mCotizacion;

    public OrdenCompra () {
    }

    public String getCondicionPago () {
        return CondicionPago;
    }

    public void setCondicionPago (String val) {
        this.CondicionPago = val;
    }

    public Date getFechaEntrega () {
        return FechaEntrega;
    }

    public void setFechaEntrega (Date val) {
        this.FechaEntrega = val;
    }

    public String getNuCotizacion () {
        return NuCotizacion;
    }

    public void setNuCotizacion (String val) {
        this.NuCotizacion = val;
    }

    public String getNuOrdenCompra () {
        return NuOrdenCompra;
    }

    public void setNuOrdenCompra (String val) {
        this.NuOrdenCompra = val;
    }

    public String getObservacion () {
        return Observacion;
    }

    public void setObservacion (String val) {
        this.Observacion = val;
    }

    public double getSsSubTotal () {
        return SsSubTotal;
    }

    public void setSsSubTotal (double val) {
        this.SsSubTotal = val;
    }

    public Cotizacion getCotizacion () {
        return mCotizacion;
    }

    public void setCotizacion (Cotizacion val) {
        this.mCotizacion = val;
    }

}


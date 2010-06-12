
public class CriterioCotizacion {

    private String NuCotizacion;

    private String CoCriterio;

    private int Valor;

    private Cotizacion mCotizacion;

    private CriterioEvaluacion mCriterioEvaluacion;

    public CriterioCotizacion () {
    }

    public String getCoCriterio () {
        return CoCriterio;
    }

    public void setCoCriterio (String val) {
        this.CoCriterio = val;
    }

    public String getNuCotizacion () {
        return NuCotizacion;
    }

    public void setNuCotizacion (String val) {
        this.NuCotizacion = val;
    }

    public int getValor () {
        return Valor;
    }

    public void setValor (int val) {
        this.Valor = val;
    }

    public Cotizacion getCotizacion () {
        return mCotizacion;
    }

    public void setCotizacion (Cotizacion val) {
        this.mCotizacion = val;
    }

    public CriterioEvaluacion getCriterioEvaluacion () {
        return mCriterioEvaluacion;
    }

    public void setCriterioEvaluacion (CriterioEvaluacion val) {
        this.mCriterioEvaluacion = val;
    }

}


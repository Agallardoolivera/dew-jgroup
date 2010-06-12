package Proyecto.Entidades;


public class CriterioEvaluacion {

    private String CoCriterio;

    private String Descripcion;

    private double Puntaje;

    public CriterioEvaluacion () {
    }

    public String getCoCriterio () {
        return CoCriterio;
    }

    public void setCoCriterio (String val) {
        this.CoCriterio = val;
    }

    public String getDescripcion () {
        return Descripcion;
    }

    public void setDescripcion (String val) {
        this.Descripcion = val;
    }

    public double getPuntaje () {
        return Puntaje;
    }

    public void setPuntaje (double val) {
        this.Puntaje = val;
    }

}


import java.util.Date; 

public class Invitacion {

    private String Numero;

    private Date Fecha;

    private String GeneradorUsuario;

    private String Descripcion;

    public Invitacion () {
    }

    public String getDescripcion () {
        return Descripcion;
    }

    public void setDescripcion (String val) {
        this.Descripcion = val;
    }

    public Date getFecha () {
        return Fecha;
    }

    public void setFecha (Date val) {
        this.Fecha = val;
    }

    public String getGeneradorUsuario () {
        return GeneradorUsuario;
    }

    public void setGeneradorUsuario (String val) {
        this.GeneradorUsuario = val;
    }

    public String getNumero () {
        return Numero;
    }

    public void setNumero (String val) {
        this.Numero = val;
    }

}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.modelo;

/**
 *
 * @author Angela
 */
public class CriterioEvaluacion {

private int Co_Criterio;
private String Tx_DescCriterioEvaluacion;
private String Tipo_Dato;

    public int getCo_Criterio() {
        return Co_Criterio;
    }

    public void setCo_Criterio(int Co_Criterio) {
        this.Co_Criterio = Co_Criterio;
    }

    public String getTipo_Dato() {
        return Tipo_Dato;
    }

    public void setTipo_Dato(String Tipo_Dato) {
        this.Tipo_Dato = Tipo_Dato;
    }

    public String getTx_DescCriterioEvaluacion() {
        return Tx_DescCriterioEvaluacion;
    }

    public void setTx_DescCriterioEvaluacion(String Tx_DescCriterioEvaluacion) {
        this.Tx_DescCriterioEvaluacion = Tx_DescCriterioEvaluacion;
    }

}

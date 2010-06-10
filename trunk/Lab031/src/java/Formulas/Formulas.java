/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Formulas;

/**
 *
 * @author U201000432
 */


public class Formulas {
double d1;
double d2;
double d3;
double X1;
double X2;
public Formulas (){}
public Formulas(double v1, double v2,double v3) {
this.d1=v1;
this.d2=v2;
this.d3=v3;
this.X1 = (-(d2)+Math.sqrt((d2*d2-(4*(d1*d3)))))/2*d1;
this.X2 = (-(d2)-Math.sqrt((d2*d2-(4*(d1*d3)))))/2*d1;
}

public Double getd1() {
return this.d1;
}
public void setd1(Double d1) {
this.d1 = d1;
}
public Double getd2() {
return this.d2;
}
public void setd2(Double d2) {
this.d2 = d2;
}
public Double getd3() {
return this.d3;
}
public void setd3(Double d3) {
this.d2 = d3;
}
public Double getX2() {
return this.X2;
}
public void setX2(Double X2) {
this.X2 = X2;
}
public Double getX1() {
return this.X1;
}
public void setX1(Double X1) {
this.X1 = X1;
}
}
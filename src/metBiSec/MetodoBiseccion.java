package metBiSec;

import java.text.DecimalFormat;

public class MetodoBiseccion {

    private FuncionBi funcion;
    double xR;
    int contador;
    
    double errSis;
    double xd;

    String iter;
    DecimalFormat form;

    public MetodoBiseccion() {
    }//cierra el constructor

    public MetodoBiseccion(String funcionBi) {
        funcion = new FuncionBi(funcionBi);
    }//cierra el constructor

    public void setFuncion(String funcionBi) {
        funcion = new FuncionBi(funcionBi);
    }//cierra el metodo

    public double metodoBiseccion(double a, double b, double ep) {
        form = new DecimalFormat("0.000000");
        this.xR = Double.NaN;
        this.contador = 1;

        double fnA = this.funcion.evaluacion(a);

        if (!Double.isNaN(fnA)) {
            double fnB = this.funcion.evaluacion(b);

            String head = "No.\ta\tb\tf(a)\tf(b)\tXr\tf(Xr)\tError";
            iter = head;

            if (fnA * fnB < 0) {
                do {
                    this.xR = (a + b) / 2;
                    xd = this.xR;

                    fnA = this.funcion.evaluacion(a);
                    fnB = this.funcion.evaluacion(b);

                    if (fnA * this.funcion.evaluacion(xR) < 0) {
                        b = this.xR;
                    } else {
                        a = this.xR;
                    }
                    errSis = ((xR - xd) / xR) * 100;    //  No tengo idea de pq da 0

                    head = "\n" + contador + "\t" + form.format(a) + "\t" + form.format(b) + "\t" + form.format(funcion.evaluacion(fnA))
                            + "\t" + form.format(fnB) + "\t" + form.format(xR) + "\t" + form.format(funcion.evaluacion(xR)) + "\t"
                            + form.format(errSis);
                    iter += head;

                    this.contador++;
                    //} while (Math.abs(errSis) <= ep); //  Este deberia ser la condicion que pare las iteraciones
                } while (Math.abs(this.funcion.evaluacion(xR)) > ep);
            }
            if (!Double.isNaN(this.xR)) {
                return this.xR;
            }
        }
        return Double.NaN;
    }//cierra el metodo

    public String getIter() {
        return iter;
    }//cierra el metodo
}//cierra la clase

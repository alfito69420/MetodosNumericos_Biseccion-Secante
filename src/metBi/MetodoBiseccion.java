
package metBi;

public class MetodoBiseccion {
    
    private Funcion funcion;
    double xR;
    int contador;
    
    public MetodoBiseccion(){}
    
    public MetodoBiseccion(String funcionBi) {
        funcion = new Funcion(funcionBi);
    }//cierra el constructor
    
    public void setFuncion(String funcionBi) {
        funcion = new Funcion(funcionBi);
    }//cierra el metodo
    
    public double metodoBiseccion(double a, double b, double ep) {
        this.xR = Double.NaN;
        this.contador = 0;
        
        double fnA = this.funcion.evaluacion(a);
        
        if(!Double.isNaN(fnA)) {
            double fnB = this.funcion.evaluacion(b);
            
            if(fnA * fnB < 0) {
                do {                    
                    this.xR = (a+b)/2;
                    this.contador++;
                    
                    fnA = this.funcion.evaluacion(a);
                    fnB = this.funcion.evaluacion(b);
                    
                    if (fnA * this.funcion.evaluacion(xR) < 0) {
                        b = this.xR;
                    } else {
                        a = this.xR;
                    }
                } while (Math.abs(this.funcion.evaluacion(xR)) > ep);
            }
            if(!Double.isNaN(this.xR)) {
                return this.xR;
            }
        }
        return Double.NaN;
    }//cierra el metodo
}//cierra la clase

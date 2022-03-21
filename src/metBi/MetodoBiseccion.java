
package metBi;

public class MetodoBiseccion {
    
    private Funcion funcion;
    double x;
    int contador;
    
    public MetodoBiseccion(){}
    
    public MetodoBiseccion(String funcionBi) {
        funcion = new Funcion(funcionBi);
    }//cierra el constructor
    
    public void setFuncion(String funcionBi) {
        funcion = new Funcion(funcionBi);
    }
    
    public double metodoBiseccion(double a, double b, double ep) {
        this.x = Double.NaN;
        this.contador = 0;
        
        double fnA = this.funcion.evaluacion(a);
        
        if(!Double.isNaN(fnA)) {
            double fnB = this.funcion.evaluacion(b);
            
            if(fnA * fnB < 0) {
                do {                    
                    this.x = (a+b)/2;
                    this.contador++;
                    
                    fnA = this.funcion.evaluacion(a);
                    fnB = this.funcion.evaluacion(b);
                    
                    if (fnA * this.funcion.evaluacion(x) < 0) {
                        b = this.x;
                    } else {
                        a = this.x;
                    }
                } while (Math.abs(this.funcion.evaluacion(x)) > ep);
            }
            if(!Double.isNaN(this.x)) {
                return this.x;
            }//
        }
        return Double.NaN;
    }//cierra el metodo
}//cierra la clase

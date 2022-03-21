
package metBi;

public class MetodoBiseccion {
    
    private Funcion funcion;
    double xr;
    int contador;
    
    public MetodoBiseccion(){}
    
    public MetodoBiseccion(String funcionBi) {
        funcion = new Funcion(funcionBi);
    }//cierra el constructor
    
    public void setFuncion(String funcionBi) {
        funcion = new Funcion(funcionBi);
    }
    
    public double metodoBiseccion(double a, double b, double ep) {
        this.xr = Double.NaN;
        this.contador = 0;
        
        double fnA = this.funcion.evaluacion(a);
        
        if(!Double.isNaN(fnA)) {
            double fnB = this.funcion.evaluacion(b);
            
            if(fnA * fnB < 0) {
                do {                    
                    this.xr = (a+b)/2;
                    this.contador++;
                    
                    fnA = this.funcion.evaluacion(a);
                    fnB = this.funcion.evaluacion(b);
                    
                    if (fnA * this.funcion.evaluacion(xr) < 0) {
                        b = this.xr;
                    } else {
                        a = this.xr;
                    }
                } while (Math.abs(this.funcion.evaluacion(xr)) > ep);
            }
            if(!Double.isNaN(this.xr)) {
                return this.xr;
            }
        }
        return Double.NaN;
    }//cierra el metodo
}//cierra la clase

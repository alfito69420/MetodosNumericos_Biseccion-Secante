
package metBiSec;

public class MetodoSecante {
    
    public double metodoSecante(FuncionSec funcion, double x0, double x1, int c, double ep) {
        double r = Double.NaN;
        double x2 = x0;
        int k = 0;
        
        while(Math.abs(funcion.eval(x2)) > ep && k < c) {
            x2 = x0 - funcion.eval(x0) * (x1-x0)/(funcion.eval(x1)-funcion.eval(x0));
            x0 = x1;
            x1 = x2;
            k++;
        }//cierra el bucle
        
        if(k<c){
            r = x2;
        }
        return r;
    }//cierra el metodo
}//cierra la clase

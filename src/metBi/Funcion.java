
package metBi;

import org.nfunk.jep.JEP;

public class Funcion {
    private String funcion = "";
    
    public Funcion(String funcion) {
        this.funcion = funcion;
    }//cierra el constructor
    
    public double evaluacion(double x) {
        JEP jep = new JEP();
        
        jep.addStandardConstants();
        jep.addStandardFunctions();
        
        jep.addVariable("x", x);
        jep.parseExpression(this.funcion);
        
        if(!jep.hasError()) {
            return jep.getValue();
        } else {
            return Double.NaN;
        }
    }//cierra el metodo
}//cierra la funcion

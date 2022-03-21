
package metBiSec;

import org.nfunk.jep.JEP;

public class FuncionBi {
    private String funcion = "";
    
    public FuncionBi(String funcion) {
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

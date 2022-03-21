
package metBiSec;

import org.nfunk.jep.JEP;

public class FuncionSec {
    
    JEP jep = new JEP();
    
    public FuncionSec(String fun) {
        jep.addVariable("x", 0);
        jep.addStandardConstants();
        jep.addStandardFunctions();
        jep.parseExpression(fun);
        
        if(jep.hasError()){
            System.out.println(jep.getErrorInfo());
        }
    }
    
    public double eval(double x){
        double r;
        jep.addVariable("x", x);
        r = jep.getValue();
        
        if(jep.hasError()){
            System.out.println(jep.getErrorInfo());
        }
        return r;
    }
    
    /*private String funcion = "";
    
    public FuncionSec(String funcion) {
        this.funcion = funcion;
    }//cierra el constructor 
    
    public double evaluacion(double x) {
        
        jep.addStandardConstants();
        jep.addStandardFunctions();
        
        jep.addVariable("x", x);
        jep.parseExpression(this.funcion);
        
        if(!jep.hasError()) {
            return jep.getValue();
        } else {
            return Double.NaN;
        }
    }//cierra el metodo*/
}//cierra la clase

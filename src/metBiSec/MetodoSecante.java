
package metBiSec;

import javax.swing.JOptionPane;

public class MetodoSecante {
    
    public double metodoSecante(FuncionSec funcion, double x0, double x1, int interacion, double errorPer) {
        double r = Double.NaN;
        double x2 = x0;
        int k = 0;
        
        while(Math.abs(funcion.eval(x2)) > errorPer && k < interacion) {
            x2 = x0 - funcion.eval(x0) * (x1-x0)/(funcion.eval(x1)-funcion.eval(x0));
            x0 = x1;
            x1 = x2;
            k++;
        }//cierra el bucle
        
        if(k<interacion){
            r = x2;
        } else {
            JOptionPane.showMessageDialog(null, "Verifiqué la función o sus datos de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }//cierra el metodo
}//cierra la clase

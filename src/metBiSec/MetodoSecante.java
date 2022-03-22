
package metBiSec;

import javax.swing.JOptionPane;

public class MetodoSecante {
    
    public double metodoSecante(FuncionSec funcion, double x0, double x1, int interacion, double errorPer) {
        double r = Double.NaN;  //  Al iniciar no tiene un valor en si
        double x2 = x0;
        int j = 0;
        
        while(Math.abs(funcion.evaluacion(x2)) > errorPer && j < interacion) {
            x2 = x0 - funcion.evaluacion(x0) * (x1-x0)/(funcion.evaluacion(x1)-funcion.evaluacion(x0));
            x0 = x1;
            x1 = x2;
            j++;
        }//cierra el bucle
        
        if(j<interacion){
            r = x2;
        } else {
            JOptionPane.showMessageDialog(null, "Verifiqué la función o sus datos de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }//cierra el metodo
}//cierra la clase

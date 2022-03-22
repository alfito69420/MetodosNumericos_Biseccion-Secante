
package metBiSec;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MetodoSecante {
    
    String iter;
    DecimalFormat form;
    
    public double metodoSecante(FuncionSec funcion, double x0, double x1, int interacion, double errorPer) {
        form = new DecimalFormat("0.000000");
        double r = Double.NaN;  //  Al iniciar no tiene un valor en si
        double x2 = x0;
        double errorSist = 0;
        int j = 1;
        String head = "No.\tXi-1\tXi\tf(Xi-1)\tf(x1)\tXi+1\tError";
        iter = head;
        
        while(Math.abs(funcion.evaluacion(x2)) > errorPer && j < interacion) {
            x2 = x0 - funcion.evaluacion(x0) * (x1-x0)/(funcion.evaluacion(x1)-funcion.evaluacion(x0));
            errorSist = ((x2-x1)/(x2))*100;
            
            head = "\n"+j+"\t"+form.format(x0)+"\t"+form.format(x1)+"\t"+form.format(funcion.evaluacion(x0))+
                    "\t"+form.format(funcion.evaluacion(x1))+"\t"+form.format(x2)+"\t"+form.format(errorSist);
            
            x0 = x1;
            x1 = x2;
            //errorSist = ;
            j++;
            iter += head;
        }//cierra el bucle

        if(j<interacion){
            r = x2;
        } else {
            JOptionPane.showMessageDialog(null, "Verifiqué la función o sus datos de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }//cierra el metodo
    
    public String getIter(){
        return iter;
    }
}//cierra la clase

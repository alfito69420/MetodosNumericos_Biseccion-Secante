package metBiSec;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

public class FuncionSec {

    JEP jep = new JEP();

    public FuncionSec(String fun) {
        jep.addVariable("x", 0);
        jep.addStandardConstants();
        jep.addStandardFunctions();
        jep.parseExpression(fun);

        if (jep.hasError()) {
            System.out.println("Error carnal, checale");
        }
    }//cierra el metodo

    public double evaluacion(double x) {
        double fnX;
        jep.addVariable("x", x);
        fnX = jep.getValue();

        if (!jep.hasError()) {
            return fnX;
        } else {
            JOptionPane.showMessageDialog(null, "Verifiqué la función o sus datos de entrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return Double.NaN;
        }
    }//cierra el metodo
}//cierra la clase

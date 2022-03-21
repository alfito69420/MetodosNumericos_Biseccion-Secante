
package metBiSec;

public class SecTest {
    public static void main(String[] args) {
        FuncionSec f = new FuncionSec("x^2-2");
        MetodoSecante s = new MetodoSecante();
        
        System.out.println(s.metodoSecante(f, 3, 4, 100, 1e-6));
    }
}//cierra la clase


package metBi;

public class Principal {
    
    public static void main(String[] args) {
        
        MetodoBiseccion ob = new MetodoBiseccion();
        
        ob.setFuncion("x^2 - 5");
        double raiz = ob.metodoBiseccion(2, 2.5, 0.001);
        System.out.println(raiz);
    }//cierra el main
}//cierra la clase

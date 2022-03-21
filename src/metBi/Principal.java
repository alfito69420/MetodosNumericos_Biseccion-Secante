
package metBi;

/* 
ESTA CLASE FUE CREADA PARA HACER PRUEBAS 
DE LOS METODOS ANTES DE HABER IMPLEMENTADO
LA INTERFAZ GRAFICA, LA GRAFICA DE LA FUNCION,
LA TABLA, EL REDONDEO Y MUCHOS MAS DETALLES.
*/


public class Principal {
    
    public static void main(String[] args) {
        MetodoBiseccion ob = new MetodoBiseccion();
        
        ob.setFuncion("x^2 - 5");
        double raiz = ob.metodoBiseccion(2, 2.5, 0.001);
        System.out.println(raiz);
    }//cierra el main
}//cierra la clase

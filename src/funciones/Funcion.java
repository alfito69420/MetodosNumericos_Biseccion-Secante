package funciones;

import org.nfunk.jep.JEP;

public class Funcion {
    
    JEP jep;
    private double a = 0.0, b = 0.0;
    private double fnA= 0.0, fnB = 0.0, fnXr = 0.0;
    private double resultado = 0.0;
    private double Xr = 0.0;
    private double errorPermitido = 0.01;   //  Lo ingresa el usuario
    private double errorFn = 0.0;   //  Lo calculamos en el algoritmo
    private String funcion = "";    //  Almacena la funcion
    private String errorFuncion = "";
    
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }//cierra el metodo
    
    public double setValorA(double a) {
        return this.a = a;
    }//cierra el metodo
    
    public double setValorB(double b) {
        return this.b = b;
    }//cierra el metodo
    
    public double getResultado() {
        return this.resultado;
    }//cierra el metodo
    
    public String getError() {
        return this.errorFuncion;
    }//cierra el metodo
    
    public void evaluarFucion() {
        jep = new JEP();

        //  Se agregan las funciones y variables estandar
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();

        //  Se evaluan a y b en la funcion
        this.jep.addVariable("x", a);
        this.jep.parseExpression(this.funcion); //  se hace un parseo
        this.fnA = this.jep.getValue();   //  se recibe el resultado
        
        this.jep.addVariable("x", b);
        this.jep.parseExpression(this.funcion); //  se hace un parseo
        this.fnB = this.jep.getValue();   //  se recibe el resultado
        
        this.Xr = ((a+b)/2);
        this.jep.addVariable("x", Xr);
        this.jep.parseExpression(this.funcion);
        this.fnXr = this.jep.getValue();
        
        if(errorFn <= errorPermitido) {
            resultado = Xr;
        } else if((fnA*fnXr) == 0) {
            resultado = Xr;
        } else if((fnA*fnXr) > 0) {
            a = Xr;
        } else if((fnA*fnXr) < 0) {
            b = Xr;
        }
        
        this.errorFuncion = (this.jep.hasError())? "Ha sucedido un error":"No han habido errores";
    }//cierra el metodo
}//cierra la clase

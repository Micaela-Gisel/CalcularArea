package app;

import java.util.Scanner;
import app.CalcularArea.*;
         
public class Ejercicio {
   
   private static CalcularArea ca = new CalcularArea();
   private static Double altura = null;
   private static Double base = null;
   private static Double resultado = null;
   private static Double resultado1= null;
    
    public Ejercicio() {
       // super();
        
    }
    
    public static void main(String[] args) {
       // Ejercicio ejercicio = new Ejercicio();
          
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("ingrese la altura");
            altura = teclado.nextDouble();
            
            System.out.println("ingrese la base");
            base = teclado.nextDouble();
             
         
        resultado = ca.AreaR(base, altura);
       System.out.println("el área de un triángulo es: "+ resultado);
       
       resultado1= ca.AreaT(resultado);
       System.out.println("El área de un triángulo es:  "+resultado1 );
    }
}
   

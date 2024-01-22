package seccion3;

import java.util.Scanner;

public class Ejer_2 {
    public static void main(String[] args) {
        double num1=0, num2=0, reci = 0, coci = 0, prod = 0;
        double div=0;
        boolean condicion = true;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("""           
                                Partes de una divición
                                            5 <-- cociente
                                          ____
                           divisor --> 2 | 10 <-- dividendo
                                           10 
                                           --
                                            0 <-- residuo
                           """);
        try {
            System.out.print("Digita el divisor \n> ");
            num2=teclado.nextDouble();
            System.out.print("Digita el dividendo \n> ");
            num1=teclado.nextDouble(); 
            
            coci = num1 / num2;
            prod = num2 * coci;
            reci = num1 % num2;
            div = num1 / num2;
            
            if (num1 == 0 || num2 == 0) {
                condicion = false;
                System.out.println("No se puede dividir entre 0");
            }
            //while(!num1.matches("\\d{1,2}") || !num2.matches("\\d{1,2}")){ 
                
            // }
        } catch(Exception err){
            System.out.println("Deves ingresar numeros y que sean mayor a 0");
            condicion = false;
        }
         if (div >= 1.79769313486232e307) {
            System.out.println("la variable \"resultado\" supero su rango max");
        } else if (div <= -1.7976931348632e307 ) {
            System.out.println("la variable \"resultado\" supero su rango min");
        } else {
            System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " = " + div);
        }
         
        if(condicion==true){
            System.out.println("      " + coci);
            System.out.println("    ________");
            System.out.println(" " + num2 + " | " + num1);
            System.out.println("      " + prod);
            System.out.println("    -------");
            System.out.println("      " + reci);

            System.out.println("El resultado de la divición es: " + div);
        }
        // REPROBADOS EN ARQUITECTURA DE SFOWARE
        // OLIVER, DIEGO, GIOVANN        
    }
    
}

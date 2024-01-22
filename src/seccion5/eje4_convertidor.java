
package seccion5;

import java.util.Scanner;

public class eje4_convertidor {
    public static void main(String []args) {
        System.out.println("ESTE ES UN JUEGO DONDE TIENES QUE ADIVINAR UN NUMERO");
        EXTERNA:
        while(true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("""
                               1 - Soles Peruanos a dolares 
                               2 - Pesos Mexicanos a dolares
                               3 - Pesos Colombianos a dolares
                               4 - Salir
                               """);
            System.out.println("INGRESE UNA OPCION ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion) {
                case '1': 
                    convertir(3.63,"Peru > "); 
                    break;
                case '2': 
                    convertir(17.17,"México > ");
                    break;
                case '3': 
                    convertir(4180.52,"Colombia > ");
                    break;    
                case '4': 
                    System.out.println("FINALIZASTE EL PROGRAMA");
                    break EXTERNA;
                default:
                    System.out.println("¡OPCION INVALIDA!");
                    break;
                
            }
        }
    }
    
    static void convertir(double valorDolar, String pais) {
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double) Math.round(dolares * 100d) / 100;
        
        System.out.println(" --------------------------------- ");
        System.out.println(  "|    Tines $ "+dolares+" Dolares   |");
        System.out.println(" --------------------------------- ");
    }
}
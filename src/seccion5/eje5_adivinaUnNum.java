/**
 * Este es un ejemplo de lo que es javaDoc esto nos ayuda a saber un poco del 
 * algoritmo y de lo que puede ir
 * 
 * @param a El primer número entero.
 * @param b El segundo número entero.
 * @return La suma de los dos números enteros.
 * 
 * public int sumar(int a, int b) {
 * return a + b;
 * }
 * 
 */
package seccion5;
import java.util.Scanner;

public class eje5_adivinaUnNum {
    public static void main(String []args) {
        Scanner leer = new Scanner(System.in);
        
        EXTERNO:
        while(true) {
        System.out.println(""" 
                           ***************************
                           * ¡DIFICULTAD DEL JUEGO!  *
                           ***************************
                           """);
        System.out.println("""
                               1 - Facil   10 vidas 
                               2 - Normal  8  vidas
                               3 - Dificil 4  vidas
                               4 - Salir                               
                               """);
            System.out.print("> ");
        char opcion = leer.next().charAt(0);
            switch(opcion) {
                case '1':
                    jugar(10);
                    break;
                case '2':
                    jugar(8);
                    break;
                case '3':
                    jugar(4);
                    break;
                case '4':
                    System.out.println("¡GRACIAS POR SU PARTICIPACION!"); // se termina el juego
                    break EXTERNO;
                default: 
                    System.out.println("¡OPCION NO VALIDA!\n");
                    break;
            }
        }
    }
    
    static void jugar(int vidas) {
        
        int numRamdom = (int)(Math.random()*101); // generamos un numero aleatorio 
        int numElegido = -1;
        
        System.out.println("***************************");
        System.out.println("*   ¡ADIVINA EL NÚMERO!   *");
        System.out.println("***************************");
        System.out.println("               Tienes "+vidas+" vidas");
        System.out.println("");
        
        Scanner leer = new Scanner(System.in);
    
        EXTERNA:
        while(numRamdom != numElegido) {
            System.out.print("Ingrese un número entre 1 y 100 \n> ");
            numElegido = leer.nextInt();
            
            if(numRamdom < numElegido) {
                System.out.println("El número es mas pequeño ingresa un numero mas pequeño\n");
                vidas--;
            } else if (numRamdom > numElegido ){
                System.out.println("El número es mas grande ingresa un numero mas grande\n");
                vidas--;
            } 
            if ( vidas == 0) {
                System.out.println("\n GAME OVER");
                System.out.println("EL NUMERO ERA " + numRamdom);
                // System.out.println("¿QUIERES JUGAR OTRA VEZ?"); 
                // De manera grafica talvez con paginas web preguntar si es que 
                // quiere seguir juagando y limpiar la pantalla y empezar de nuevo
                break EXTERNA;
            }
                
            System.out.printf("Te quedan %d vidas \n",vidas);
            
            if (numElegido == numRamdom) {
                System.out.println("¡FELICIDADES HAS GANADO!\n");
            }
        }
        System.out.println("");
    }
}
 
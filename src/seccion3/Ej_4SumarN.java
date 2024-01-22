
package seccion3;

import java.util.Scanner;

public class Ej_4SumarN {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        int resultado = 0; 
        System.out.print("Digita el primer numero\n> ");
        int n1 = teclado.nextInt();
        
        System.out.print("Digita el segundo numero\n> ");
        int n2 = teclado.nextInt();
        
        resultado = n1 + n2;
        
        System.out.println("La suma de los dos numeros es " + resultado);
    }
}

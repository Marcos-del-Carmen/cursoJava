
package seccion3;

import java.util.Scanner;

public class Ejer_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digita el numero 1");
        int num1 = teclado.nextInt();
        
        System.out.println("Digita el numero 2");
        int num2 = teclado.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma  );
        System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta  );
        
    }
    
}

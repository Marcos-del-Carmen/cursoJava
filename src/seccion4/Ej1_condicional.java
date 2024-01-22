package seccion4;

import java.util.Scanner;

public class Ej1_condicional {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digita un numero para saber si es primo o par");
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    
}

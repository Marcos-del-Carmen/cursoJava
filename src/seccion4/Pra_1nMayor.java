package seccion4;

import java.util.Scanner;

public class Pra_1nMayor {
    
    public static void main(String []args){
        
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingresa un número\n> ");
        num1 = leer.nextInt();
        
        System.out.print("Ingresa otro número\n> ");
        num2 = leer.nextInt();
        
        if(num1 > num2) {
            System.out.printf("El número mayor es: %d \n", num1);
        } else {
            System.out.printf("El número mayor es: %d \n", num2);
        }
    }
}

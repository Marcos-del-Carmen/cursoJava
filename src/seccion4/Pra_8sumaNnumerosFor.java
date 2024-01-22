package seccion4;

import java.util.Scanner;

public class Pra_8sumaNnumerosFor {
    public static void main(String[]args) {
        Scanner teclado = new Scanner (System.in);
        int num,suma=0;
        
        System.out.print("Ingrea un número para sumarlo\n> ");
        num = teclado.nextInt();
        
        System.out.println("Rango de números");
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
            suma = suma + i;
        }
        System.out.println("");
        System.out.printf("Suma total de los números %d\n", suma);   
    }    
}

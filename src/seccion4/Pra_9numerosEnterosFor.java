package seccion4;
import java.util.Scanner;

public class Pra_9numerosEnterosFor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int i ,numI, numF, conta = 0;
        
        System.out.printf("Digita el número inicial\n> ");
        numI = teclado.nextInt();
        System.out.printf("Digita el número final\n> ");
        numF = teclado.nextInt();
        i = numI;
        System.out.println("Rango de números");
        
        for (i = 0; i <= numF; i++) {
            System.out.print(" "+i);
            conta++;
        }
        
        System.out.println("");
        System.out.println("El rango de los números es de: " + conta);
    }
}

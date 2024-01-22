package seccion4;
import java.util.Scanner;

public class Pra_7numerosEnteros {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int i , numI, numF, conta = 0;
        
        System.out.printf("Digita el número inicial\n> ");
        numI = teclado.nextInt();
        System.out.printf("Digita el número final\n> ");
        numF = teclado.nextInt();
        i = numI;
        System.out.println("Rango de números");
        
        while(i <= numF){
            System.out.print(" "+i);
            conta++;
            i++;
        }
        
        System.out.println("");
        System.out.println("El rango de los números es de: " + conta);
    }
}

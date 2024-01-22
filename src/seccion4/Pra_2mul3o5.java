package seccion4;
import java.util.Scanner;

public class Pra_2mul3o5 {
    public static void main(String []args){
        Scanner leer = new Scanner (System.in);
        int n;
        System.out.print("Digita un número en pantalla\n> ");
        n = leer.nextInt();
        
        if(n % 3 == 0 && n % 5 == 0){
            System.out.printf("%d es Multiplo de 3 y 5\n", n);
        } else {
            System.out.printf("%d no es Multiplo de 3 y 5\n", n);
        }
    }
}

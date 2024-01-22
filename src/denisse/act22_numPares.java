package denisse;
import java.util.Scanner;
public class act22_numPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.println("Ingresa dos numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        System.out.println("");
        while(a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a=a+1;
        }
    }    
}

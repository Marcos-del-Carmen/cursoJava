package denisse;
import java.util.Scanner;
public class act26_sumaDeDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n, p, d, potencia, trunc=0;
        
        System.out.print("Ingresa un número\n> ");
        n = teclado.nextInt();
        
        System.out.print("Igresa la potencia a elevar\n> ");
        p = teclado.nextInt();
        
        potencia = (int) Math.pow(n,p);
        
        d = 0;
        
        System.out.println("El numero " + n + " elevado a la potencia " + p + " es: " + potencia);
        while(potencia > 0) {
            d = d + (potencia % 10);
            potencia = (potencia/10);
        }
        System.out.println("La suma de sus digitos es " + d);
    }
    
}

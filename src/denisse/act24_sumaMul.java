package denisse;

import java.util.Scanner;

public class act24_sumaMul {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
      double a, d, s = 0;
      
        System.out.println("Ingresa un número");
        d = teclado.nextDouble();

        a = 1;

        while(a<d) {
            if (a % 3 <= 0 || a % 5 <= 0) {
                s = s + a;
                System.out.println(a);
            }
            a = a + 1;
            
        }
        System.out.println("La suma total es: " + s);
    }
    
}

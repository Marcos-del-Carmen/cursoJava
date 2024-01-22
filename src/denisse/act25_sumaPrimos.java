package denisse;

import java.util.Scanner;

public class act25_sumaPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, n, c, a, s=0;
        
        System.out.println("Ingresa un número");
        a = teclado.nextInt();
        
        for (n = 1; n < a; n++) {
            x = 1;
            c = 0;
            while(x <= n) {
                if(n % x == 0){
                    c = c + 1;
                }
                x = x + 1;
            }
            if (c == 2) {
                System.out.println("Los numeros primos son: " + n);
                s = s + n;
            }
        }
        System.out.println("La suma es: " + s);
    }    
}

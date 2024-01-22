
package denisse;
import java.util.Scanner;
public class act23_estaturaPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double su, pr = 0, c, e;
        System.out.println("Estatura de las personas");
        e = teclado.nextDouble();
        
        su = 0;
        c = 0;
        
        while(e>0){
            su = su + e;
            e = teclado.nextDouble();
            c = c + 1;
        }
        if (c == 0){
            System.out.println("No hay estaturas");
        } else {
            pr = su / c;
        }
        System.out.println("La estatura primedio es: " + pr);
    }
    
}

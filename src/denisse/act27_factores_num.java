package denisse;
import java.util.Scanner;
public class act27_factores_num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double d, a;
        a=1;
        System.out.print("Ingrese un número\n> ");
        d = teclado.nextDouble();
        
        for (int i = 1; i < d; i++) {
            System.out.println("El factor es " + i);
            a = a * i;
        }
        System.out.println("El factorial es: " + a);        
    }
    
}

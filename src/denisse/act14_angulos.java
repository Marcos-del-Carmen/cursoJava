package denisse;
import java.util.Scanner;
public class act14_angulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c;
        
        System.out.println("Digita los angulos: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        
        c = 180-(a+b);
        
        if (a == 90 || b == 90 || c == 90) {
            System.out.println("Es un triangulo rectangulo");
        } else {
            if (a < 90 && b<90 && c < 90){
                System.out.println("Es un triangulo acutangulo");
            } else {
                if(a > 90 || b > 90 || c > 90){
                    System.out.println("Es triangulo obsgulo");
                } else {
                    System.out.println("No es un triangulo");
                }            
            }
        }
    }
    
}

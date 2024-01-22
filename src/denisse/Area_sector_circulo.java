
package denisse;
import java.util.Scanner;
public class Area_sector_circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double area, radio, g;
        System.out.print("Ingresa los grados\n>");
        g = teclado.nextDouble();
        
        System.out.println("Ingresa el rad\n>");
        radio = teclado.nextDouble();
        
        area = (Math.PI*Math.pow(radio,2)*g)/360;
        
        System.out.println("El área de circulo es : " + area);
    }
    
}

package denisse;
import java.util.Scanner;
public class Area_volumen_cono {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double rad,altura, aT, v, g;
        
        System.out.print("Capturar la altura\n>");
        altura = teclado.nextDouble();
        
        System.out.print("Capturar el radio\n>");
        rad = teclado.nextDouble();
        
        g = Math.sqrt(altura*Math.pow(altura,2)+Math.pow(rad,2));
        aT = Math.PI*rad*(rad+g);
        v = (Math.PI*Math.pow(rad,2)*altura)/3;
        
        System.out.println("El área total del cono es: " + aT);
        System.out.println("El volumen del cono es: " + v);
    }
    
}

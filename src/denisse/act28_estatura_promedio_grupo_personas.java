package denisse;
import java.util.Scanner;
public class act28_estatura_promedio_grupo_personas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double su, pr, c, e;
        
        System.out.print("Estatura de las personas\n> ");
        e = teclado.nextDouble();
        
        su = 0;
        c = 0;
        
        while (e>0){
            su = su + e;
            e = teclado.nextDouble();
            c = c + 1;
        }
        if(c == 0) {
            System.out.println("No hay esturas");
        } 
        pr = su / c;
        System.out.println("La estatura promedio es: " + pr);
    }
    
}

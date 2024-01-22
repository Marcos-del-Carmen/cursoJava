package denisse;
import java.util.Scanner;
public class act11_calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int ca1, ca2, ca3;
        double promedio;
        System.out.println("Vamos a verificar si el alumno esta reprobado en la materia");
        System.out.print("Digita la calaficacion del 1° parcial\n> ");
        ca1 = teclado.nextInt();
        System.out.print("Digita la calaficacion del 2° parcial\n> ");
        ca2 = teclado.nextInt();
        System.out.print("Digita la calaficacion del 3° parcial\n> ");
        ca3 = teclado.nextInt();
        promedio = (ca1 + ca2 + ca3) / 3;
        
        if(ca1>=8 && ca2>=8 && ca3>=8) {
            System.out.println("El aprobo la meteria");
            System.out.println("Su calificacion es de " + promedio);
        } else {
            System.out.println("El alumno esta reprobado");
            System.out.println("Su calificacion es de " + promedio);
        }
    }
}

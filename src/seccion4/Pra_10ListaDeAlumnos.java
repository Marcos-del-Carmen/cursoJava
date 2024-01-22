package seccion4;
import java.util.Scanner;

public class Pra_10ListaDeAlumnos {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        
        System.out.print("¿Cuantos alumnos vas a registrar?\n> ");
        cantidad = teclado.nextInt();
        String[] nombres = new String[cantidad];
        double[] calificacion = new double[cantidad];
        
        for (int i = 0; i <= nombres.length; i++) {
            System.out.print("Apellido y nombre del alumno \n> ");
            nombres[i] = teclado.toString();
            System.out.print("Calificación del primer parcial\n> ");
            calificacion[i] = teclado.nextDouble();
        }
        System.out.println(" _______________________________");
        System.out.println("|       DATOS DEL ALUMNO        |");
        System.out.println("|-------------------------------|");
        
        for (int j = 0; j <= nombres.length; j++) {
            System.out.println("| " + nombres[j] + calificacion[j]);
            
        }
        System.out.println("|-------------------------------|");
        
    }
}

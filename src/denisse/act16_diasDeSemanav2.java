package denisse;
import java.util.Scanner;
public class act16_diasDeSemanav2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int semana;
        
        System.out.println("Digita un numero de la semana\n 1 = lunes, 2 = martes 3 = mier...");
        semana = teclado.nextInt();
        
        switch(semana){
            case 1: 
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Solo se pueden ingresar numeros del 1 al 7s");
                break;
        }
    }
    
}


package seccion4;
import java.util.Scanner;

public class Ej2_condicionalAnidado {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        // En este caso se tienen que tomar un rango de numeros más grande 
        // Aunque todos los numeros que se tienen que ingresar son enteros
        System.out.print("Digita un numero\n>");
        num = leer.nextInt();
        
        if(num != 0) {
            
            if(num > 0){
                if(num % 2 == 0){
                    System.out.printf("El número: %d es PAR POSITIVO\n", num);
                } else {
                    System.out.printf("El número: %d es IMPAR POSITIVO\n", num);
                }
            } else {
                if (num % 2 == 0) {
                    System.out.printf("El número: %d es PAR NEGATIVO\n", num);
                } else {
                    System.out.printf("El número: %d es IMPAR NEGATIVO\n", num);
                }

            }
            
        } else {
            System.out.printf("El número: %d es NEUTRO", num);
        }
        
    }
    
}

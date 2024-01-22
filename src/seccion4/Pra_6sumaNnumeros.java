package seccion4;
import java.util.Scanner;
public class Pra_6sumaNnumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, suma = 0, i = 0;
        
        System.out.print("Hacemos una suma de números \n"
                       + "Digita un número \n> ");
        num = teclado.nextInt();
        
        while(i <= num) {
            suma = suma + i;
            i++;
        }
        
        System.out.printf("Ingresaste el número es de 0 al %d\n", num);
        System.out.printf("La suma de los números es %d\n", suma);
    }
}

package denisse;
import java.util.Scanner;

public class act21_factorial {
    static int factorial(int num) {
        int resultado=1;
        for(int i = 1; i <= num; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, r;
        int combinaciones;
        
        System.out.println("Ingresa el valor de n y r");
        System.out.print("> ");
        n = teclado.nextInt();
        System.out.print("> ");
        r = teclado.nextInt();
        
        int resta = n-r; 
        int num1 = factorial(n);
        int num2 = factorial(r);
        
        int factorialResta = factorial(resta);
        combinaciones = num1 / (factorialResta * num2);
        System.out.println("El numero de combinaciones es " + combinaciones);
    }   
}

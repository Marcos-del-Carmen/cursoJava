package capitulo2;
import java.util.Scanner;
public class ejercicio2_15 {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        int sum, res, pro, div;
        // Esta aplicacion calcula la suma, resta, producto y divicion de dos numeros
        System.out.print("Digita un número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digita otro numero: ");
        int num2 = teclado.nextInt();
        
        sum = num1 + num2;
        res = num1 - num2;
        pro = num1 * num2;
        div = num1 / num2;
        
        System.out.printf("%d + %d = %d %n", num1, num2, sum);
        System.out.printf("%d - %d = %d %n", num1, num2, res);
        System.out.printf("%d * %d = %d %n", num1, num2, pro);
        System.out.printf("%d / %d = %d %n", num1, num2, div);
        
    }
}

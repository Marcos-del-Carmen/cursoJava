package capitulo2;
import java.util.Scanner;
public class ejercicio2_16 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        System.out.print("Ingresa el número 1: ");
        n1 = teclado.nextInt();
        System.out.print("Ingresa el número 2: ");
        n2 = teclado.nextInt();
        
        if(n1>n2)
            System.out.printf("Es mayor %d %n",n1);
        if(n1==n2)
            System.out.printf("Los numeros son iguales%n");
        if(n2>n1)
            System.out.printf("Es mayor %d %n",n2);
    }
}

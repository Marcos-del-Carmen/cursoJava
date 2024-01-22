package capitulo2;
import java.util.Scanner;
public class ejercicio2_17 
{
    public static void main(String[]args)
    {
        // Esta aplicacion muestra la suma, promedio, producto, menor y mayor de esos números.
        Scanner teclado = new Scanner (System.in);
        int n1, n2, n3, suma, promedio;
        System.out.print("Número 1: ");
        n1 = teclado.nextInt();
        System.out.print("Número 2: ");
        n2 = teclado.nextInt();
        System.out.print("Número 3: ");
        n3 = teclado.nextInt();
        
        suma = n1 + n2 + n3;
        
        promedio = suma / 3;
        
        System.out.printf("La suma de los números es %d%n",suma);
        System.out.printf("El promedio de los números es %d%n",promedio);
        
        if(n1>n2)
            if(n1>n3)
                System.out.printf("Número 1 es mayor %d%n",n1);
        if(n2>n1)
            if(n2>n3)
                System.out.printf("Número 2 es mayor %d%n",n2);
        if(n3>n1)
            if(n3>n2)
                System.out.printf("Número 3 es mayor %d%n",n3);
    }
}

package capitulo2;

import java.util.Scanner;
public class ejercicio2_24 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        System.out.print("Número 1: ");
        n1 = teclado.nextInt();
        System.out.print("Número 2: ");
        n2 = teclado.nextInt();
        System.out.print("Número 3: ");
        n3 = teclado.nextInt();
        System.out.print("Número 4: ");
        n4 = teclado.nextInt();
        System.out.print("Número 5: ");
        n5 = teclado.nextInt();
        
        if(n1>n2)
            if(n1>n3)
                if(n1>n4)
                    if(n1>n5)
                        System.out.printf("Número 1 es mayor: %d%n",n1);
        if(n2>n1)
            if(n2>n3)
                if(n2>n4)
                    if(n2>n5)
                        System.out.printf("Número 2 es mayor: %d%n",n2);
        if(n3>n1)
            if(n3>n2)
                if(n3>n4)
                    if(n3>n5)
                        System.out.printf("Número 3 es mayor: %d%n",n3);
        if(n4>n1)
            if(n4>n2)
                if(n4>n3)
                    if(n4>n5)
                        System.out.printf("Número 4 es mayor: %d%n",n4);
        if(n5>n1)
            if(n5>n2)
                if(n5>n3)
                    if(n5>n4)
                        System.out.printf("Número 5 es mayor: %d%n",n5);
    }
}

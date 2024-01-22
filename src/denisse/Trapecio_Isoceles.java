package denisse;

import java.util.Scanner;
public class Trapecio_Isoceles 
{

    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        double bm, baseM, a, l;
        double area = 0, perimetro = 0;
        
        System.out.print("Ingresa Base M\n>");
        baseM = teclado.nextDouble();
        System.out.print("Ingrese Bm\n>");
        bm = teclado.nextDouble();
        System.out.print("Ingresa A\n>");
        a = teclado.nextDouble();
        
        area = ((baseM+bm)*a)/2;
        l = Math.sqrt(Math.pow(((baseM+bm)/2),2) + Math.pow(a,2));
        perimetro = (l + l + bm + baseM);
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
        
    }
    
}

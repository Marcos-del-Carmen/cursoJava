package capitulo2;

import java.util.Scanner;
public class ejercico2_28circulo 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double r, diametro, circuferencia, area;
        double PI=Math.PI;
        System.out.println("Esta aplicacion calculara el diametro, circuferencia y área de un circulo ");
        System.out.print("Radio: ");
        r = teclado.nextDouble();
        
        diametro = 2*r;
        circuferencia = 2*PI*r;
        area = PI*Math.pow(r,2);
        
        System.out.printf("Diametro: %.2f circuferencia: %.2f área: %.2f%n",diametro,circuferencia,area);
        
    }
}

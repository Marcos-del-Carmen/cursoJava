package capitulo2;
import java.util.Scanner;
public class Act5_EcuacionDeSegundoGrado 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c, s;
        double area = 0, perimetro=0;
        
        
        // Lo que ara el programa
        System.out.println("Este pseudocodigo calcula el perémetro y área de un triangulo con la formula de herón\n");
        
        // Pedir datos 
        System.out.print("Digita el valor a\n>");
        a = teclado.nextDouble();
        System.out.print("Digita el valor b\n>");
        b = teclado.nextDouble();
        System.out.print("Digita el valor c\n>");
        c = teclado.nextDouble();
        
        // Formulas
        perimetro = a + b + c;
        s = perimetro / 2; 
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("El perímetro del triangulo es = " + perimetro);
        System.out.println("El área del triangulo es = " + area);
    }
}

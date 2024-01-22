package capitulo2;
import java.util.Scanner;
public class ejercicio2_25paroImpar 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        System.out.println("Digita un número para verificar si es par o impar");
        numero = teclado.nextInt();
        parOimpar(numero);
    }
    static String parOimpar (int n) 
    {
        String resultado = "";
        if(n%2==0)
            resultado="El número es par";
        if(n%2!=0)
            resultado="El número es impar";
        
        return resultado; 
    }

}

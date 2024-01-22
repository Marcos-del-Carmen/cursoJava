package seccion4;
import java.util.Scanner;

public class Pra_4swinchNumAletras {
    public static void main(String[] args){        
        Scanner teclado = new Scanner (System.in);
        int n;
        char r = '\0';
        
        System.out.print("Ingresa un número del 0 al 9\n> ");
        n = teclado.nextInt();
        
        switch(n) {
            case 0:
                r = 'a';
                break;
            case 1:
                r = 'b';
                break;
            case 2:
                r = 'c';
                break;
            case 3:
                r = 'd';
                break;
            case 4:
                r = 'e';
                break;
            case 5:
               
                r = 'f';
                break;
            case 6:
                r = 'g';
                break;
            case 7:
                r = 'h';
                break;
            case 8:
                r = 'i';
                break;
            case 9:
                
                r = 'j';
                break;
            default: 
                System.out.println("Tienes que ingresar un número en rango de 0 a 9");
        }
        System.out.println("");
        System.out.println("Ingresaste " + n + " la letra que se devuelve es \"" + r + "\"");
        
    }
}

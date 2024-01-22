package seccion4;
import java.util.Scanner;
public class Ej3_condicionMul {
    public static void main (String []args){
        Scanner leer = new Scanner (System.in);
        char letra; 
        
        System.out.print("Ingresa una vocal\n>");
        letra = leer.next().charAt(0);
        
        if(letra == 'a' || letra=='A'){
            System.out.printf("%s una vocal", letra);
        } else if(letra == 'e' || letra=='E'){
            System.out.printf("%s una vocal", letra);
        } else if(letra == 'i' || letra=='I'){
            System.out.printf("%s una vocal", letra);
        } else if(letra == 'o' || letra=='O'){
            System.out.printf("%s una vocal", letra);
        } else if(letra == 'u' || letra=='U'){
            System.out.printf("%s una vocal", letra );
        } else {
            System.out.printf("No es una vocal");
        }
        
    }
}
package denisse;
import java.util.Scanner;
public class act12_ordenDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.println("Vamos a ordenar numeros\n");
        System.out.print("Digita el numero 1\n> ");
        n1 = teclado.nextInt();
        System.out.print("Digita el numero 2\n> ");
        n2 = teclado.nextInt();
        System.out.print("Digita el numero 3\n> ");
        n3 = teclado.nextInt();
        
        if(n1 < n2) {
            if (n2 < n3) {
                System.out.println(n1+", "+n2+", "+n3);
            } else {
                if (n1<n3){
                    System.out.println(n1+", "+n3+", "+n2);
                } else {
                    System.out.println(n3+", "+n1+", "+n2);     
                }   
            }
        } else {
            if(n1 < n3){
                System.out.println(n2+", "+n1+", "+n3);
            } else {
                if (n2 < n3){
                    System.out.println(n2+", "+n3+", "+n1);
                } else {
                    System.out.println(n3+", "+n2+", "+n1);
                }
            }   
        }
    }    
}

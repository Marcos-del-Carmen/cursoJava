package denisse;
import java.util.Scanner;
public class act13_numeroMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a, b, c, d, e;
        
        System.out.print("Digita 5 numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        e = teclado.nextInt();
        
        if (a > b && a > c && a > d && a > e) {
            System.out.println("El numero mayor es " + a);
        } 
        else {
            if (b > a && b > c && b > d && b > e) {
                System.out.println("El numero mayor es " + b);
            } else {
                if(c > a && c > b && c > d && c > e){
                   System.out.println("El numero mayor es " + c); 
                } else {
                    if(d > a && d > b && d > c && d > e){
                        System.out.println("El numero mayor es " + d); 
                    } else {
                        if(e > a && e > b && e > c && e > d){
                           System.out.println("El numero mayor es " + e); 
                        } 
                    }
                }
            }
        }
        if (a < b && a < c && a < d && a < e) {
            System.out.println("El numero menor es " + a);
        } 
        else {
            if (b < a && b < c && b < d && b < e) {
                System.out.println("El numero menor es " + b);
            } else {
                if(c < a && c < b && c < d && c < e){
                   System.out.println("El numero menor es " + c); 
                } else {
                    if(d < a && d < b && d < c && d < e){
                        System.out.println("El numero mayor es " + d); 
                    } else {
                        if(e < a && e < b && e < c && e < d){
                           System.out.println("El numero menor es " + e); 
                        } 
                    }
                }
            }
        }
    
    }
}

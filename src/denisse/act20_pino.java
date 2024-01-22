package Denisse;
import java.util.Scanner;
public class act20_pino {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double espacio, fig, renglon, t, k = 0, num, m;
        String e="", f="";
        
        System.out.println("Digita un numero a ecepcion de un negativo o 0");
        num = teclado.nextInt();
        
        m = num/3*2;
        espacio = m-1;
        fig = 1;
        renglon = 1;
        
        while(renglon <= num){
            if(renglon<=m){
                t=1;
                while(t<=espacio){
                    e=e+" ";
                    t=t+1;
                }
                espacio=espacio-1;
                k=1;
                while(k<=fig){
                    f=f+"*";
                    k=k+1;
                }
                fig=fig+2;
                System.out.println(e + f);
                e = "";
                f = "";
            } else {
                t = 1;
                e = "";
                while(t<(k/2)){
                    e = e + " ";
                    t = t + 1;
                }
                System.out.println(e+"*");
                        
            }
          renglon = renglon + 1;  
        }
    }
    
}

package seccion4;
import java.util.Scanner;

public class Pra_3switchEstaciones {
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in); 
        int n;
        String estacionMes = null;
        
        System.out.print("""
                          _____________________
                         | Número  | Estación  |
                         | :-----: | :-------- |
                         |    1    | Verano    |
                         |    2    | Otoño     |
                         |    3    | Invierno  |
                         |    4    | Primavera |
                         |---------|-----------|
                         Digita un número
                         >  """);
        n = leer.nextInt();
        
        switch(n){
            case 1:
                estacionMes = "Verano";
                break;
            case 2:
                estacionMes = "Otoño";
                break;
            case 3:
                estacionMes = "Invierno";
                break;    
            case 4:
                estacionMes = "Primavera";
                break;
            default:
                System.out.println("\"Ingresa un valor en el rango de 1 a 4\"");
                
        }
        System.out.println("");
        System.out.printf("La estación del año es %s\n",estacionMes);
        
    }
}

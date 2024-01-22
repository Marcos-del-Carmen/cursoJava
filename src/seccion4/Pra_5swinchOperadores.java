package seccion4;
import java.util.Scanner;
public class Pra_5swinchOperadores {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        int opc;
        int num1=0, num2=0, resultado = 0;
        String nomOpc = null;
        char signo = '\0';
        System.out.println("Ingresa el número de la operación que quieres realizar");
        System.out.print("""
                            ___________________
                           |Operación | Opción | 
                           |----------|--------|
                           | Sumá     |    1   |
                           | Resta    |    2   |
                           | Multi    |    3   |
                           | Divición |    4   |
                           |----------|--------|
                           > """);
        opc = teclado.nextInt();
        
        switch (opc){
            case 1: 
                nomOpc = "Sumá";
                signo = '+';
                System.out.print("Digita el primer sumando\n> ");
                num1 = teclado.nextInt();
                System.out.print("Digita el segundo sumando\n> ");
                num2 = teclado.nextInt();
                resultado = num1 + num2;
                break;
            case 2:
                nomOpc = "Resta";
                signo = '-';
                System.out.print("Digita el minuendo\n> ");
                num1 = teclado.nextInt();
                System.out.print("Digita el sustraendo\n> ");
                num2 = teclado.nextInt();
                resultado = num1 - num2;
                break;
            case 3:
                nomOpc = "Multiplicación";
                signo = '*';
                System.out.print("Digita el multiplicado\n> ");
                num1 = teclado.nextInt();
                System.out.print("Digita el multiplicador\n> ");
                num2 = teclado.nextInt();
                
                    if(num1 == 0 || num2 == 0) {
                        resultado = 0;
                    } else {
                        resultado = num1 * num2;
                    }
                
                break;
            case 4: 
                nomOpc = "Divición";
                signo = '/';
                System.out.print("Digita el divisor\n> ");
                num1 = teclado.nextInt();
                System.out.print("Digita el dividendo\n> ");
                num2 = teclado.nextInt();
                
                    if(num1 == 0 || num2 == 0) {
                        resultado = 0;
                        System.out.println("¡ERROR!");
                        System.exit(1);
                    } else {
                        resultado = num2 / num1;
                    }
                
                break;
            default:
                System.out.println("Ingresa un número en el rango de 1 a 4");
                
        }
        System.out.printf("La opción que seleccionada fue la %d\n", opc);
        System.out.printf("Operación a realizar \"%s\"\n", nomOpc);
        System.out.printf("Digitos ingresados: %d %s %d = '%d\n",num1,signo,num2,resultado);
    }
}

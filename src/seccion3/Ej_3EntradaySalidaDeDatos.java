package seccion3;

import java.util.Scanner;

public class Ej_3EntradaySalidaDeDatos {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\t  Marcos Sánchez del Carmen");
        System.out.println("\t Saúl Nava Luciano");
        System.out.println("\t   Francisco Ramirez Martinez");
        
        System.out.print("¿Cual es tu nombre?\n> ");
        String nombre = teclado.nextLine();
        System.out.print("¿Cuantos años tienes?\n> ");
        byte edad = teclado.nextByte();
        System.out.print("¿Cual es tu eltura?\n> ");
        double altura = teclado.nextDouble();
       
        System.out.println("El nombre de la persona es: " + nombre + " su edad es de: " + edad + " años con una altura de: " + altura);
        System.out.printf("El nombre de la persona es: %s su edad es de: %d años con una altura de: %f \n", nombre, edad, altura);
        System.out.println("Estos caracteres no estan permitidos \" \" \\ ");
    }
}

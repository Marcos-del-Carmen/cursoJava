package metodosDeOrdenamiento;

import java.util.Scanner;

public class BurbujaNombres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres[];  // Cambiar el tipo de arreglo a String
        int nElementos;

        System.out.println("Asigna el tamaño al arreglo");
        System.out.print("> ");
        nElementos = teclado.nextInt();

        nombres = new String[nElementos];  // Crear un arreglo de String
        System.out.println("El tamaño de tu arreglo es de " + nombres.length);
        teclado.nextLine();  // Consumir la nueva línea pendiente
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            
            nombres[i] = teclado.nextLine();  // Leer el nombre
        }

        for (int i = 0; i < nElementos - 1; i++) {
            for (int j = 0; j < nElementos - 1; j++) {
                // Comparar los nombres utilizando el método compareToIgnoreCase para ordenar sin considerar mayúsculas y minúsculas
                if (nombres[j].compareToIgnoreCase(nombres[j + 1]) > 0) {
                    String temp = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = temp;
                }
            }
        }

        System.out.println("Nombres ordenados:");

        for (int i = 0; i < nElementos; i++) {
            System.out.println(nombres[i]);
        }
    }
}

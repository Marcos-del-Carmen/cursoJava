package seccion4;

public class Ej10_array {
    public static void main(String[] args){
        String nombres[]; //Declaración
        
        nombres = new String[3]; // Rango del array 
        
        nombres[0] = "Marcos Sánchez"; // Asignación
        nombres[1] = "Saúl Nava";
        nombres[2] = "Francisco Ramiréz";
        
        for (int i = 0; nombres.length > i; i++) { // Salida del mensajes
            System.out.println(nombres[i]);
        }
        
    }

}
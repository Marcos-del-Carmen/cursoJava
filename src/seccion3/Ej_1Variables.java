
package seccion3;

public class Ej_1Variables {
    public static void main(String []args){
        // EJEMPLO DE CADENAS DE TEXTO Y NUMERICOS
        // 
        String nombreCompleto = "Marcos Sánchez del Carmen"; // chart  
       
        // almacenamos valores de texto o cadenas de texto ya que String como tal es un objeto que almacena una cadena de caracteres a diferencia del chart que solo almacena una letra o un caracter de texto 
        
        int edad = 21; // int, short, long, float y double Cada uno tiene su capacidad diferente ya que tiene un valor min y un max
        // almecenamos un valor numero
        double peso = 55.40; 
        double altura = 1.69;
        
        System.out.println("INTERNAMENTE CONCATENA VALORES Y REALIZA UNA OPERACION ARITMETICA\n");//como una suma de numeros o resta entre otras 
        System.out.println("El ciudadano " + nombreCompleto + " tiene " + edad + " años.");
        System.out.println("Su indice de masa muscular es: " + (peso/altura*altura)+"\n");
        
        System.out.println("               TIPOS DE DATOS PRIMITIVOS               ");
        System.out.println("""
                            Son un tipo de dato heredado de lenguajes de programacion
                            no orientada a objetos, como puede ser el C. Tienen cier-
                            tas particularidades, que no comparten con otras clases 
                            mas complejas, como por ejemplo que no necesitan ser dec-
                            larados.""");
        
        byte v1 = 127;
        short v2 = 32767;
        int v3 = 2147483647;
        long v4 = 9223372036854775807L;
        float v5 = 892.90f; 
        
        boolean condicion = true;
        
        char letra = 'a';
        
    }
}

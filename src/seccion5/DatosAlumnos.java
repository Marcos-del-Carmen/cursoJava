package seccion5;

public class DatosAlumnos 
{
    public static void main(String[] args)
    {
        System.out.print("Datos del alumno\n Nombre y apellido: ");
        
        System.out.print(Nombre("Marcos","Sánchez"));
        
        System.out.println("La suma de dos números es: " + sumar(10, 20));
        
        System.out.println("El factorial " + factorial(5));
    }
    static String Nombre(String nombre, String apellido) 
    {
        return nombre + " " + apellido;
    }
    
    static int sumar (int a, int b) 
    {
        return a + b; 
    }    
    static int factorial(int numero)
    { 
        if( numero > 1){
            numero = numero * factorial(numero - 1);
        }
        return numero;
    }
}

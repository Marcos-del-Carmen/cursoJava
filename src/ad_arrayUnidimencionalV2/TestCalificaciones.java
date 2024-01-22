package ad_arrayUnidimencionalV2;


import java.util.Scanner;

public class TestCalificaciones 
{
    public static void main (String args[])
    {
        Scanner teclado = new Scanner(System.in);
        Calificaciones c = new Calificaciones();
        
        boolean salir = false;
        
        while(!salir){
            System.out.println("""
                                ___________________________
                               | SISTEMA DE CALIFICACIONES |
                               |---------------------------|
                               | 1) AGREGAR ALUMNO         |
                               | 2) MOSTRAR ALUMNOS        |                               
                               | 3) SALIR DEL SISTEMA      |
                               |___________________________|
                               """);
            System.out.print("> ");
            int rest = teclado.nextInt();
            
            switch(rest){
                case 1:
                    c.agregarAlumno();
                break;
                case 2: 
                    c.mostrarDatos();
                    break;
                case 3: 
                    salir=true;
                    break;
                default: 
                    System.out.println("""
                                        _______________________________
                                       | LA OPCION QUE SELECCIONASTE   |
                                       | ES INVALIDA ELIGUE OTRA OPCION|
                                       |_______________________________|
                                       """);
                    break;
            }
            
        }
        
        
    }
}
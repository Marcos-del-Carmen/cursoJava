package ad_arrayUnidimencionalV1;

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
                                _________________________________
                               | SISTEMA DE CALIFICACIONES       |
                               |---------------------------------|
                               | 1) AGREGAR ALUMNO               |
                               | 2) AGREGAR CALIFICACION         |
                               | 3) MOSTRAR ALUMNOS              |
                               | 4) MEJORES PROMEDIOS            |
                               | 5) METODOS DE ORDENACION        |
                               | 6) SALIR DEL SISTEMA            |
                               |_________________________________|
                               """);
            System.out.print("> ");
            int rest = teclado.nextInt();
            
            switch(rest){
                case 1:
                    System.out.println(">> AGREGA A UN ALUMNO");
                    c.agregarAlumno();
                break;
                case 2:
                    System.out.println(">> AGREGA CALIFICACION POR MATERIA");
                    c.agregarCalificacion();
                    break;
                case 3: 
                    System.out.println(">> CALIFICACIONES DE ALUMNOS");
                    c.mostrarCalificaciones();
                    break;
                case 4:
                    System.out.println(">> LOS MEJORES PROMEDIOS");
                    c.mejoresCalificaciones();
                    break;
                case 5:
                    System.out.println(">> METODOS DE ORDENACION ");
                    c.metodosDeOrdenacion();
                    break;
                case 6:
                    System.out.println("""
                                        _______________________________
                                       |      FIN DE LA EJECUCION      |                                       
                                       |_______________________________|
                                       """);
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
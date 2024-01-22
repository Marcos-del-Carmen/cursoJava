package denisse;

import java.text.DecimalFormat;

public class ArregloPromedios {

    public static void main(String[] args) {
        String[] materias = {"Matematicas", "Fisica", "Programacion"};
        String[] alumnos = {"Denisse Diaz", "Sergio Uriel", "Paola Diaz", "Marcos Sánchez", "Hannia Martinez"};
        
        double[][] calificaciones = {
            // Calificaciones de matematicas
            {8.5, 8.0, 8.5}, // Ale
            {9.0, 8.5, 9.0}, // Sergio
            {9.5, 9.0, 9.5}, // Pao
            {9.5, 9.0, 9.5},
            {9.5, 9.0, 9.5},
            // Calificaciones de fisica
            {10.0, 9.7, 9.5}, // Ale
            {8.0, 9.5, 9.7}, // Sergio
            {9.8, 9.6, 9.8}, // Pao
            {9.8, 9.6, 9.8},
            {9.8, 9.6, 9.8},
            // Calificaciones de programación
            {9.5, 9.0, 9.5}, // Ale
            {9.0, 9.5, 9.0}, // Sergio
            {9.5, 9.0, 9.5}, // Pao
            {9.0, 9.5, 9.0},
            {9.0, 9.5, 9.0}
        };
        
        int numMaterias = materias.length;
        int numAlumnos = alumnos.length;
        int numParciales = 3; // parciales por materia
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.print("Nombre del Alumno");
        System.out.print("\tEP1\tEP2\tEP3\tEProm");
        System.out.print("\tIP1\tIP2\tIP3\tIProm");
        System.out.print("\tFP1\tFP2\tFP3\tFProm");
        
        System.out.println(); // Salto de linea
        // En el primer ciclo lo que hacemos es pasar de alumno por alumno osea que recoremos los alumnos que haya
        for (int j = 0; j < numAlumnos; j++) {
            
            System.out.print(alumnos[j] + "\t\t"); // mostramos el nombre del alumno
            // En este ciclo recorremos las materias que tenga el alumno en este caso todos los alumnos tienen las mismas materias asi que son 3
            for (int i = 0; i < numMaterias; i++) {              
                double sumCalificaciones = 0.0; // en esta variable vamos a guardar la suma de las calificaciones

                // Mostramos las calificaciones por cada materia que tenga cada alumno
                for (int k = 0; k < numParciales; k++) {
                    // [0,0 ;0,1; 0,2]  {9.4, 9.1, 9.3}
                    // [1,0 ;1,1; 1,2]  {9.0, 9.5, 9.2}
                    // [2,0 ;2,1; 2,2]  {9.8, 9.6, 9.7}
                    // queremos obtener la califiacion en la posicion j == 1 y k == 1 el resultado tiene que ser 9.5
                    double calificacion = calificaciones[(i * numAlumnos) + j][k]; // lo que se intenta hacer es acceder ala calificacion del alumno como lo vemos en el ejemplo anterior 
                    System.out.print(calificacion + "\t");
                    sumCalificaciones += calificacion;
                }                
                double promedio = sumCalificaciones / numParciales; // ya que tenemos la suma de las calificaciones las dividimos en el numero de parcial obteniendo el pormedio
                String promedioRedondeado = df.format(promedio); 
                System.out.print(promedioRedondeado); // redondeamos el promedio

                // Agregar separador entre registros
                System.out.print("|\t");
            }
            // Nueva línea para la siguiente fila donde muestra los resultados del alumno correspondiente
            System.out.println(); 
        }
        
    }
    
    
}
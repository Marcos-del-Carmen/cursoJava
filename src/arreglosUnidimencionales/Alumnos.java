package arreglosUnidimencionales;

import java.util.Arrays;

public class Alumnos {
    private String[] materias = {"Español", "Fisica", "Quimica"};
    private String[] alumnos = { "Panfilo Perez", "Daniela Garcia", "David Martinez", "Gloria Angeles", "Pedro Gonzales" };

    private double[][] c1_mat1 = {
        {8.5, 8.0, 8.5}, 
        {9.0, 8.5, 9.0}, 
        {9.5, 9.0, 9.5},
        {8.3, 8.3, 9.5}, 
        {8.9, 8.4, 8.5}
    };
        
    private double[][] c2_mat2 = {
        {8.2, 8.0, 8.5}, 
        {9.4, 8.5, 9.0}, 
        {9.4, 9.0, 9.5},
        {8.4, 8.3, 9.5}, 
        {8.3, 8.4, 8.5}
    };
    
    private double[][] c3_mat3 = {
        {8.7, 8.0, 8.5}, 
        {9.8, 8.5, 9.0}, 
        {9.9, 9.0, 9.5},
        {8.0, 8.3, 9.5}, 
        {8.2, 8.4, 8.5}
    };
    
    public static void agregarAlumno(String[] alumnos, double[][] calificaciones, String nombre, double[] calificacionesAlumno) 
    {
        // Asegúrate de que los arreglos tengan la misma longitud
        if (alumnos.length != calificaciones.length) {
            System.err.println("Error: Los arreglos de alumnos y calificaciones no tienen la misma longitud.");
            return;
        }

        int alumnosActuales = alumnos.length;
        int materias = calificaciones[0].length;

        // Crear nuevos arreglos con una longitud mayor para almacenar al nuevo alumno
        String[] nuevosAlumnos = Arrays.copyOf(alumnos, alumnosActuales + 1);
        double[][] nuevasCalificaciones = Arrays.copyOf(calificaciones, alumnosActuales + 1);

        // Agregar el nuevo alumno y sus calificaciones
        nuevosAlumnos[alumnosActuales] = nombre;
        nuevasCalificaciones[alumnosActuales] = Arrays.copyOf(calificacionesAlumno, materias);

        // Asignar los nuevos arreglos a los originales
        alumnos = Arrays.copyOf(nuevosAlumnos, nuevosAlumnos.length);
        calificaciones = Arrays.copyOf(nuevasCalificaciones, nuevasCalificaciones.length);

        System.out.println("Alumno agregado exitosamente.");
    }
    
    public void mostrarCalificaciones() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            
            for (int j = 0; j < materias.length; j++) {
                System.out.println("Materia: " + materias[j]);
                System.out.println("Calificaciones:");
                System.out.println("  Calificación en el curso 1: " + c1_mat1[i][j]);
                System.out.println("  Calificación en el curso 2: " + c2_mat2[i][j]);
                System.out.println("  Calificación en el curso 3: " + c3_mat3[i][j]);
            }
            System.out.println();
        }
    }
}

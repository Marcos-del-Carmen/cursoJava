package denisse;

public class Act1_Arreglos {
    public static void main(String[] args) {
        String[] materias = {"Español", "Fisica", "Quimica"};
        String[] alumnos = {"Panfilo Perez", "Daniela Garcia", "David Martinez",  "Gloria Angeles", "Pedro Gonzales"};
        double[][] calificaciones = {
            {8.5, 8.0, 8.5}, 
            {9.0, 8.5, 9.0}, 
            {9.5, 9.0, 9.5}, 
            {8.3, 8.3, 9.5}, 
            {8.9, 8.4, 8.5}, 

            {10.0, 9.7, 9.5}, 
            {8.0, 9.5, 9.7}, 
            {9.8, 9.6, 9.8}, 
            {9.8, 9.6, 9.8}, 
            {9.8, 9.6, 9.8}, 

            {9.5, 9.0, 9.5}, 
            {9.0, 9.5, 9.0},
            {8.5, 9.5, 9.2}, 
            {8.0, 9.7, 8.1},
            {9.5, 9.0, 9.5} 
        };

        for (int i = 0; i < materias.length; i++) {
            System.out.println("Materia: " + materias[i]);
            System.out.println("Nombre del Alumno\tParcial 1\tParcial 2\tParcial 3");
            for (int j = 0; j < alumnos.length; j++) {
                System.out.print(alumnos[j] + "\t\t");
                double sumCalificaciones = 0.0;
                for (int k = 0; k < 3; k++) {
                    double calificacion = calificaciones[j][k];
                    System.out.print(calificacion + "\t\t");
                    sumCalificaciones += calificacion;
                }
                double promedio = sumCalificaciones / 3;
                System.out.println(promedio);
            }
            System.out.println();
        }
    }
}

package ad_arrayUnidimencionalV2;


import java.util.Scanner;

public class Calificaciones {
    private Calificacion califs[];
    private int numAlumnos;
    public Calificaciones() {
        califs = new Calificacion[]{
            new Calificacion("Abel", 10, 10, 10, 0.0, 10, 10, 10, 0.0, 10, 10, 10, 0.0),
            new Calificacion("Panfilo", 9, 9, 9, 0.0, 9, 9, 9, 0.0, 9, 9, 9, 0.0),
            new Calificacion("Panfila", 8, 5, 9, 0.0, 7, 6, 9, 0.0, 9, 6, 9, 0.0),
            new Calificacion("Denisse", 9, 8, 9, 0.0, 9, 9, 9, 0.0, 10, 10, 9, 0.0),
            new Calificacion("Chencho", 8, 8, 8, 0.0, 10, 7, 8, 0.0, 9, 9, 7, 0.0)
        };
        numAlumnos = califs.length-1;  // Establecer el número de alumnos inicial
    }
    
    public void agregarAlumno() {
        Scanner teclado = new Scanner(System.in);
        
        
        if (numAlumnos < 10) {
            System.out.println("[" + (numAlumnos + 1) + "]) Nombre del alumno");
            System.out.print("> ");
            String nombre = teclado.nextLine();
            
            Calificacion[] nuevosAlumnos = new Calificacion[numAlumnos + 1];
            
            califs[numAlumnos] = new Calificacion(nombre, 0, 0, 0, 0.0, 0, 0, 0, 0.0, 0, 0, 0, 0.0);
            numAlumnos++;
            System.out.println("Alumno agregado correctamente.");
        } else {
            System.out.println("No se pueden agregar más alumnos. Límite alcanzado.");
        }
    }
    /*
    
    public void alumnoNuevo() {
        Scanner teclado = new Scanner(System.in);
        int i = 4;
        System.out.println("[" + (i + 1) + "]) Nombre del alumno");
        System.out.print("> ");
        califs[i].setAlumnos(teclado.nextLine());

        // System.out.println("P1 de Matematicas:{" + (i+1) + "]: ");
        califs[i].setP1_m1(0);
        califs[i].setP2_m1(0);
        califs[i].setP3_m1(0);

        // calificaciones para ingles
        califs[i].setP1_m2(0);
        califs[i].setP2_m2(0);
        califs[i].setP3_m2(0);

        // califcaciones para frances
        califs[i].setP1_m3(0);
        califs[i].setP2_m3(0);
        califs[i].setP3_m3(0);
        i++;
    }
    */
    public void mostrarDatos() {
        System.out.format("| %-32S | %8S | %14S | %18S |\n", "", "Materia1", "Materia2", "Materia3");
        System.out.format("| %-30S | %4S | %4S  | %4S %6S %4S %4S %4S %6S %4S %4S %4S %6S\n", "NOMBRE", "P1", "P2", "P3", "PROM", "P1", "P2", "P3", "PROM", "P1", "P2", "P3", "PROM");

        for (int i = 0; i < califs.length; i++) {
            double promedio1 = (califs[i].getP1_m1() + califs[i].getP2_m1() + califs[i].getP3_m1()) / 3.0;
            double promedio2 = (califs[i].getP1_m2() + califs[i].getP2_m2() + califs[i].getP3_m2()) / 3.0;
            double promedio3 = (califs[i].getP1_m3() + califs[i].getP2_m3() + califs[i].getP3_m3()) / 3.0;

            System.out.format("%-30S %4d %4d %4d %6.1f %4d %4d %4d %6.1f %4d %4d %4d %6.1f\n",
                    califs[i].getAlumnos(),
                    califs[i].getP1_m1(), califs[i].getP2_m1(), califs[i].getP3_m1(), promedio1,
                    califs[i].getP1_m2(), califs[i].getP2_m2(), califs[i].getP3_m2(), promedio2,
                    califs[i].getP1_m3(), califs[i].getP2_m3(), califs[i].getP3_m3(), promedio3);
        }
    }
}
    
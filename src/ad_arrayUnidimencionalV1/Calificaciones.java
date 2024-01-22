package ad_arrayUnidimencionalV1;

import java.util.Scanner;

public class Calificaciones {

    private Calificacion califs[];
    private int iteradorAlumno;

    public Calificaciones() {

        califs = new Calificacion[] {
            new Calificacion("Abel", 10, 9, 10, 0.0, 9, 9, 8, 0.0, 8, 8, 8, 0.0),
            new Calificacion("Panfilo", 9, 9, 9, 0.0, 9, 9, 9, 0.0, 9, 9, 9, 0.0),
            new Calificacion("Panfila", 8, 5, 9, 0.0, 9, 6, 9, 0.0, 9, 6, 9, 0.0),
            new Calificacion("Denisse", 9, 8, 9, 0.0, 9, 10, 10, 0.0, 8, 8, 9, 0.0),
            new Calificacion("Chencho", 8, 8, 8, 0.0, 10, 7, 8, 0.0, 9, 9, 10, 0.0),          
            new Calificacion("",0,0,0,0,0,0,0,0,0,0,0,0),
            new Calificacion("",0,0,0,0,0,0,0,0,0,0,0,0),
            new Calificacion("",0,0,0,0,0,0,0,0,0,0,0,0),
            new Calificacion("",0,0,0,0,0,0,0,0,0,0,0,0),
            new Calificacion("",0,0,0,0,0,0,0,0,0,0,0,0),
            //new Calificacion("",0,0,0,0,0,0,0,0,0,0,0,0),
        };                   
        iteradorAlumno = 5;
    }

    public void agregarAlumno() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(iteradorAlumno); // Quiero saber el tamaño del arreglo para cuando llegue a 10 ya sea el limite de los alumnos que pueda ingresar el cliente
        System.out.println(califs.length);
        if (iteradorAlumno<10) {
            System.out.print("Nombre del alumno: "); 
            String nombreAlumno = teclado.nextLine();  // digitamos el nombre del alumno
            califs[iteradorAlumno] = new Calificacion(nombreAlumno,0,0,0,0,0,0,0,0,0,0,0,0);
            iteradorAlumno++;
        } else {
            System.out.println("EL LIMITE DE ALUMNOS ES SUPERADO");
        }
    }

    public void agregarCalificacion() {
        Scanner teclado = new Scanner(System.in);

        int materia, parcial;

        // Mostrar la lista de alumnos que hay
        System.out.println(" _______________________________________ ");
        System.out.println("| NL | ALUMOS DEL AULA                  |");
        System.out.println("|----|----------------------------------|");
        for (int i = 0; i < califs.length; i++) {
            if(!(califs[i].getAlumnos() == "")){
                System.out.format("| %2d | %-32S |\n", (i+1), califs[i].getAlumnos());
            }
        }
        System.out.println("|____|__________________________________|");
        System.out.println(" 0) REGRESAR AL MENU");
        // Solicitar al usuario que elija un alumno
        System.out.println("SELECCIONA UN ALUMNO POR NUMERO DE LISTA");
        System.out.print("> ");
        
        int opcion = teclado.nextInt();
        if(opcion==0) {
           return;
        }
        
        
        if (opcion >= 1 && opcion <= califs.length) {
            // El usuario seleccionó un alumno válido
            int indiceSeleccionado = opcion - 1;
            System.out.format("\nSELECCIONASTE A %-32S \n", califs[indiceSeleccionado].getAlumnos());            
            System.out.println("""
                            ___________________________________
                           | SELECCIONA LA MATERIA A CAPTURAR  |
                           |-----------------------------------|
                           | 1) ESTRUCTURA DE DATOS            |
                           | 2) INGLES                         |
                           | 3) FRACES                         |
                           |___________________________________|
                           """);
            System.out.print("> ");
            materia = teclado.nextInt();
            int i = indiceSeleccionado;
            System.out.println("SELECCIONASTE LA MATERIA CON NUMERO DE PARCIAL ");
            switch (materia) {
                case 1:
                    System.out.println("""
                             _________________________
                            |  SELECCIONA EL PARCIAL  |
                            |-------------------------|
                            | 1) P1  | 2) P2 | 3) P3  |
                            |________|_______|________|
                           """);
                    System.out.print("> ");
                    parcial = teclado.nextInt();
                    System.out.println("\nESTRUCTURA DE DATOS " + parcial);
                    System.out.print("> ");
                    if (parcial == 1) {
                        califs[i].setP1_m1(teclado.nextInt());
                    } else if (parcial == 2) {
                        califs[i].setP2_m1(teclado.nextInt());
                    } else if (parcial == 3) {
                        califs[i].setP3_m1(teclado.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("""
                             _________________________
                            |  SELECCIONA EL PARCIAL  |
                            |-------------------------|
                            | 1) P1  | 2) P2 | 3) P3  |
                            |________|_______|________|
                           """);
                    System.out.print("> ");
                    parcial = teclado.nextInt();
                    System.out.println("\nINGLES - PARCIAL " + parcial);
                    System.out.print("> ");
                    if (parcial == 1) {
                        califs[i].setP1_m2(teclado.nextInt());
                    } else if (parcial == 2) {
                        califs[i].setP2_m2(teclado.nextInt());
                    } else if (parcial == 3) {
                        califs[i].setP3_m2(teclado.nextInt());
                    }
                    break;
                case 3:
                    System.out.println("""
                             _________________________
                            |  SELECCIONA EL PARCIAL  |
                            |-------------------------|
                            | 1) P1  | 2) P2 | 3) P3  |
                            |________|_______|________|
                           """);
                    System.out.print("> ");
                    parcial = teclado.nextInt();
                    System.out.println("\nFRANCES - PARCIAL " + parcial);
                    System.out.print("> ");
                    if (parcial == 1) {
                        califs[i].setP1_m3(teclado.nextInt());
                    } else if (parcial == 2) {
                        califs[i].setP2_m3(teclado.nextInt());
                    } else if (parcial == 3) {
                        califs[i].setP3_m3(teclado.nextInt());
                    }
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
        } else {
            System.out.println("Opción no válida. Seleccione un número válido.");
        }

        // Limpiar el buffer del scanner
        teclado.nextLine();

    }

    public void mostrarCalificaciones() {
        System.out.println(" ___________________________________________________________________________________________________________________ ");
        System.out.format("| %2S %-32S | %23S | %23S | %23S |\n", "", "NOMBRE DE LA MATERIA", "ESTRUCTURA DE DATOS", "INGLES", "FRANCES");
        System.out.println("|_____________________________________|_________________________|_________________________|_________________________|");
        System.out.format("| %2S | %-30S | %3S | %3S | %3S | %5S | %3S | %3S | %3S | %5S | %3S | %3S | %3S | %5S |\n", "NL", "NOMBRE", "P1", "P2", "P3", "PROM", "P1", "P2", "P3", "PROM", "P1", "P2", "P3", "PROM");
        System.out.println("|----|--------------------------------|-----|-----|-----|-------|-----|-----|-----|-------|-----|-----|-----|-------|");
        for (int i = 0; i < califs.length; i++) {
            if(!(califs[i].getAlumnos() == "")){
            double promedio1 = (califs[i].getP1_m1() + califs[i].getP2_m1() + califs[i].getP3_m1()) / 3.0;
            double promedio2 = (califs[i].getP1_m2() + califs[i].getP2_m2() + califs[i].getP3_m2()) / 3.0;
            double promedio3 = (califs[i].getP1_m3() + califs[i].getP2_m3() + califs[i].getP3_m3()) / 3.0;

            System.out.format("| %2d | %-30S | %3d | %3d | %3d | %5.1f | %3d | %3d | %3d | %5.1f | %3d | %3d | %3d | %5.1f |\n",
                    (i + 1),
                    califs[i].getAlumnos(),
                    califs[i].getP1_m1(), califs[i].getP2_m1(), califs[i].getP3_m1(), promedio1,
                    califs[i].getP1_m2(), califs[i].getP2_m2(), califs[i].getP3_m2(), promedio2,
                    califs[i].getP1_m3(), califs[i].getP2_m3(), califs[i].getP3_m3(), promedio3);
            }
            
        }
        System.out.println("|____|________________________________|_____|_____|_____|_______|_____|_____|_____|_______|_____|_____|_____|_______|");
    }

    public void mejoresCalificaciones() {
        // Array para almacenar los mejores promedios de cada materia
        double[] mejoresPromediosMateria = new double[3];  // Hay 3 materias según tu código

        // Nombres de las materias
        String[] nombresMaterias = {"ESTRUCTURA DE DATOS", "INGLES", "FRANCES"};

        // Iteramos por cada materia
        System.out.println(" _____________________________________________________________________ "); // 65 + 2 - 1 = 66      
        System.out.format("| %20S | %30S | %10S |\n", "NOMBRE DEL ALUMNO", "MATERIA", "PROMEDIO");
        System.out.println("|----------------------|--------------------------------|------------|");
        for (int i = 0; i < 3; i++) {
            double mejorPromedio = Double.MIN_VALUE;  // Inicializamos con un valor muy bajo

            // Iteramos por cada alumno para encontrar el mejor promedio de esta materia
            for (int j = 0; j < iteradorAlumno; j++) {
                double promedioMateria = obtenerPromedioMateria(j, i);

                // Si encontramos un promedio mejor, lo actualizamos
                if (promedioMateria > mejorPromedio) {
                    mejorPromedio = promedioMateria;
                }
            }

            // Guardamos el mejor promedio de esta materia
            mejoresPromediosMateria[i] = mejorPromedio;

            // Mostramos el mejor promedio y los alumnos que lo obtuvieron
            //System.out.println("Mejor promedio en " + nombresMaterias[i] + ": " + mejorPromedio);
            // Mostramos los alumnos que obtuvieron este promedio
            for (int j = 0; j < iteradorAlumno; j++) {
                double promedioMateria = obtenerPromedioMateria(j, i);
                if (promedioMateria == mejorPromedio) {
                    System.out.format("| %20S | %30S | %10.1f |", califs[j].getAlumnos(), nombresMaterias[i], mejorPromedio);
                }
            }

            System.out.println();
        }
        System.out.println("|______________________|________________________________|____________|");
    }

    public double obtenerPromedioMateria(int alumno, int materia) {
        // Método para obtener el promedio de una materia para un alumno específico
        if (materia == 0) {
            return (califs[alumno].getP1_m1() + califs[alumno].getP2_m1() + califs[alumno].getP3_m1()) / 3.0;
        } else if (materia == 1) {
            return (califs[alumno].getP1_m2() + califs[alumno].getP2_m2() + califs[alumno].getP3_m2()) / 3.0;
        } else if (materia == 2) {
            return (califs[alumno].getP1_m3() + califs[alumno].getP2_m3() + califs[alumno].getP3_m3()) / 3.0;
        }
        return 0.0;
    }
    
    public void nombresOrdenados() {
        for (int i = 0; i < iteradorAlumno - 1; i++) {
            for (int j = 0; j < iteradorAlumno - i - 1; j++) {
                if (califs[j].getAlumnos().compareToIgnoreCase(califs[j + 1].getAlumnos()) > 0) {
                    // Intercambiar estudiantes y calificaciones
                    Calificacion temp = califs[j];
                    califs[j] = califs[j + 1];
                    califs[j + 1] = temp;
                }
            }
        }
        mostrarCalificaciones();
    }  

     public void promediosOrdenadosM1() {
        int n = iteradorAlumno;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double tempPromedio = (califs[i].getP1_m1() + califs[i - gap].getP1_m1() +
                                       califs[i].getP2_m1() + califs[i - gap].getP2_m1() +
                                       califs[i].getP3_m1() + califs[i - gap].getP3_m1()) / 6.0;
                Calificacion tempCalif = califs[i];
                int j = i;

                while (j >= gap && ((califs[j - gap].getP1_m1() + califs[j].getP1_m1() +
                                    califs[j - gap].getP2_m1() + califs[j].getP2_m1() +
                                    califs[j - gap].getP3_m1() + califs[j].getP3_m1()) / 6.0) < tempPromedio) {
                    califs[j] = califs[j - gap];
                    j -= gap;
                }

                califs[j] = tempCalif;
            }
        }
        mostrarCalificaciones();
    }

    public void promediosOrdenadosM2() {
        // Ordenar por promedio de la segunda materia utilizando el método Shaker
        int left = 0;
        int right = iteradorAlumno - 1;
        while (left <= right) {
            for (int i = left; i < right; i++) {
                double promedio1 = (califs[i].getP1_m2() + califs[i].getP2_m2() + califs[i].getP3_m2()) / 3.0;
                double promedio2 = (califs[i + 1].getP1_m2() + califs[i + 1].getP2_m2() + califs[i + 1].getP3_m2()) / 3.0;
                if (promedio1 > promedio2) {
                    Calificacion temp = califs[i];
                    califs[i] = califs[i + 1];
                    califs[i + 1] = temp;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                double promedio1 = (califs[i - 1].getP1_m2() + califs[i - 1].getP2_m2() + califs[i - 1].getP3_m2()) / 3.0;
                double promedio2 = (califs[i].getP1_m2() + califs[i].getP2_m2() + califs[i].getP3_m2()) / 3.0;
                if (promedio1 > promedio2) {
                    Calificacion temp = califs[i];
                    califs[i] = califs[i - 1];
                    califs[i - 1] = temp;
                }
            }
            left++;
        }
        mostrarCalificaciones();
    }
     
    public void promediosOrdenadosM3() {
        // Ordenar por promedio de la tercera materia utilizando el método de burbuja
        for (int i = 0; i < iteradorAlumno - 1; i++) {
            for (int j = 0; j < iteradorAlumno - i - 1; j++) {
                double promedio1 = (califs[j].getP1_m3() + califs[j].getP2_m3() + califs[j].getP3_m3()) / 3.0;
                double promedio2 = (califs[j + 1].getP1_m3() + califs[j + 1].getP2_m3() + califs[j + 1].getP3_m3()) / 3.0;
                if (promedio1 > promedio2) {
                    Calificacion temp = califs[j];
                    califs[j] = califs[j + 1];
                    califs[j + 1] = temp;
                }
            }
        }
        mostrarCalificaciones();
    }
    
    public void metodosDeOrdenacion(){
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        while(!salir) {
            System.out.println("""
                                 ____________________________________
                                | SELECCIONA UN METODO DE ORDENACION |
                                |------------------------------------|
                                | 1) BURBUJA - ORDENA NOMBRES        |
                                | 2) SHELL - ORDENA PROMEDIOS DE M1  |
                                | 3) SHAKER - ORDENA PROMEDIOS DE M2 |
                                | 4) BURBUJA MENOR - PROMEDIOS DE M3 |
                                | 5) REGRESAR                        |
                                |____________________________________|
                               """);
            System.out.print("> ");
            int rest = teclado.nextInt();
            
            switch(rest){
                case 1:
                    System.out.println(">> LOS NOMBRES SE ORDENAN DE FORMA ASENDENTE");
                    nombresOrdenados();
                    break;
                case 2:
                    System.out.println(">> SE ORDENAN LOS PROMEDIOS DE LA MATERIA 1");
                    promediosOrdenadosM1();
                    break;
                case 3:
                    System.out.println(">> SE ORDENAN LOS PROMEDIOS DE LA MATERIA 2");
                    promediosOrdenadosM2();
                    break;
                case 4:
                    System.out.println(">> SE ORDENAN LOS PROMEDIOS DE LA MATERIA 3");
                    promediosOrdenadosM3();
                    break;
                case 5:
                    System.out.println(">> VOLVEMOS AL MENU \n SELECCIONA UNA OPCION");
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


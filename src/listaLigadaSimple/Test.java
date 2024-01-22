package listaLigadaSimple;

public class Test {
    public static void main(String [] args) {
        ListaLigada lista = new ListaLigada();
        
        Alumno alumno1 = new Alumno("23031", "Juan", "Perez", 20);
        Alumno alumno2 = new Alumno("23032", "Maria", "Gomez", 22);

        // Agrega los primeros dos alumnos
        lista.agregar(alumno1);
        lista.agregar(alumno2);

        Alumno alumno3 = new Alumno("23033", "Sánchez", "Sanchez", 21);
        Alumno alumno4 = new Alumno("23034", "Roberto", "Rodriguez", 19);

        // Agrega dos alumnos más
        lista.agregar(alumno3);
        lista.agregar(alumno4);

        // Mostrar la información de todos los alumnos
        lista.mostrarAlumnos();
        /*
        lista.agregarNum(1);
        lista.agregarNum(2);
        lista.agregarNum(3);
        lista.agregarNum(4);
        lista.mostrarNum();
        */
    }
}

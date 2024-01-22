package seccion10;

public class Alumnos implements Crud {

    @Override
    public void insertar() {
        System.out.println("Insertamos al alumno");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminamos al alumno");
    }

    @Override
    public void editar() {
        System.out.println("Editamos al alumno");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizamos al alumno");
    }   
}

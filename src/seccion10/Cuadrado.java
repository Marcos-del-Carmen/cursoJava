package seccion10;

/**
 *
 * @author Marcos del Carmen
 */
public class Cuadrado extends Figura{

    public Cuadrado(String figura) {
        super(figura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un " + getClass().getSimpleName());
    }
    
}

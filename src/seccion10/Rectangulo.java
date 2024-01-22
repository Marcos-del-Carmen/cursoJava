package seccion10;

/**
 *
 * @author Marcos del Carmen
 */
public class Rectangulo extends Figura {

    public Rectangulo(String figura) {
        super(figura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un " + getClass().getSimpleName());
    }
    
}

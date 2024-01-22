package ascii;

public class esenarioASCII {
    public static void main(String[] args) {
        int width = 10;  // Ancho de la pantalla
        int position = 0;  // Posición inicial del personaje

        while (true) {
            // Construye la línea de la animación con el personaje en la posición actual
            StringBuilder animationLine = new StringBuilder();
            for (int i = 0; i < width; i++) {
                if (i == position) {
                    animationLine.append("O");  // Personaje representado por "O"
                } else {
                    animationLine.append(" ");
                }
            }

            // Imprime la línea y actualiza la posición para la siguiente iteración
            System.out.print(animationLine.toString());
            position = (position + 1) % width;  // Mueve el personaje a la derecha
            
            try {
                Thread.sleep(500);  // Añade un retraso para visualizar la animación
                System.out.print("\r");  // Regresa al inicio de la línea
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package seccion5;

public class eje3_contrasena {
    public static void main(String [] args) {
        System.out.println(generarContrasena());
    }
    
    static String generarContrasena() {
        // Tenemos un arreglo de tipo char con letras mayusculas, minusculas y numeros 
        // para despues unirlos de manera aleatoria y formar una contrasena con 15 caracteres
        
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
                             'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
                             'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                             'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
                             'u', 'v', 'w', 'x', 'y', 'z'};
        
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        // StringBuilder funciona para construi o manipular una cadena de texto 
        StringBuilder caracteres = new StringBuilder();
        StringBuilder contrasena = new StringBuilder();
        
        // .append() en este caso funciona para unir los caracteres de texto 
        caracteres.append(mayusculas);
        System.out.println("Caracteres con letras mayusculas "+caracteres);
        caracteres.append(minusculas);
        System.out.println("Caracteres con letras mayus y minus "+caracteres);
        caracteres.append(numeros);
        System.out.println("Caracteres con letras mayus, minus y numeros "+caracteres + "\n");
        
        for (int i = 0; i < 15; i++) {
            int cantidadCaracteres = caracteres.length(); // dicha cantidad es 62
            int numRamdom = (int)(Math.random()*cantidadCaracteres); // seleccionamos un numero aleatorio con el metodo math 
            // System.out.print(numRamdom+" ");
            contrasena.append((caracteres.toString()).charAt(numRamdom)); // Digamos que las posiciones que tenemos en numRamdom se concatenan formando la contraseña
            // System.out.print(contrasena + " ");
            
        }
        System.out.println("");
        // 
        return contrasena.toString(); // tenemos como resultados la contraseña 
    }
}

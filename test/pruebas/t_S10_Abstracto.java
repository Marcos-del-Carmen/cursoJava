package pruebas;

import seccion10.Figura;
import seccion10.Rectangulo;
import seccion10.Cuadrado;

public class t_S10_Abstracto {
    public static void main(String[] args) {
        Figura fig = new Rectangulo("Rectangulo1");
        Figura fig1 = new Cuadrado("Cuadrado");
        
        //System.out.println(fig);
        fig.dibujar();
        fig1.dibujar();
        
    }    
}

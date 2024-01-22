package pruebas;

import java.util.Date;
import seccion10.Cliente;
import seccion10.Empleado;
import seccion10.Persona;

public class t_S10_Herencia {
    public static void main(String []args) {
        /**
         * HERENCIA
         * 
         * En este caso utilizamos herencia para estas clases y reutilizar codigo
         * y eso lo logramos extends en nuestra case hija. 
         * 
         * public class ClaseHija <extends> ClasePadre { ... }
         * 
         * POLIMORFISMO 
         * 
         * En este caso del polimorfismo sobreescribimos metodos que tenemos en el padre
         * 
         * En la clase padre vamos a tener lo siguiente 
         * 
         * public tipoDeDato nombreDelMetodo(){ 
         *     return ...; <- Vamos a mostrar algun mensaje u operacion >
         * }
         * 
         * @Override
         * public tipoDeDato nombreDelMetodo(){
         *     super.nombreDelMetodo(); <- lo que estamos retornando en el metodo de la clase padre se pasa en el super. >
         *     return ...; <-  Este es el nuevo codigo que se esta sobre escribiendo y estamos retornando es clase hija y solo de esta clase >
         * }
         * 
         * 
         */
         
        Date fecha = new Date();
        Empleado per1 = new Empleado(5500.00, "Marcos", 'M', 22, "18 sur");       
        
        Cliente per2 = new Cliente(fecha, true, "Hannia", 'F', 22, "Los Angeles");
        
        imprimir(per1);
        determinarObjeto(per1);
        
        imprimir(per2);
        determinarObjeto(per2);
        
        String nombre = "Nicolas";
        determinarObjeto(nombre);
        
        // Conversion de objetos
        // Downcasting
        Persona per3 = new Empleado(4500.00, "Saul", 'M', 22, "Zapata");
        Empleado empleado = (Empleado) per3;
        imprimir(empleado);
        
        //Upcasting
        Persona per4 = empleado;
        imprimir(per4);
        
        Persona per5 = new Empleado(5000.00, "Francisco", 'M', 25, "Zapata");
        Persona per6 = new Empleado(5000.00, "Francisco", 'M', 25, "Zapata");
        
        System.out.println(per5.equals(per6));
        
    }
    public static void imprimir(Persona persona){
        System.out.println(persona.detallePersona());
    }
    
    public static void determinarObjeto(Object object){
        if(object instanceof Empleado){
            System.out.println("El objeto es de tipo empleado");
        } else if(object instanceof Cliente){
            System.out.println("El objeto es de tipo cliente");
        } else if(object instanceof Persona){
            System.out.println("El objeto es de tipo persona");
        } else if (object instanceof Object){
            System.out.println("El objeto es de tipo object " +(object instanceof Object));
        }
    }
}

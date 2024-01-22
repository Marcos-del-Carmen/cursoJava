package pruebas;

import seccion10.Continentes;
/**
 * ENUMERACIONES
 * En java se pueden definir un conjunyo fijo de costantes nombradas. En este 
 * caso se definieron un conjunto de constantes que representan la cantidad de 
 * paises que hay en algunos continenetes
 * 
 * y lo que quiero decir con una constante es que su valor no va a cambiar 
 * puedes ver el ejemplo en el paquete de la seccion10 en el archivo 
 * Continenetes.java
 */
public class t_S10_Enumeraciones {
    public static void main(String []args){
        Continentes conti = Continentes.AMERICA;
        System.out.println(conti.getPaises());
        
        Continentes conti1 = Continentes.AFRICA;
        System.out.println(conti1.getPaises());
        
        Continentes conti2 = Continentes.ASIA;
        System.out.println(conti2.getPaises());
    }
}

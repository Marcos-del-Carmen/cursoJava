package metodosDeOrdenamiento;
import java.util.Scanner;
public class Burbuja {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        int arreglo[], nElementos, aux;
        
        System.out.println("Asignale un tamaño al arreglo");
        System.out.print("> ");
        nElementos = teclado.nextInt();
        
        arreglo = new int[nElementos];
        System.out.println("El tamaño de tu arreglo es de " + arreglo.length);
        
        for(int i = 0; i < nElementos; i++) {
            System.out.print("Numero/"+i+" > ");
            arreglo[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < (nElementos-1); i++){ // (nElementos-1) > 5-1 = 4 [0,1,2,3,4]
            for(int j = 0; j < (nElementos-1); j++) {
                if(arreglo[j]>arreglo[j+1]) { // NumeroActual > numeroSiguiente
                    System.out.println("NA " + arreglo[j] + " > NS " + arreglo[j+1]);
                    aux = arreglo[j];// aux le asignamos el numeroActual
                    arreglo[j] = arreglo[j+1]; // numeroActual le asignamos el numeroSiguiente 
                    arreglo[j+1] = aux; // por ultimo el numeroSiguiente le vamos a poner lo que tenia el aux
                    
                }
            }
        }
        
        for(int i = 0; i<nElementos; i++ ) {
            System.out.print(arreglo[i] + ", ");
        }        
        
        System.out.println("");
        for(int i = nElementos-1; 0<=i ;i--) {
            System.out.print(arreglo[i] + ", ");   
        }
    }
}

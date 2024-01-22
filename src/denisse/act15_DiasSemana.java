package denisse;
import java.util.Scanner;
public class act15_DiasSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int semana;
        
        System.out.println("Digita un numero de la semana\n 1 = lunes, 2 = martes 3 = mier...");
        semana = teclado.nextInt();
        
        if(semana==1){
            System.out.println("Lunes");
        } else {
            if(semana==2){
                System.out.println("Martes");
            } else {
                if(semana==3) {
                    System.out.println("Miercoles");
                }
                else {
                    if(semana==4){
                        System.out.println("Jueves");
                    }else {
                        if(semana==5) {
                            System.out.println("Viernes");
                        } else {
                            if(semana==6){
                                System.out.println("Sabado");
                            } else {
                                if(semana == 7){
                                    System.out.println("Domingo");
                                } else {
                                    System.out.println("...coles, 4 = jueves, 5 = viernes, 6 = sabado,  7 = domingo, 8 = no hay ");
                                }

                            }
                            
                        }
                    }
                }
            } 
        }
    }
}

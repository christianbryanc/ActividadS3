
package actividad3;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner (System.in);
    
    //Variable
    int nota;
    
    //Entrada de datos
    System.out.print("Ingrese su nota: ");
    nota = lectura.nextInt();
    
    //Proceso de datos
    if (nota >= 60){
        System.out.println("Usted ha aprobado el curso. Felicitaciones!!!");
    }
        
    }
    
}

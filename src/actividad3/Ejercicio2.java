
package actividad3;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner (System.in);
    
    //Variable
    int nota;    
    
    //Entrada de datos    
    System.out.print("Ingresa la nota del examen (0-100): ");
    nota = lectura.nextInt();
        
    //Proceso de datos
    if (nota >= 90) {
            System.out.println("Excelente");
    } else if (nota >= 80) {
            System.out.println("Bueno");
    } else if (nota >= 70) {
            System.out.println("Aprobado");
    } else {
            System.out.println("Reprobado");
        }
    }
}


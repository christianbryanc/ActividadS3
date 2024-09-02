
package actividad3;

import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String[] args) {
    //Creando el objeto de lectura
    Scanner lectura = new Scanner(System.in);
    //Variable
    int opcion, cantidad;
    double precioTotal;  
    //Entrada de datos
    System.out.println("Menu del Restaurante:");
    System.out.println("1. Pollo a la brasa - S/.50.00");
    System.out.println("2. Pizza - S/.30.00");
    System.out.println("3. Postre - S/.10.00");
    System.out.print("Elige una opcion del 1 al 3: ");
    opcion = lectura.nextInt();
    System.out.print("Ingresa la cantidad: ");
    cantidad = lectura.nextInt();   
    //Proceso de datos
    precioTotal = 0.0;
    switch (opcion) {
            case 1:
                precioTotal = 50.00 * cantidad;
                System.out.println("Has elegido Pollo a la brasa.");
                break;
            case 2:
                precioTotal = 30.00 * cantidad;
                System.out.println("Has elegido Pizza.");
                break;            
            case 3:
                precioTotal = 10.00 * cantidad;
                System.out.println("Has elegido Postre.");
                break;
            default:
                System.out.println("Opcion invalida. Por favor, elija una opcion entre 1 y 3.");
                break;
        }
        
        if (precioTotal > 0) {
            System.out.println("Precio total: "+precioTotal+" soles ");
        }
    }
}

    


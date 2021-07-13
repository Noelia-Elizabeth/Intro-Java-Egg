
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        int limite, numero, suma;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número límite: ");
        limite = scanner.nextInt();
        suma = 0;
        
        do {
            
            System.out.println("Ingrese un número para sumarlo: ");
            numero = scanner.nextInt();
            
            suma += numero;
            
        } while (limite >= suma);
        
        System.out.println("Se suma fue de " + suma + " y el límite era de " + limite + ".");
        
    }
    
}

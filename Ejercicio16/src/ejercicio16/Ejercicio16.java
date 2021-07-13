
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        int n, contador, suma;
        Scanner scanner = new Scanner(System.in);
        contador = 0;
        suma = 0;
        
        do {
            
            System.out.println("Ingrese un número: ");
            n = scanner.nextInt();
            contador++;
            
            suma += n;

            if (n == 0) {
                
                System.out.println("Se capturó un cero.");
                break;
            
            }
            
        } while (contador < 20);
        
        System.out.println("La suma de los " + contador + " números que ingresó es de: " + suma);
        
    }
    
}

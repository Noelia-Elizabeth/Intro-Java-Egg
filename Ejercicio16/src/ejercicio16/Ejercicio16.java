/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/
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

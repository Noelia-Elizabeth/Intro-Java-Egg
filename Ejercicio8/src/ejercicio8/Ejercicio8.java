/*
Crear un programa que dado un numero determine si es par o impar.
*/
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        double numero;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        numero = scanner.nextDouble();
        
        if (numero == 0) {
            
            System.out.println("Su número es 0; no es par ni impar.");
            
        } else if (numero % 2 == 0) {
            
            System.out.println("Su número es par.");
            
        } else {
            
            System.out.println("Su número es impar.");
            
        }
        
    }
    
}

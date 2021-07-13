/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int numero1, numero2, suma;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese otro número");
        numero2 = scanner.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("La suma de los números es: " + suma);
        
    }
    
}

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
*/
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
        String nombre;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
        
    }
    
}

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
        
        String frase;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        frase = scanner.nextLine();
        System.out.println("");
        System.out.println("Su frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("Su frase en mayúsculas: " + frase.toLowerCase());
        
    }
    
}

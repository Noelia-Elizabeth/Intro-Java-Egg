/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
*/
package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        
        String frase;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        frase = scanner.nextLine();
        
        if (frase.equals("eureka")) {
            
            System.out.println("Correcto");
            
        } else {
            
            System.out.println("Incorrecto");
            
        }
        
    }
    
}

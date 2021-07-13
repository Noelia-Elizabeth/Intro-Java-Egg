/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        String frase;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese se frase (debe empezar con a; porque sí): ");
        frase = scanner.nextLine();
        
        System.out.println("La primer letra: " + frase.substring(0,1));
        
        if (frase.substring(0,1).equals("a") || frase.substring(0,1).equals("A")) {
            
            System.out.println("Correcto");
            
        } else {
            
            System.out.println("Incorrecto");
            
        }
    }
    
}

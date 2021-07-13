/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        
        double gradosC, gradosF;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura en °C: ");
        gradosC = scanner.nextDouble();
        
        gradosF = 32 + (9 * (gradosC / 5));
        
        System.out.println("");
        System.out.println("La temperatura en °F es: " + gradosF + "°");
    }
    
}

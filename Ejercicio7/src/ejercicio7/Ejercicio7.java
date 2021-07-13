/*
Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
*/
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {


    public static void main(String[] args){
        
        double n1, n2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        n1 = scanner.nextDouble();
        System.out.println("Ingrese otro número");
        n2 = scanner.nextDouble();
        
        if (n1 == n2) {
            
            System.out.println("Los número son inguales.");
            
        } else if (n1 > n2) {
            
            System.out.println("El número " + n1 + " es mayor al número " + n2 + ".");
            
        } else if (n1 < n2){
            
            System.out.println("El número " + n2 + " es mayor al número " + n1 + ".");
            
        }
        
    }
    
}

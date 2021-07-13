/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {
        
        int numero, doble, triple;
        double raiz;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero = scanner.nextInt();
        
        doble = numero * numero;
        triple = numero * numero * numero;
        raiz = Math.sqrt(numero);
        
        System.out.println("El doble es: " + doble);
        System.out.println("El triple es: " + triple);
        System.out.println("La raíz es: " + raiz);
        
    }
    
}

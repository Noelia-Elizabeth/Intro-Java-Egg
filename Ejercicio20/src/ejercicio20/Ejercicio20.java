/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        int contador = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        
        do {
            contador++;
            System.out.println("Ingrese un número (intento " + contador + " de 4): ");
            n = scanner.nextInt();
            
            if ((n < 1) || (n > 20)) {
                contador--;
                System.out.println("Ingresó un número inválido; por favor vuelva a ingresar un número.");
            } else {
                System.out.print(n + " ");
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
            }
            
            System.out.println(" ");
        
        } while (contador < 4);
        
    }
    
}

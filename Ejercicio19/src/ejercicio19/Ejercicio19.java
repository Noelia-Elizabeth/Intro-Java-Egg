/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
 */
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de elementos para el cuadrado: ");
        n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0) || (i == n-1)) {
                    System.out.print("*");                    
                } else if ((j == 0) || (j == n-1)) {
                    System.out.print("*");
                } else if (!(j == 0) && !(j == n-1)) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
    
}

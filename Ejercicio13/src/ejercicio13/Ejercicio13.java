
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        double nota;
        Scanner scanner = new Scanner(System.in);
        

        
        do {
            System.out.println("Ingrese el tipo de motor que busca: ");
            nota = scanner.nextDouble();
            
            if (nota > 10 || nota < 0)
                System.out.println("No es una nota válida.");
            
        } while (nota > 10 || nota < 0);
        
        System.out.println("Excelente.");
    }
    
}

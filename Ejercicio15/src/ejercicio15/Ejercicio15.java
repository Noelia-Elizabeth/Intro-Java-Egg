
package ejercicio15;

import java.util.Scanner;


public class Ejercicio15 {

    public static void main(String[] args) {
        
        int opcionElegida;
        String opcion2;
        double numero1, numero2, resultado;
        Scanner scanner = new Scanner(System.in);
        resultado = 0;
        opcion2 = "N";
        
        System.out.println("Ingrese dos números:");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        
        do {
            
            System.out.println("-----MENÚ-----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una de las opciones: ");
            opcionElegida = scanner.nextInt();
            
            opcionElegida = menu(opcionElegida, numero1, numero2, resultado);
            
            if (opcionElegida == 5) {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                opcion2 = scanner.next();
            }
            
        } while ((!(opcion2.equals("S")))&&(!(opcion2.equals("s"))));
        
    }
    
    static int menu(int opcionElegida, double numero1, double numero2, double resultado) {
        
        switch (opcionElegida) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 5:
                break;
            default:
                System.out.println("Elija una opción correcta.");
                break;
        }
        
        return opcionElegida;
        
        }
    
}

/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).

El cambio de divisas es: 
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        double euros;
        String moneda;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de dinero en euros:");
        euros = scanner.nextDouble();
        System.out.println("Ingrese una moneda para convertir su dinero:");
        moneda = scanner.next();
        
        convertirMoneda(euros,moneda);
        
    }
    
    public static void convertirMoneda (double e, String m){
        switch (m) {
            case "libras":
                System.out.println("Usted ingresó " + 0.86 * e + " libras.");
                break;
            case "dolares":
                System.out.println("Usted ingresó " + 1.28611 * e + " dólares.");
                break;
            case "yenes":
                System.out.println("Usted ingresó " + 129.852 * e + " yenes.");
                break;
            default:
                break;
        }
    }
    
}

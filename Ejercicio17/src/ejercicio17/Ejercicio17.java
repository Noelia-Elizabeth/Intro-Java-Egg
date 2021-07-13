
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
       String cadena;
       int flag = 0;
       int correctas = 0;
       int incorrectas = 0;
       Scanner scanner = new Scanner (System.in);
       
       do {
           
           System.out.println("Ingrese la secuencia de caracteres correcta:");
           cadena = scanner.nextLine();           
           
           if ((cadena.length() <= 5) && (cadena.substring(0,1).equals("X")) && (cadena.substring(cadena.length()-1,cadena.length()).equals("O"))) {
               System.out.println("¡Correcto!");
               correctas++;
           } else if (cadena.equals("&&&&&")) {
               flag = 1;
           } else {
               System.out.println("Incorrecto; vuelva a intentar...");
               incorrectas++;
           }
           
       } while (flag == 0);
       
       
       System.out.println("Resumen de la actividad: ");
       System.out.println("Las entradas correctas fueron: " + correctas);
       System.out.println("Las entradas incorrectas fueron: " + incorrectas);
        
    }
    
}

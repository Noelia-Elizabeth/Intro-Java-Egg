/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
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

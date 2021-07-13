/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E.
*/
package ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        String aux;
        
        for (Integer i = 0; i < 10; i++) {
            if (i != 3) {
                aux = i.toString();
                aux += "-";
            } else {
                aux = "E-";
            }
            for (Integer j = 0; j < 10; j++) {
                if (j != 3) {
                    aux += j.toString();
                    aux += "-";
                } else {
                    aux += "E-";
                }                
                for (Integer k = 0; k < 10; k++) {
                    if (k != 3) {
                        aux += k.toString();
                    } else {
                        aux += "E";
                    }
                    System.out.println(aux);
                    aux = aux.substring(0,aux.length()-1);
                }
                aux = aux.substring(0,aux.length()-2);
            }
            aux = "";
        }
        
    }
    
}

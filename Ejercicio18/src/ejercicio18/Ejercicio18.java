
package ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        System.out.println(i + "-" + j + "-E");                    
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
        
    }
    
}

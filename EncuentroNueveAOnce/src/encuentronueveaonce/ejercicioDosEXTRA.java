/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package encuentronueveaonce;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioDosEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un largo para su vector");
        int n = leer.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("ingrese valores para su vector1");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = leer.nextInt();
        }
System.out.println("ingrese valores para su vector2");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = leer.nextInt();
        }
        boolean igual;

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                igual = false;
                System.out.println("los vectores son iguales : " + igual);
                break;
            } else {
                igual = true;
                if (i==vector1.length-1) {
                      System.out.println("los vectores son iguales: " + igual);
                }
              
              
            }
            
            
        }

    }

}

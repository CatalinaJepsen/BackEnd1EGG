/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentronueveaonce;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioTresGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un largo para su vector");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            int cont1 = 0;
            int cont2 = 0;
            int cont3 = 0;
            int cont4 = 0;
            int cont5 = 0;

            if (vector[i] > 9999) {
                cont5 ++;
            } else if (vector[i] > 999) {

                cont4 ++;

            } else if (vector[i] > 99) {
                cont3 ++;
            } else if (vector[i] > 9) {
                cont2 ++;
            } else if (vector[i] >= 0) {
                cont1 ++;
            }

        }
        
        System.out.println("tenemos "+ cont5 +" numeros de 5 digitos" );
        System.out.println( "tenemos "+ cont4 +" numeros de 4 digitos");
        System.out.println("tenemos "+ cont3 +" numeros de 3 digitos" );
        System.out.println("tenemos "+ cont2 +" numeros de 2 digitos" );
        System.out.println("tenemos "+ cont1 +" numeros de 1 digitos");
    }

}

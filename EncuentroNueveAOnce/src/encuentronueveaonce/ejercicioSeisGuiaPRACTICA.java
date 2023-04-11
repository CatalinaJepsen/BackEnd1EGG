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
public class ejercicioSeisGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int i;
        int j;
        do {

            for (i = 0; i < matrizA.length; i++) {
                for (j = 0; j < matrizA[i].length; j++) {
                    System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                    matrizA[i][j] = leer.nextInt();

                }

            }

        } while (matrizA[i][j] >= 1 && matrizA[i][j] <= 9);

    }
}

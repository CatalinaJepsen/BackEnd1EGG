/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentronueveaonce;

/**
 *
 * @author cata
 */
public class ejercicioCuatroGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizTranspuesta = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" " + matriz[i][j]);
            }

        }

        System.out.println("  ");
        for (int j = 0; j < matriz.length; j++) {
            System.out.println(" ");
            for (int i = 0; i < matriz[j].length; i++) {
                matrizTranspuesta[j][i] = matriz[i][j];
                System.out.print(" " + matrizTranspuesta[j][i]);

            }
        }
    }

}

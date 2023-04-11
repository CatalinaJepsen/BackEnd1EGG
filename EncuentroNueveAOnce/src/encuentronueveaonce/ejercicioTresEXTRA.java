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
public class ejercicioTresEXTRA {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        rellenar(vec);
        mostrar(vec);

    }

    public static int [] rellenar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
        vec[i] = (int) (Math.random() * 100); 
        }
        return vec;
    }

    public static void mostrar(int [] vec) {
        for (int i = 0; i < vec.length ; i++) {
            System.out.print(" " + vec[i]);
        }
    }

}


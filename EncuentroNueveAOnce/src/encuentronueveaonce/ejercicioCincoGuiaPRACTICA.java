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
public class ejercicioCincoGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        Scanner leer = new Scanner(System.in);
        boolean esAntisimetrica = false;
        int i, j;
        //Ingreso de i y j que van ser las Dimensiones de las Matrices A(i,j) y B(i,j)

        //Una vez que tenemos los valores de i y j Creamos la Matriz con sus dimensiones por ej 3+3
        //Carga de MAtrices A y B
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                matrizA[i][j] = leer.nextInt();
                matrizB[j][i] = matrizA[i][j];
            }
        }
        for (j = 0; j < matrizB.length; j++) {
            for (i = 0; i < matrizB.length; i++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println("Matriz");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz Transpuesta");
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB.length; j++) {
                System.out.print("[" + matrizB[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == -matrizB[j][i]) {
                    esAntisimetrica = true;
                    break;
                }
                System.out.println("la matriz B es antisimetrica" + esAntisimetrica);
            }

        }
    }
}

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
public class brayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Creamos una matriz 3x3 para almacenar los números introducidos por el usuario
        int[][] matriz = new int[3][3];

        // Pedimos al usuario que introduzca los números de la matriz uno por uno
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                int num = leer.nextInt();

                // Verificamos que el número está entre 1 y 9
                while (num < 1 || num > 9) {
                    System.out.println("Numero fuera de rango.Reintroduzca un número entre 1 y 9.");
                    num = leer.nextInt();
                }

                // Almacenamos el número en la matriz
                matriz[i][j] = num;
            }
        }

        // Calculamos la suma de la primera fila y comprobamos que todas las filas tienen la misma suma
        int sumaFilas = 0;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            }
            if (i == 0) {
                sumaFilas = sumaFila;
            } else if (sumaFila != sumaFilas) {
                System.out.println("La matriz no es un cuadrado mágico.");
                return;
            }
        }

        // Calculamos la suma de la primera columna y comprobamos que todas las columnas tienen la misma suma
        int sumaColumnas = 0;
        for (int j = 0; j < 3; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            }
            if (j == 0) {
                sumaColumnas = sumaColumna;
            } else if (sumaColumna != sumaColumnas) {
                System.out.println("La matriz no es un cuadrado mágico.");
                return;
            }
        }

        // Calculamos la suma de la diagonal principal y comprobamos que ambas diagonales tienen la misma suma
        int sumaDiagonal1 = 0;

    }

}


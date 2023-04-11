/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciounoencuentrunoydos;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class EjercicioUnoEncuentrUnoYDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in); 
        int numero;
        int numero2;
        System.out.println("ingresa dos  numeros");
        numero = leer.nextInt();
        numero2 = leer.nextInt();
        int suma = numero + numero2;
        System.out.println("la suma de sus numeros es " + suma);

    }
    
}

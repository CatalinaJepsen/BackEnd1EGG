/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerencuentro;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class LALO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("introduce un numero entero: ");
            int numero = leer.nextInt();
            int doble = numero * 2;
            int triple = numero * 3;
            double raizcuadrada = Math.sqrt(numero);
            System.out.printf("el doble de %d es %d%n", numero, doble);
            System.out.printf("el triple de %d es %d%n", numero, triple);
            System.out.printf("la raiz cuadrada de %d es %.2f%n", numero,raizcuadrada);
        }
    }
    
}

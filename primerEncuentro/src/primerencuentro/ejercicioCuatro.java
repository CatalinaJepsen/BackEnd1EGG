/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
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
public class ejercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in); 
        int grados;
       
        System.out.println("ingresa grados en Celcius para pasar a Fahrenheit");
        grados = leer.nextInt();
        
        int Fahrenheit = 32 + (9 * grados / 5);
        System.out.println("Los grados ingresados en Fahrenheit son " + Fahrenheit);
    }
    
}

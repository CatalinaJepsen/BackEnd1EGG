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
public class ejercicioTres {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingresa una frase corta");
        
        frase = leer.nextLine();
        
        System.out.println("Frase en mayusculas: " + frase.toUpperCase());
        
        System.out.println("Frase en minusculas: " + frase.toLowerCase());
        
    }
    
}

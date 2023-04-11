/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentrosdelcuatroalseis;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioTresGuiaTEORICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una nota");
       int nota;
        nota= leer.nextInt();
         while (nota <= 0 || nota>=10){
           System.out.println("su nota no esta en el rango valido, ingrese otra");  
         }
       
               
    }
    
}

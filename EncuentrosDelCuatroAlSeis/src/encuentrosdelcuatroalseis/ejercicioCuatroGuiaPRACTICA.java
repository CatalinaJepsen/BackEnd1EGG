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
public class ejercicioCuatroGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase o palabra");
        cadena=leer.nextLine();
        String primerLetra;
        primerLetra=cadena.substring(0,1);
      
        if (primerLetra.equals("a")|| primerLetra.equals("A")){
            System.out.println("CORRECTO");
        } else{
            System.out.println("INCORRECTO");
        }
    }
    
}

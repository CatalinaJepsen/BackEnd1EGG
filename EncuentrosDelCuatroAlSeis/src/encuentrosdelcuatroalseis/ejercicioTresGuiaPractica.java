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
public class ejercicioTresGuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       String cadena;
       System.out.println("ingresa una palabra o frase");
       cadena= leer.nextLine();
       
       if (cadena.length()== 8) {
           System.out.println("CORRECTO");
    }else{
           System.out.println("INCORRECTO");
       }
    }
    
}

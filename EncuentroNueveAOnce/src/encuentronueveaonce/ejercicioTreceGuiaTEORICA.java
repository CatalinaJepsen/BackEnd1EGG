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
public class ejercicioTreceGuiaTEORICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String[] Equipo=new String[8];
       
        System.out.println("Ingrese los nombres de los integrantes del equipo:");
         for (int i = 0; i < Equipo.length; i++) {
            Equipo[i]=leer.nextLine();
            
        }
         
         for (int i = 0; i < Equipo.length; i++) {
             System.out.println(Equipo[i]);
            
        }
    }
    
}

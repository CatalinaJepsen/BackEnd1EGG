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
public class ejercico8GuiaTEORICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        while (num<0 || num>10){
            System.out.println("Ingrese un numero dentro del rango del 0 al 10 ");
            num=leer.nextInt();
        }
    }
    
}

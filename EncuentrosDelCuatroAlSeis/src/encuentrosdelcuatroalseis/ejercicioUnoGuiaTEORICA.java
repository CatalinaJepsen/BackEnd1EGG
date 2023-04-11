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
public class ejercicioUnoGuiaTEORICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num;
     int num2;
     System.out.println("ingrese dos numeros");
     num = leer.nextInt();
     num2 = leer.nextInt();
     
     if (num>25) {
         System.out.println(num + " Es mayor A 25 ");
         } else if (num2>25){
          System.out.println(num2 + " Tambien es mayor A 25") ;   
         }else {
             System.out.println(" Ninguno de los dos numero es mayor a 25");
         }
     
    }
     
}

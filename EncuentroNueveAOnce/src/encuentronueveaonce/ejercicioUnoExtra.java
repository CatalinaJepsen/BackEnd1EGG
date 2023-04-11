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
public class ejercicioUnoExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        System.out.println("ingrese un largo para su vector");
        int n=leer.nextInt();
        
          int[] vector=new int[n];
          
          int cont=0;
          System.out.println("ingrese los valores a alojar en su vector");
          for (int i = 0; i < vector.length; i++) {
             vector[i]=leer.nextInt();
             cont=cont+vector[i];
        }
         
          System.out.println("la suma de los valores ingresados al vector es de: " + cont);
            
        }
    }
    
}

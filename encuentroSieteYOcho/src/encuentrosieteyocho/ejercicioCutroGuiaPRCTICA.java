/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentrosieteyocho;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioCutroGuiaPRCTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num;
        System.out.println("ingrese un numero");
       num=leer.nextInt();
       
      divisores(num);
  
    }
   public static boolean divisores(int num){
         boolean primo=false;
         int aux;
         aux=0;
        
         for (int i = 2; i < num; i++) {
             if (num% i ==0){
               aux=aux++;
            break;
         }
            
               
         }
          if(aux==2){
              primo=true;
          }
        
         
         return primo;
         
     }
}
     

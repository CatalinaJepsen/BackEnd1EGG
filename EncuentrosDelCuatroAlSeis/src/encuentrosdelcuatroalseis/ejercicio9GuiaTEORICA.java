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
public class ejercicio9GuiaTEORICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         int num;
         int suma;
         int cantidadNum;
         suma=0;
         cantidadNum=20;
        do{
            System.out.println("Ingrese numeros enteros");
            num=leer.nextInt();
              if (num==0){
               System.out.println("Se capturó el numero cero");
               break;
            
            }else if (num!=0){
                if (num>=0){
                suma=suma+num;
                
                }
          cantidadNum--;
            }
        }while (cantidadNum>0 && cantidadNum<20);
        System.out.println("la suma de los numeros es " + suma);
    }
    
}

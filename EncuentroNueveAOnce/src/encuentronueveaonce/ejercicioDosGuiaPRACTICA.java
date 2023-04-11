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
public class ejercicioDosGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un largo para su vector");
        int n=leer.nextInt();
      int[] vector=new int[n];
       
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("que numero le gustaria buscar");
        int busqueda=leer.nextInt();
        int contador=0;
        int aux=0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == busqueda) {
               contador += contador;
               aux=i;
                System.out.println("la posicion del numero " + busqueda + "es: " + aux);
            }
        }
        
    }
    
}

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerencuentro;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        int num;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        
        int doble = num*2;
        int triple = num*3;
        double raizCuadrada = Math.sqrt(num);
        System.out.println("El doble es " + doble);
        System.out.println("El triple es " + triple);
        System.out.println("La raiz cuadrada es " + raizCuadrada);
        
        
    }
    
}

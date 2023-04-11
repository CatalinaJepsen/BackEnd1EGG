/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciounoencuentrunoydos;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //definiendo variables
         Scanner leer = new Scanner(System.in);
        String nombre;
        //mensaje que se mostrara en pantalla
         System.out.println("ingresa tu nombre");
       //leemos el nombre de la persona en la variable nombre
       nombre = leer.next();
       //mostrar nombre
       System.out.println("mi nombre es " + nombre);

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       //se crea una variable cadena {String} que se utiliza para leer datos del usuario
       String frase;
       //muestra un mensaje por pantalla
       System.out.println("ingresa una frase");
       //leemos el nombre de la persona en la variable nombre
       frase = leer.next();
       //mostramos por consola un saludo personalizao
       System.out.println("Hola mundo! soy " + nombre + " y estoy programando en java!");
       String frase = String.toLowerCase(frase);

    }
    
}

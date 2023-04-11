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
public class ejercicioSeisGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int opcion;
        String respuesta;

        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        do {
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");

            System.out.println("elija una opcion");

            opcion = leer.nextInt();
            if (opcion == 5) {
                System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                respuesta = leer.next();
               if (respuesta.equals("S")) {
                    break;

                }
            }

            switch (opcion) {
                case 1:
                    System.out.println("La suma de sus numeros es: " + suma);
                    break;

                case 2:
                    System.out.println("La resta de sus numeros es: " + resta);
                    break;

                case 3:
                    System.out.println("La multiplicacion de sus numeros es: " + multiplicacion);
                    break;

                case 4:
                    System.out.println("La division de " + num1 + "entre " + num2 + division);
                    break;
            }
        } while (opcion >= 1 && opcion <= 4);
    }

}

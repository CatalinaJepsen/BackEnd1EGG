/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package encuentrosieteyocho;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioUnoGuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
       
       int opcion;
       int num1;
       int num2;
       
        System.out.println("Ingrese dos numeros");
       num1=leer.nextInt();
       num2=leer.nextInt();
     
       
        do {
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
       

            System.out.println("elija una opcion");

            opcion = leer.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("La suma de sus numeros es: " +  suma(num1,num2) );
                    break;

                case 2:
                    System.out.println("La resta de sus numeros es: " +   resta(num1,num2));
                    break;

                case 3:
                    System.out.println("La multiplicacion de sus numeros es: " +  multiplicacion(num1,num2));
                    break;

                case 4:
                    System.out.println("La division de " + num1 + "entre " + num2 +  division(num1,num2));
                    break;
            }
        } while (opcion == 1 && opcion <= 4);
    }
    public static int suma(int num1, int num2){
         int suma;
         suma=num1+num2;
    return suma;   
    }

        public static int resta(int num1, int num2){
         int resta;
         resta=num1-num2;
    return resta;   
    }

          public static int multiplicacion(int num1, int num2){
         int multiplicacion;
         multiplicacion= num1*num2;
    return multiplicacion;   
    }
    
              public static double division(int num1, int num2){
         double division;
         division= num1/num2;
    return division;   
    }      
}

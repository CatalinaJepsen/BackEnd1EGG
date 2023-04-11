/*Escriba un programa en el cual se ingrese un valor limite positivo,
y a continuacion solicite numeros al usuario hasta que la suma de los numeros 
introducidos supere el limite inicial.
 */
package encuentrosdelcuatroalseis;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioCincoGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer=new Scanner(System.in);
           int numLimite;
           int num;
           int suma;
           suma=0;
           System.out.println("INGRESE UN VALOR LIMITE");
           numLimite=leer.nextInt();
           
           do {
               System.out.println("ahora ingrese numeros a sumar"); 
               num=leer.nextInt();
               if (num>0){
                   suma=suma+num;
               }
           }while (suma<=numLimite);
           System.out.println("la suma de sus numeros es: " + suma);
    }
    
}

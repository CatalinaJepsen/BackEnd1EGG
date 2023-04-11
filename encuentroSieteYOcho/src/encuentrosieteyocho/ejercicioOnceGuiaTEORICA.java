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
public class ejercicioOnceGuiaTEORICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase terminada en punto");
        frase = leer.nextLine();

        String fraseMinuscula = frase.toLowerCase();

        codificar(fraseMinuscula);
       
    }

    public static String codificar(String fraseMinuscula) {
        String vocales = "aeiou";
        String auxFrase = " ";
        for (int i = 0; i < fraseMinuscula.length(); i++) {
            int control = 0;
            String letra = fraseMinuscula.substring(i, i);
            for (int j = 0; j < vocales.length(); j++) {
                if (letra.equals(vocales.substring(j, j))) {
                    control = control + 1;
                    switch (vocales.substring(j, j)) {
                        case "a":
                            auxFrase = fraseMinuscula.concat("@");
                            break;
                        case "e":
                            auxFrase = fraseMinuscula.concat("#");
                            break;
                        case "i":
                            auxFrase = fraseMinuscula.concat("$");
                            break;
                        case "o":
                            auxFrase = fraseMinuscula.concat("%");
                            break;
                        case "u":
                            auxFrase = fraseMinuscula.concat("*");
                            break;

                    }
                } 
            }
if (control==0){
  auxFrase=auxFrase.concat(letra);
}
        }

         System.out.println("la frase modificada seria: " + auxFrase );
        return auxFrase;
    }

}

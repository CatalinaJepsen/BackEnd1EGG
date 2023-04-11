
package encuentrosieteyocho;

import java.util.Scanner;

/**
 *
 * @author cata
 */
public class ejercicioTresGuiaPRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euro;
        String moneda;
        System.out.println("   Ingrese una cantidad en euros a convertir");
        euro = leer.nextDouble();

        System.out.println("   Que tipo de conversion desea hacer: ");
        System.out.println("Yenes");
        System.out.println("Libras");
        System.out.println("Dolares");
        System.out.println("   Ingrese moneda:");
        moneda = leer.next();

        convertidor(euro, moneda);

    }

    public static void convertidor(double euro, String moneda) {
    

        switch (moneda.toLowerCase()) {
            case "yenes":
                System.out.println("YENES: " + (euro * 129.852));
                break;

            case "libras":
                System.out.println("LIBRAS:  " + (euro * 0.86));
                break;

            case "dolares":
                System.out.println("DOLARES:  " + (euro * 1.28611));
                break;

        }

    }

}


import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // ohjeet tiedostossa "tehtava4.txt"

        // BEGIN SOLUTION
        Ohjain.asetaLaatikkoSatunnaisesti();
        // END SOLUTION
        Ohjain.kaynnista();

        // toteuta ohjelma tänne
        // BEGIN SOLUTION
        while (true) {
            System.out.println("");
            System.out.print("komento (sammuta, vasen, oikea, liiku, liikuMonta, viereen, ratkaise): ");
            String komento = lukija.nextLine();

            if (komento.equals("sammuta")) {
                break;
            }

            if (komento.equals("vasen")) {
                Ohjain.vasen();
            } else if (komento.equals("oikea")) {
                Ohjain.oikea();
            } else if (komento.equals("liiku")) {
                Ohjain.liiku();
            } else if (komento.equals("liikuMonta")) {
                System.out.print("Kuinka monta askelta: ");
                int askelMaara = Integer.parseInt(lukija.nextLine());
                Ohjain.liikuMonta(askelMaara);
            } else if (komento.equals("viereen") || komento.equals("ratkaise")) {
                // viereen siirtyminen
                int omaX = Ohjain.robottiX();
                int omaY = Ohjain.robottiY();

                int laatikkoX = Ohjain.laatikkoX();
                int laatikkoY = Ohjain.laatikkoY();

                int siirryX = laatikkoX - omaX;
                int siirryY = laatikkoY - omaY;

                Ohjain.vasen();
                Ohjain.liikuMonta(siirryY);
                Ohjain.oikea();
                Ohjain.liikuMonta(siirryX - 1);

                // vierestä ratkaisu
                if (komento.equals("ratkaise")) {
                    // työnnetään laatikko lastausalueen x-koordinaattiin
                    siirryX = Ohjain.tavoiteX() - Ohjain.laatikkoX();
                    Ohjain.liikuMonta(siirryX);

                    // siirrytään laatikon taakse työntämistä varten
                    Ohjain.vasen();
                    Ohjain.liiku();
                    Ohjain.oikea();
                    Ohjain.liiku();
                    Ohjain.oikea();

                    int tavoitteeseen = Ohjain.robottiY() - Ohjain.tavoiteY() - 1;
                    Ohjain.liikuMonta(tavoitteeseen);
                }
            }
        }

        // END SOLUTION
        Ohjain.sammuta();
    }
}

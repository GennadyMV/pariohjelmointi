// BEGIN SOLUTION
import numerotiedustelu.Numerotiedustelu;
import java.util.Scanner;
// END SOLUTION

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tästä ohjelmasi käynnistyspiste
        // HUOM: ohjelmassa saa luoda Scanner-olion vain kertaalleen
        // BEGIN SOLUTION
        Scanner lukija = new Scanner(System.in);

        Numerotiedustelu numerotiedustelu = new Numerotiedustelu(lukija);
        numerotiedustelu.kaynnista();
        // END SOLUTION
    }
}

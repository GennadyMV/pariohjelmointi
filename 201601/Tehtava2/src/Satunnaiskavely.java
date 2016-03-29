
import java.util.Random;

public class Satunnaiskavely {

    public static void main(String[] args) {
        // satunnaiskävelijä aloittaa kävelyn annetusta pisteestä
        // ja astuu aina satunnaisesti pohjoiseen, itään, etelään tai länteen
        // jokaisen askeleen todennäköisyys on aina 25%

        // toteuta tässä tehtävässä metodin
        // satunnaiskavely(int x, int y, int askeleita)
        // runko
        
        // metodin tulee simuloida satunnaiskävelyä. kävely aloitetaan
        // annetusta pisteestä, ja kävelyssä tulee ottaa annettu määrä askeleita.
        
        // sijainti tulee tulostaa jokaisen askeleen yhteydessä
        // kun kävely päättyy, kerro myös kävelijän etäisyys lähtökohdasta
        // (suora etäisyys -- tässä pythagoraan lause voi olla hyödyksi)
        // esim.
        satunnaiskavely(0, 0, 5);
        // tulostaa esimerkiksi:
        
        // (0, 0)
        // (1, 0)
        // (1, -1)
        // (1, 0)
        // (0, 0)
        // (-1, 0)
        // 
        // Etäisyys: 1.0
    }

    public static void satunnaiskavely(int x, int y, int askeleita) {
        // BEGIN SOLUTION
        int alkuX = x;
        int alkuY = y;

        Random rnd = new Random();
        System.out.println("(" + x + ", " + y + ")");

        while (askeleita > 0) {
            if (rnd.nextBoolean()) {
                if (rnd.nextBoolean()) {
                    x++;
                } else {
                    x--;
                }
            } else if (rnd.nextBoolean()) {
                y++;
            } else {
                y--;
            }

            System.out.println("(" + x + ", " + y + ")");
            askeleita--;
        }
        System.out.println("");
        System.out.println("Etäisyys: " + Math.sqrt((alkuX - x) * (alkuX - x) + (alkuY - y) * (alkuY - y)));

        // END SOLUTION
    }
}

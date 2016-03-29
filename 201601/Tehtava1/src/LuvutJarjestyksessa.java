
public class LuvutJarjestyksessa {

    public static void main(String[] args) {
        // toteuta alla annetulle metodille
        // luvutJarjestyksessa(int eka, int toka, int kolmas)
        // seuraava toiminnallisuus:

        // metodin tulee palauttaa true jos luvut ovat järjestyksessä 
        // _tai_ käänteisessä järjestyksessä. muulloin metodin tulee palauttaa
        // false.
        
        // alla muutamia esimerkkejä metodin toiminnasta
        System.out.println(luvutJarjestyksessa(10, 17, 19)); // pitäisi olla true
        System.out.println(luvutJarjestyksessa(49, 17, 10)); // pitäisi olla true
        System.out.println(luvutJarjestyksessa(10, 49, 19)); // pitäisi olla false
        System.out.println(luvutJarjestyksessa(0, 0, 1)); // pitäisi olla true
    }

    public static boolean luvutJarjestyksessa(int eka, int toka, int kolmas) {
        // STUB: return false;
        // BEGIN SOLUTION
        if (eka <= toka && toka <= kolmas) {
            return true;
        }

        if (eka >= toka && toka >= kolmas) {
            return true;
        }

        return false;
        // END SOLUTION
    }
}

// SOLUTION FILE
package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {

    private boolean paalla;

    @Override
    public boolean onPaalla() {
        return paalla;
    }

    @Override
    public void paalle() {
        paalla = true;
    }

    @Override
    public void poisPaalta() {
        paalla = false;
    }

    @Override
    public int mittaa() {
        if (!onPaalla()) {
            throw new IllegalStateException();
        }

        Random arpa = new Random();
        return arpa.nextInt(60) - 30;
    }
}
// SOLUTION FILE
package sovellus;

import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori {

    private ArrayList<Sensori> sensorit;
    private ArrayList<Integer> mittaukset;

    public Keskiarvosensori() {
        sensorit = new ArrayList<>();
        mittaukset = new ArrayList<>();
    }

    public void lisaaSensori(Sensori lisattava) {
        sensorit.add(lisattava);
    }

    public List<Integer> mittaukset() {
        return mittaukset;
    }

    @Override
    public boolean onPaalla() {
        for (Sensori sensori : sensorit) {
            if (!sensori.onPaalla()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void paalle() {
        for (Sensori sensori : sensorit) {
            sensori.paalle();
        }
    }

    @Override
    public void poisPaalta() {
        for (Sensori sensori : sensorit) {
            sensori.poisPaalta();
        }
    }

    @Override
    public int mittaa() {
        if (!onPaalla()) {
            throw new IllegalStateException();
        }

        int sum = 0;
        for (Sensori sensori : sensorit) {
            sum += sensori.mittaa();
        }

        int mittaus = sum / sensorit.size();

        mittaukset.add(mittaus);

        return mittaus;
    }
}

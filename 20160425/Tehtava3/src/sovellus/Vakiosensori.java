// SOLUTION FILE
package sovellus;

public class Vakiosensori implements Sensori {

    private int arvo;

    public Vakiosensori(int arvo) {
        this.arvo = arvo;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {
    }

    @Override
    public void poisPaalta() {
    }

    @Override
    public int mittaa() {
        return arvo;
    }
}

// SOLUTION FILE

public class Lento {

    private Lentokone lentokone;
    private String lahtopaikanTunnus;
    private String kohdepaikanTunnus;

    public Lento(Lentokone lentokone, String lahtopaikanTunnus, String kohdepaikanTunnus) {
        this.lentokone = lentokone;
        this.lahtopaikanTunnus = lahtopaikanTunnus;
        this.kohdepaikanTunnus = kohdepaikanTunnus;
    }

    public Lentokone getLentokone() {
        return this.lentokone;
    }

    public String getLahtopaikanTunnus() {
        return this.lahtopaikanTunnus;
    }

    public String getKohdepaikanTunnus() {
        return this.kohdepaikanTunnus;
    }

    @Override
    public String toString() {
        return this.lentokone.toString() + " (" + this.lahtopaikanTunnus + "-" + this.kohdepaikanTunnus + ")";
    }
}
